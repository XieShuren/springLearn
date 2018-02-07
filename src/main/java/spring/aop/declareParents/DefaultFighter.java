package spring.aop.declareParents;

import org.springframework.stereotype.Component;

@Component
public class DefaultFighter implements Fighter{

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("do fighting");
	}
	
}
