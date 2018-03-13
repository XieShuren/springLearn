//package spring.mvc;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter{
//
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("xieshuren").password("{noop}1234").roles("USER");
//	}
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.formLogin().loginPage("/hello").loginProcessingUrl("/login").and().
//		authorizeRequests().antMatchers("/list", "/listWithIndex","/listWithId/**").authenticated().anyRequest().permitAll().and().requiresChannel()
//		.and().rememberMe().tokenValiditySeconds(60*3).key("springLearn")
//		.and().logout().logoutSuccessUrl("/hello");
//	}
//}