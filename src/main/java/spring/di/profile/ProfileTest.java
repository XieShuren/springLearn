package spring.di.profile;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ProfileSpringConfig.class)
@ActiveProfiles("test")
public class ProfileTest {
	
	@Autowired(required=false)
	private Customer customer;
	
	@Autowired(required=false)
	private Shopkeeper shopkeeper;
	
	@Test
	public void test1() {
		Assert.assertNotNull(customer);
		customer.doShop();
	}
	
	@Test
	public void test2() {
		Assert.assertNotNull(shopkeeper);
		shopkeeper.doSale();
	}
}
