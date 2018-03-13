package spring.rmi.server;

import org.springframework.stereotype.Component;

import spring.rmi.WeatherService;

@Component
public class WeatherServiceImpl implements WeatherService{

	@Override
	public String todayWeather(String area) {
		return area+"今天天气10-20度";
	}

}
