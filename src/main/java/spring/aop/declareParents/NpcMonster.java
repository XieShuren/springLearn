package spring.aop.declareParents;

import org.springframework.stereotype.Component;

@Component
public class NpcMonster implements Monster{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("i am NpcMonster");
	}

}
