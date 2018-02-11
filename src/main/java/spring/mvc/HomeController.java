package spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mvc.bean.User;
import spring.mvc.service.UserRepository;

@Controller
public class HomeController {

	@RequestMapping(value="/home/hello", method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	private UserRepository repository;
	
	@Autowired
	public HomeController(UserRepository repository) {
		super();
		this.repository = repository;
	}


	@RequestMapping(value="/home/list", method=RequestMethod.GET)
	public String users(Model model) {
		List<User> userList = repository.userList();
		model.addAttribute("beanList", userList);
		return "view";
	}
	
}
