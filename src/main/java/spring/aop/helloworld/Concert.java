package spring.aop.helloworld;

import org.springframework.stereotype.Component;

@Component
public class Concert implements Performance{

	@Override
	public void perform() throws Exception {
		System.out.println("歌手演唱中。。。");
	}

	@Override
	public void audienceEnter(TestBean bean, int count) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
