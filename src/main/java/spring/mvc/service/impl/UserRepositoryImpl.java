package spring.mvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import spring.mvc.bean.User;
import spring.mvc.service.UserRepository;

@Service
public class UserRepositoryImpl implements UserRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String INSERT = "insert into users(id,name,address,password) values(?,?,?,?)";
	public JdbcTemplate getTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate;
	}
	
	@Override
	public void insert(User user) {
		jdbcTemplate.update(INSERT, user.getId(),user.getName(),user.getPassword(),user.getEmail());
	}
}
