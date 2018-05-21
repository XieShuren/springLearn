package spring.jmx.client;

import java.io.IOException;

import javax.management.Attribute;
import javax.management.AttributeNotFoundException;
import javax.management.InstanceNotFoundException;
import javax.management.IntrospectionException;
import javax.management.InvalidAttributeValueException;
import javax.management.MBeanException;
import javax.management.MBeanInfo;
import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JmxClientConfiguration.class)
public class ClientTest {

//	@Autowired
//	private MBeanServerConnection serverConnection;
//	
//	@Test
//	public void test1() {
//		try {
//			Integer mBeanCount = serverConnection.getMBeanCount();
//			System.out.println(mBeanCount);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void test2() {
//		try {
//			Object attribute = serverConnection.getAttribute(new ObjectName("xieshuren:name=HelloService"), "Length");
//			System.out.println(attribute);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void test3() {
//		try {
//			serverConnection.setAttribute(new ObjectName("xieshuren:name=HelloService"),new Attribute("Length", "nihao shijie"));
//		} catch (InstanceNotFoundException | AttributeNotFoundException | InvalidAttributeValueException
//				| MalformedObjectNameException | MBeanException | ReflectionException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void test4() {
//		try {
//			MBeanInfo mBeanInfo = serverConnection.getMBeanInfo(new ObjectName("xieshuren:name=HelloService"));
//			System.out.println(mBeanInfo);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Test
//	public void test5() {
//		try {
//			serverConnection.invoke(new ObjectName("xieshuren:name=HelloService"), "doSomething", null, null);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
}
