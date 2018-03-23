package spring.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import spring.hessian.server.HessianConfiguration;
import spring.jpa.PersistConfiguration;

@Configuration
@ComponentScan(basePackages="spring.mvc",
excludeFilters= {@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
@Import(PersistConfiguration.class)
public class RootConfig {

}
