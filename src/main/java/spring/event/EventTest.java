package spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(EventConfig.class);
		annotationConfigApplicationContext.registerShutdownHook();
		annotationConfigApplicationContext.stop();
	}
}
