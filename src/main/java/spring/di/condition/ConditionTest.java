package spring.di.condition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CondtionConfig.class)
public class ConditionTest {

	private Student s;
	
	@Autowired
	private void setStudent(Student s) {
		this.s = s;
	}
	
	@Test
	public void test1() {
		s.study();
	}
}
