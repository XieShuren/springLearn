package spring.aop.helloworld;

public interface Performance {

	public void perform() throws Exception;
	
	public void audienceEnter(TestBean bean, int count) throws Exception;
}
