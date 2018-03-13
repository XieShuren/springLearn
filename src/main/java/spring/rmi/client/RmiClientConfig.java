package spring.rmi.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import spring.rmi.WeatherService;

@Configuration
public class RmiClientConfig {

	@Bean
	public RmiProxyFactoryBean weatherService() {
		RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
		rmiProxyFactoryBean.setServiceUrl("rmi://localhost/WeatherService");
		rmiProxyFactoryBean.setServiceInterface(WeatherService.class);
		return rmiProxyFactoryBean;
	}
}
