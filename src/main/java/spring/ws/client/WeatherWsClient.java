package spring.ws.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.rmi.WeatherService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=WeatherWsClientConfiguration.class)
public class WeatherWsClient {

	@Autowired
	private WeatherService weatherService;
	
	@Test
	public void test1() {
		weatherService.todayWeather("Beijing");
	}
}
