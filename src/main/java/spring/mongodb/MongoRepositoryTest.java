package spring.mongodb;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MongoConfig2.class)
public class MongoRepositoryTest {

	@Autowired
	private OrderRepository orderRepository;
	
	@Test
	public void test1() {
		List<Order> findAll = orderRepository.findAll();
		System.out.println(findAll);
	}
}
