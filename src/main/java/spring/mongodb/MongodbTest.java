package spring.mongodb;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MongoConfig2.class)
public class MongodbTest {

	@Autowired
	private MongoOperations mongoOperation;
	
	@Test
	public void testSave() {
		Order order = new Order("3","小和", "Common");
		mongoOperation.save(order, "Order");
	}
	
	@Test
	public void findById() {
		Order order = mongoOperation.findById("1", Order.class,"Order");
		System.out.println(order);
	}
	
	@Test
	public void query() {
		List<Order> list = mongoOperation.find(Query.query(Criteria.where("type").is("Common")), Order.class, "Order");
		System.out.println(list);
	}
}
