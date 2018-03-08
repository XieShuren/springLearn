package spring.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class UsersRepositoryImpl implements UpdateAddress{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void updateAddress(String address) {
		// TODO Auto-generated method stub
		String sql = "update Users users set users.address='"+address+"'";
		em.createQuery(sql).executeUpdate();
	}

}
