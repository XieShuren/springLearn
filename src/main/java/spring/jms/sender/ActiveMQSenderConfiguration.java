package spring.jms.sender;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:applicationContext_jms.xml")
public class ActiveMQSenderConfiguration {

}
