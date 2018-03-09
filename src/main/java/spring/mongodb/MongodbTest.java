package spring.mongodb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MongoConfig.class)
public class MongodbTest {

	@Autowired
	private MongoOperations mongoOperation;
	
	@Test
	public void testSave() {
		Order order = new Order("1","小明", "VIP");
		mongoOperation.save(order, "Order");
	}
}
