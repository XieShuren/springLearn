package spring.ws;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

import spring.rmi.WeatherService;
import spring.rmi.server.RmiServerConfig;
import spring.rmi.server.WeatherServiceImpl;

@Configuration
@ComponentScan
public class WebserviceConfiguration {

	@Bean
	public WeatherService weatherService() {
		WeatherServiceImpl weatherServiceImpl = new WeatherServiceImpl();
		return weatherServiceImpl;
	}
	
	@Bean
	public SimpleJaxWsServiceExporter wsServiceExporter() {
		return new SimpleJaxWsServiceExporter();
	}

}
