package spring.hessian.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

import spring.rmi.WeatherService;

@Configuration
public class HessianClientConfiguration {

	@Bean
	public HessianProxyFactoryBean hessianProxyFactoryBean() {
		HessianProxyFactoryBean hessianProxyFactoryBean = new HessianProxyFactoryBean();
		hessianProxyFactoryBean.setServiceUrl("http://localhost:8080/springLearn/weather.service");
		hessianProxyFactoryBean.setServiceInterface(WeatherService.class);
		return hessianProxyFactoryBean;
	}
}
