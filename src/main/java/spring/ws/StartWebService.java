package spring.ws;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class StartWebService {

	public static void main(String[] args) {
		//new AnnotationConfigApplicationContext(WebserviceConfiguration.class);
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		xmlBeanFactory.getBean("abc");
	}
}
