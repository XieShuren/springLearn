package spring.di.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class Shopkeeper {
	private String name = "unKnow";

	public void setName(String name) {
		this.name = name;
	}
	
	public void doSale() {
		System.out.println(name +" is sale shoes");
	}
}
