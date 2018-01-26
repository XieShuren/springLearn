package spring.di.qualifier;

import org.springframework.stereotype.Component;

@Component
@Heated
@Healthable
public class Vegetables implements Food{

	@Override
	public void cook() {
		System.out.println("Mother is cooking vegetables for me");
	}

}
