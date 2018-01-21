package spring.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompanyConfig {

	@Bean
	public Computer getComputer() {
		return new Computer();
	}
	
	@Bean
	public Bicycle getBicycle() {
		return new Bicycle();
	}
	
//	@Bean
//	public Company getCompany(Computer computer) {
//		return new Company(computer);
//	}
}
