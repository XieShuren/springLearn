package spring.di.spEL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SpElConfig.class)
public class SpELTest {

	@Autowired
	private SpELBean bean1;
	
	@Test
	public void test1() {
		System.out.println(bean1.getTime());
		System.out.println(bean1.getId());
		System.out.println(bean1.getChildrens());
	}
}
