package spring.mvc.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.google.common.collect.Lists;

import spring.mvc.bean.User;

public interface UserRepository {

	default public List<User> userList() {
		return Lists.newArrayList(new User(1, "小明"), new User(2, "小芳"), new User(3, "小杰"));
	}
	
	default public List<User> userList(int start, int end) {
		return Lists.newArrayList(new User(start, "小强"), new User(end, "小伟"));
	}
	
	public JdbcTemplate getTemplate();
	
	public void insert(User user);
}
