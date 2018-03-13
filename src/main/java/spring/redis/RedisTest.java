package spring.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RedisConfiguration.class)
public class RedisTest {

	@Autowired
	private RedisTemplate<String, Student> redisTemplate;
	
	@Test
	public void testSave() {
		Student student = new Student(1,"ming","小学一年级");
		redisTemplate.opsForValue().set(student.getId()+"", student);
	}
	
	@Test
	public void testQuery() {
		Student student = redisTemplate.opsForValue().get(1L);
		System.out.println(student);
	}
	
	@Test
	public void testDelete() {
		redisTemplate.delete("1");
	}
	
}
