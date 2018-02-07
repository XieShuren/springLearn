package spring.aop.helloworld;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_aop.xml")
public class AopTest {
	
	@Autowired
	private Performance performance;
	
	private Audience audience;
	@Autowired
	private void audience(Audience audience) {
		this.audience = audience;
	}
	
	@Test
	public void test1() {
		try {
			audience.takeSeat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
