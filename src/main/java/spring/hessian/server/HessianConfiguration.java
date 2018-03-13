package spring.hessian.server;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import spring.rmi.WeatherService;
import spring.rmi.server.WeatherServiceImpl;

@Configuration
public class HessianConfiguration {

	@Bean
	public WeatherService weatherService() {
		WeatherServiceImpl weatherServiceImpl = new WeatherServiceImpl();
		return weatherServiceImpl;
	}
	@Bean
	public HessianServiceExporter hessianServiceExporter(WeatherService weatherService) {
		HessianServiceExporter serviceExporter = new HessianServiceExporter();
		serviceExporter.setService(weatherService);
		serviceExporter.setServiceInterface(WeatherService.class);
		return serviceExporter;
	}
	
	@Bean
	public HandlerMapping hessianMapping() {
		SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
		Properties prop = new Properties();
		prop.setProperty("/weather.service", "hessianServiceExporter");
		simpleUrlHandlerMapping.setMappings(prop);
		return simpleUrlHandlerMapping;
	}
}
