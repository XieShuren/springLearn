package spring.mvc;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import spring.jpa.UsersRepository;
import spring.jpa.domain.Users;
import spring.mvc.bean.UsersNotFoundException;

@RestController
@RequestMapping("/rest")
public class RestfulController {

	@Autowired
	private UsersRepository jpaRepository;
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Users getByUserId(@PathVariable int id) {
		List<Users> findById = jpaRepository.findById(id);
		if (findById == null || findById.isEmpty())
			throw new UsersNotFoundException(id);
		else
			return findById.get(0);
	}
	
	@ExceptionHandler(UsersNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	private String usersNotFound(UsersNotFoundException exception) {
		return "[userId="+exception.getUserId()+"] not found";
	}
	
	@RequestMapping(value="/saveUsers", method=RequestMethod.GET)
	public ResponseEntity<Users> saveUsers(UriComponentsBuilder ucb) {
		HttpHeaders httpHeaders = new HttpHeaders();
		URI uri = ucb.path("/rest/").path("1").build().toUri();
		httpHeaders.setLocation(uri);
		return new ResponseEntity<Users>(jpaRepository.findById(1).get(0), httpHeaders, HttpStatus.CREATED);
	}
}
