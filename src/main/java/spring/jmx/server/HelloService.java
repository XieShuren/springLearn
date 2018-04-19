package spring.jmx.server;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import com.sun.org.glassfish.gmbal.ManagedOperation;

@Component
@ManagedResource("xieshuren:name=HelloService")
public class HelloService {

	private String length = "hello world";

	@ManagedAttribute
	public String getLength() {
		return length;
	}
	
	//@ManagedAttribute
	public void setLength(String length) {
		this.length = length;
	}

	@ManagedOperation
	public void doSomething() {
		System.out.println("测试测试");
	}
}
