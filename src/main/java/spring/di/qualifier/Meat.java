package spring.di.qualifier;

import org.springframework.stereotype.Component;

@Component
@Heated
public class Meat implements Food{

	@Override
	public void cook() {
		System.out.println("I'm eatting beef at barbecue");
	}

}
