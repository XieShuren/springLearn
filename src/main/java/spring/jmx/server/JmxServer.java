package spring.jmx.server;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JmxServer {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(ServerConfiguration.class);
	}
}
