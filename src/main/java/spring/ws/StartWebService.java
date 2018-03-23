package spring.ws;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StartWebService {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(WebserviceConfiguration.class);
	}
}
