package spring.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class CompanyTest {
	
	private Item computer;
	
	@Autowired(required=false)
	private Company company;
	
	@Autowired(required=false)
	public void setComputer2(Computer computer) {
		this.computer = computer;
	}
	@Test
	public void assertNotNull() {
		company.process();
	}
}
