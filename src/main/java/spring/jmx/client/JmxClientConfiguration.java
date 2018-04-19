package spring.jmx.client;

import java.net.MalformedURLException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.support.MBeanServerConnectionFactoryBean;

@Configuration
public class JmxClientConfiguration {

	@Bean
	public MBeanServerConnectionFactoryBean connectionFactoryBean() {
		MBeanServerConnectionFactoryBean mBeanServerConnectionFactoryBean = new MBeanServerConnectionFactoryBean();
		try {
			mBeanServerConnectionFactoryBean.setServiceUrl("service:jmx:rmi:///jndi/rmi://192.168.0.140:1099/server");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mBeanServerConnectionFactoryBean;
	}
}
