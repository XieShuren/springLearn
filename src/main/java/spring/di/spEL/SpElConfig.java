package spring.di.spEL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpElConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	public SpELBean getSpELBean(@Value("#{paramBean.id}") int id, @Value("#{'xieshuren'}") String name, @Value("#{T(System).currentTimeMillis()}") long time, @Value("#{paramBean.getList()}") List<String> list) {
		SpELBean spELBean = new SpELBean();
		spELBean.setId(id);
		spELBean.setName(name);
		spELBean.setTime(time);
		spELBean.setChildrens(list);
		return spELBean;
	}
	
	@Bean("paramBean")
	public ParamBean createParamBean() {
		ParamBean paramBean = new ParamBean();
		List<String> list = new ArrayList<String>();
		list.add("zha");
		list.add("zha");
		list.add("hui");
		paramBean.setId(123);
		paramBean.setList(list);
		return paramBean;
	}
}
