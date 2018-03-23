package spring.jms.receiver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActiveMQListener {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("classpath:applicationContext_jms.xml");
	}
}
