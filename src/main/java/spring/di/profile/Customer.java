package spring.di.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class Customer {
	
	private String name = "unKnow";

	public void setName(String name) {
		this.name = name;
	}
	
	public void doShop() {
		System.out.println(name +" is shopping");
	}
}
