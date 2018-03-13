package spring.rmi.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import spring.rmi.WeatherService;

@Configuration
@ComponentScan
public class RmiServerConfig {

	@Bean
	public RmiServiceExporter rmiExporter(WeatherService weatherService) {
		RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
		rmiServiceExporter.setService(weatherService);
		rmiServiceExporter.setServiceName("WeatherService");
		rmiServiceExporter.setServiceInterface(WeatherService.class);
		return rmiServiceExporter;
	}
}
