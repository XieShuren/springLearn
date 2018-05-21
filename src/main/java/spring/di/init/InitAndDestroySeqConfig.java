package spring.di.init;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class InitAndDestroySeqConfig {

	@Bean(destroyMethod="destroyMethod",initMethod="initMethod")
	public InitAndDestroySeqBean initAndDestroySeqBean() {
		return new InitAndDestroySeqBean();
	}
}
