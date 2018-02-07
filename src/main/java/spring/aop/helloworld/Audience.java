package spring.aop.helloworld;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
public class Audience {

	@Pointcut("execution(** spring.aop.helloworld.Performance.perform(..))")
	public void performance() {}
	//@Before("performance()")
	public void takeSeat() {
		System.out.println("观众入场");
	}
	//@AfterReturning("performance()")
	public void clapHands() {
		System.out.println("观众欢呼");
	}
	//@AfterThrowing("performance()")
	public void refunds() {
		System.out.println("观众退票");
	}
	
	@Around("performance()")
	public void process(ProceedingJoinPoint point) {
		takeSeat();
		clapHands();
		try {
			point.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			refunds();
		}
	}
}
