package spring.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.rmi.WeatherService;

@Component
@WebService(serviceName="weatherService")
public class WeatherWsService {

	@Autowired
	private WeatherService weatherService;
	
	@WebMethod
	public String todayWeather(String area) {
		return weatherService.todayWeather(area);
	}
}
