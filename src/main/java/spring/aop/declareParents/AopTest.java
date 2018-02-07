package spring.aop.declareParents;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_aop.xml")
public class AopTest {
	
	@Autowired
	private Monster monster;
	
	
	@Test
	public void test1() {
		System.out.println(monster instanceof Fighter);
	}
}
