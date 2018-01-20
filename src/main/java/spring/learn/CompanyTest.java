package spring.learn;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CompanyConfig.class)
public class CompanyTest {
	
	private Item computer;
	
	@Autowired(required=false)
	public void setComputer2(Item computer) {
		this.computer = computer;
	}
	@Test
	public void assertNotNull() {
		computer.name();
	}
}
