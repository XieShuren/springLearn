package spring.mvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.jmx.export.MBeanExporter;
import org.springframework.jmx.support.ConnectorServerFactoryBean;
import org.springframework.remoting.rmi.RmiRegistryFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import spring.jpa.PersistConfiguration;

@Configuration
@ComponentScan(basePackages="spring.mvc",
excludeFilters= {@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
@Import(PersistConfiguration.class)
public class RootConfig {

	@Bean
	public MBeanExporter mBeanExporter(HomeController homeController) {
		MBeanExporter mBeanExporter = new MBeanExporter();
		Map<String, Object> beans = new HashMap<String, Object>();
		beans.put("xieshuren:name=HomeController", beans);
		mBeanExporter.setBeans(beans);
		return mBeanExporter;
	}
	
	@Bean
	public RmiRegistryFactoryBean rmiRegistryFB() {
		RmiRegistryFactoryBean rmiRegistryFactoryBean = new RmiRegistryFactoryBean();
		rmiRegistryFactoryBean.setPort(1099);
		return rmiRegistryFactoryBean;
	}
	
	@Bean
	public ConnectorServerFactoryBean connectorServerFactory() {
		ConnectorServerFactoryBean csfb = new ConnectorServerFactoryBean();
		csfb.setServiceUrl("service:jmx:rmi:///jndi/rmi://localhost:1099/server");
		return csfb;
	}
}
