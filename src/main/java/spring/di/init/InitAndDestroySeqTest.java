package spring.di.init;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InitAndDestroySeqTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InitAndDestroySeqConfig.class);
		context.close();
	}

}
