package spring.hessian.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.rmi.WeatherService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=HessianClientConfiguration.class)
public class HessianClientTest {

	@Autowired
	private WeatherService weatherService;
	
	@Test
	public void test1() {
		System.out.println(weatherService.todayWeather("Tokoy"));
	}
}
