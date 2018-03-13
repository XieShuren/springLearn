package spring.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import spring.hessian.server.HessianConfiguration;

@Configuration
@ComponentScan(basePackages="spring.mvc",
excludeFilters= {@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
@Import(HessianConfiguration.class)
public class RootConfig {

}
