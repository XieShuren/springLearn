package spring.aop.helloworld;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceManager {
	
	int count = 0;
	
	@AfterReturning("execution(* spring.aop.helloworld.Audience.takeSeat(..))")
	public void audienceCount() {
		System.out.println("演唱会目前观众：1人");
	}
}
