package spring.learn.mvc;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.List;


import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;



import com.google.common.collect.Lists;

import spring.mvc.HomeController;
import spring.mvc.bean.User;
import spring.mvc.service.UserRepository;

public class HomeControllerTest {

	@Test
	public void testHomePage() throws Exception {
		HomeController homeController = new HomeController(null);
		MockMvc mockMvc = standaloneSetup(homeController).build();
		mockMvc.perform(get("/hello")).andExpect(view().name("home"));
	}
	
	@Test
	public void testUsersView() throws Exception {
		UserRepository userRepository = mock(UserRepository.class);
		List<User> expectedUsers = createUsers();
		when(userRepository.userList()).thenReturn(expectedUsers);
		HomeController homeController = new HomeController(userRepository);
		MockMvc mockMvc = standaloneSetup(homeController).build();
		mockMvc.perform(get("/list")).andExpect(model().attributeExists("beanList"))
											.andExpect(model().attribute("beanList", hasItems(createUsers().toArray())))
											.andExpect(view().name("view"));
	}
	
	@Test
	public void testUsersWithIndex() throws Exception {
		UserRepository userRepository = mock(UserRepository.class);
		List<User> expectedUsers = createUsers();
		when(userRepository.userList(10, 20)).thenReturn(expectedUsers);
		HomeController homeController = new HomeController(userRepository);
		MockMvc mockMvc = standaloneSetup(homeController).build();
		mockMvc.perform(get("/listWithIndex?start=10&end=20")).andExpect(model().attributeExists("beanList"))
											.andExpect(model().attribute("beanList", hasItems(expectedUsers.toArray())))
											.andExpect(view().name("view"));
	}
	
	@Test
	public void testUserWithId() throws Exception{
		HomeController homeController = new HomeController(null);
		MockMvc mockMvc = standaloneSetup(homeController).build();
		mockMvc.perform(get("/listWithId/-1")).andExpect(view().name("view")).andExpect(model().attributeExists("beanList")).andExpect(model().attribute("beanList", hasItems(new User(234, "小偶"))));
	}
	
	private List<User> createUsers() {
		return Lists.newArrayList(new User(1, "小明"), new User(2, "小芳"), new User(3, "小杰"));
	}
}
