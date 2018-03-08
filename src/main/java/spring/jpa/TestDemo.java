package spring.jpa;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import spring.jpa.domain.Users;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=PersistConfiguration.class)
@Transactional
@Rollback(false)
public class TestDemo {

	@Autowired
	private TestRepository repository;
	
	@Autowired
	private UsersRepository jpaRepository;
	
	
	@Test
	public void insertUser() {
		repository.insert(new Users(11, "t35qgdsa", "nhwafw", "gsdgewqt"));
	}
	@Test
	public void findUser() {
		Users findById = repository.findById(1);
		System.out.println(findById);
	}
	
	@Test
	public void updateUser() {
		repository.update(new Users(1, "t35qgdsa", "nhwafw", "gsdgewqt"));
	}
	
	@Test
	public void jpaInsert() {
		jpaRepository.save(new Users(12, "t35qgdsa", "nhwafw", "gsdgewqt"));
	}
	
	@Test
	public void findByName() {
		List<Users> findByName = jpaRepository.findByName("t35qgdsa");
		System.out.println(findByName);
	}
	
	@Test
	public void findByQuery() {
		List<Users> findSomeSpecial = jpaRepository.findSomeSpecial();
		System.out.println(findSomeSpecial);
	}
	
	@Test
	public void updateAddress() {
		jpaRepository.updateAddress("guangdong");
	}
}
