package spring.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

	@PersistenceUnit
	private EntityManagerFactory emf;
	
}
