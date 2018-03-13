package spring.rmi.server;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RmiServer {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(RmiServerConfig.class);
	}
}
