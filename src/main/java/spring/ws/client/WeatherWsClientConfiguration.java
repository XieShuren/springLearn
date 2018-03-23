package spring.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import spring.rmi.WeatherService;

@Configuration
public class WeatherWsClientConfiguration {
	
	@Bean
	public JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean() {
		JaxWsPortProxyFactoryBean proxyFactoryBean = new JaxWsPortProxyFactoryBean();
		try {
			proxyFactoryBean.setWsdlDocumentUrl(new URL("http://localhost:8080/weatherService?wsdl"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		proxyFactoryBean.setServiceName("weatherService");
		proxyFactoryBean.setPortName("WeatherWsServicePort");
		proxyFactoryBean.setServiceInterface(WeatherService.class);
		proxyFactoryBean.setNamespaceUri("http://ws.spring/");
		return proxyFactoryBean;
	}
}
