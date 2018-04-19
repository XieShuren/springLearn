package spring.rmi.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RmiServer {

	public static void main(String[] args) {
		//new AnnotationConfigApplicationContext(RmiServerConfig.class);
		new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
}
