package spring.mvc;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.mvc.bean.User;
import spring.mvc.service.UserRepository;

@Controller
public class RegisterController {

	private transient Map<Integer, User> users = new HashMap<Integer, User>();
	
	@Autowired
	private UserRepository repository;
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String showRegisterForm(Model model) {
		model.addAttribute(new User());
		return "user/registerForm";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@Valid User user, Errors errors) {
		if (errors.hasErrors())
			return "user/registerForm";
		users.put(user.getId(), user);
		repository.insert(user);
		return "redirect:/profile/"+user.getId();
	}
	
	@RequestMapping(value="/profile/{userId}", method=RequestMethod.GET)
	public String userProfile(@PathVariable int userId, Model model) {
		model.addAttribute("user", users.get(userId));
		return "user/profile";
	}
}
