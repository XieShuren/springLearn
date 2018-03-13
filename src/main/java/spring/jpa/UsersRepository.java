package spring.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import spring.jpa.domain.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>,UpdateAddress{

	List<Users> findByName(String name);
	
	Users findASingleUsersByName(String name);
	
	@Query("select u from Users u where u.password like '%dgew%'")
	List<Users> findSomeSpecial();
}
