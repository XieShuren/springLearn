package spring.di.qualifier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=QualifierConfig.class)
public class QualifierTest {
	
	@Autowired
	private Food[] foods;
	
	@Test
	public void test1() {
		for (Food food : foods) {
			food.cook();
		}
		
	}
	
}
