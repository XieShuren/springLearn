package spring.di.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CondtionConfig {

	@Bean
	@XieShuren("dsfds")
	@Conditional(StudentInitCondition.class)
	public Student getStudent() {
		Student student = new Student();
		student.setId(1);
		return student;
	}
}
