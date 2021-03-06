package spring.rmi.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.rmi.WeatherService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=RmiClientConfig.class)
public class RmiClientTest {

	@Autowired
	private WeatherService weatherService;
	
	@Test
	public void test1() {
		System.out.println(weatherService.todayWeather("guangzhou"));
	}
}
