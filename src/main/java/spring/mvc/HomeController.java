package spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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


	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String users(Model model) {
		List<User> userList = repository.userList();
		model.addAttribute("beanList", userList);
		return "view";
	}
	
	@RequestMapping(value="/listWithIndex", method=RequestMethod.GET)
	public String users(@RequestParam(value="start", defaultValue="1") int start, @RequestParam(value="end", defaultValue="10") int end, Model model) {
		List<User> userList = repository.userList(start, end);
		model.addAttribute("beanList", userList);
		return "view";
	}
	
}
