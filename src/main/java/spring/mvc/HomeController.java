package spring.mvc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;

import spring.mvc.bean.User;
import spring.mvc.service.UserRepository;

@Controller
public class HomeController {

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	private UserRepository repository;
	
	@Autowired
	public HomeController(UserRepository repository) {
		super();
		this.repository = repository;
	}


	@RequestMapping(value="/list", method=RequestMethod.GET, produces="text/xml")
	public @ResponseBody List<User> users(Model model) {
		List<User> userList = repository.userList();
		try {
			Connection connection = repository.getTemplate().getDataSource().getConnection();
			Statement stat = connection.createStatement();
			ResultSet resultSet = stat.executeQuery("select password from users");
			while(resultSet.next()) {
				String pwd = resultSet.getString("password");
				System.out.println(pwd);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		model.addAttribute("beanList", userList);
//		return "view";
		return userList;
	}
	
	@RequestMapping(value="/listWithIndex", method=RequestMethod.GET)
	public String users(@RequestParam(value="start", defaultValue="1") int start, @RequestParam(value="end", defaultValue="10") int end, Model model) {
		List<User> userList = repository.userList(start, end);
		model.addAttribute("beanList", userList);
		return "view";
	}
	
	@RequestMapping(value="/listWithId/{id}", method=RequestMethod.GET)
	public String user(@PathVariable int id, Model model) {
		List<User> userList = null;
		if (id > 0) {
			String userName = id%2==0?"小偶":"小鸡";
			userList = Lists.newArrayList(new User(id, userName));
		}
		model.addAttribute("beanList", userList);
		return "view";
	}
	
}
