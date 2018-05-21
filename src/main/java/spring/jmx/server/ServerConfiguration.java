package spring.jmx.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.annotation.AnnotationMBeanExporter;
import org.springframework.jmx.support.ConnectorServerFactoryBean;
import org.springframework.remoting.rmi.RmiRegistryFactoryBean;

public class ServerConfiguration {

//	@Bean
//	public HelloService helloService() {
//		return new HelloService();
//	}
//	
//	@Bean
//	public MBeanExporter mBeanExporter(HelloService helloService) {
//		MBeanExporter mBeanExporter = new MBeanExporter();
//		Map<String, Object> beans = new HashMap<String, Object>();
//		beans.put("xieshuren:name=HelloService", beans);
//		mBeanExporter.setBeans(beans);
//		return mBeanExporter;
//	}
	
//	@Bean
//	public AnnotationMBeanExporter annotationMBeanExporter() {
//	    return new AnnotationMBeanExporter();
//	}
//	
//	@Bean
//	public RmiRegistryFactoryBean rmiRegistryFB() {
//		RmiRegistryFactoryBean rmiRegistryFactoryBean = new RmiRegistryFactoryBean();
//		rmiRegistryFactoryBean.setPort(1099);
//		return rmiRegistryFactoryBean;
//	}
//	
//	@Bean
//	public ConnectorServerFactoryBean connectorServerFactory() {
//		ConnectorServerFactoryBean csfb = new ConnectorServerFactoryBean();
//		csfb.setServiceUrl("service:jmx:rmi:///jndi/rmi://192.168.0.140:1099/server");
//		return csfb;
//	}
	
	
}
