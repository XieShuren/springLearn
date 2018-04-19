package spring.jms.sender;

//import javax.jms.JMSException;
//import javax.jms.Message;
//import javax.jms.Session;
//import javax.jms.TextMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.MessageCreator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import spring.jpa.domain.Users;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext_jms.xml")
public class SenderTest {

	@Autowired
	private JmsOperations jmsOperation;
	
	@Test
	public void send() {
		jmsOperation.convertAndSend(new Users(3, "erwr", "bgfed", "ntth"));
	}
	
//	@Test
//	public void sendV2() {
//		jmsOperation.send(new MessageCreator() {
//
//			@Override
//			public Message createMessage(Session session) throws JMSException {
//				ObjectMapper objectMapper = new ObjectMapper();
//				String writeValueAsString = null;
//				try {
//					writeValueAsString = objectMapper.writeValueAsString(new Users(1, "erwr", "bgfed", "ntth"));
//				} catch (JsonProcessingException e) {
//					e.printStackTrace();
//				}
//				TextMessage message = session.createTextMessage(writeValueAsString);
//				message.setStringProperty("beanType", "users");
//				return message;
//			}
//			
//		});
//	}
	
	@Test
	public void receive() {
		Users users = (Users) jmsOperation.receiveAndConvert();
		System.out.println(users);
	}
}
