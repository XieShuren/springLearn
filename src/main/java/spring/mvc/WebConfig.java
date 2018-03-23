package spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
@EnableWebMvc
@ComponentScan("spring.mvc")
public class WebConfig implements WebMvcConfigurer{

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		resolver.setOrder(1);
		return resolver;
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
//	@Bean
//	public ViewResolver cnViewResolver(ContentNegotiationManager manager) {
//		ContentNegotiatingViewResolver negotiatingViewResolver = new ContentNegotiatingViewResolver();
//		negotiatingViewResolver.setContentNegotiationManager(manager);
//		negotiatingViewResolver.setOrder(1);
//		return negotiatingViewResolver;
//	}
//	
//	@Override
//	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//		// TODO Auto-generated method stub
//		configurer.defaultContentType(MediaType.APPLICATION_JSON);
//	}
//	@Bean
//	public ContentNegotiationManagerFactoryBean factoryBean() {
//		ContentNegotiationManagerFactoryBean factoryBean = new ContentNegotiationManagerFactoryBean();
//		factoryBean.setDefaultContentType(MediaType.TEXT_HTML);
//		return factoryBean;
//	}
	
//	@Bean
//	public ViewResolver beanNameViewResolver() {
//		BeanNameViewResolver viewResolver = new BeanNameViewResolver();
//		viewResolver.setOrder(2);
//		return viewResolver;
//	}
//	
//	@Bean
//	public View list() {
//		return new MappingJackson2JsonView();
//	}
}
