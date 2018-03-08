package spring.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import spring.jpa.domain.Users;

@Repository
public class TestRepository {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(Users user) {
		System.out.println("hiahiahia");
		em.persist(user);
	}
	
	public Users findById(int id) {
		return em.find(Users.class, id);
	}
	
	public void update(Users user) {
		em.merge(user);
	}
	
}
