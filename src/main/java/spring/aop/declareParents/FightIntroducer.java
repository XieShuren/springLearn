package spring.aop.declareParents;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FightIntroducer {

	@DeclareParents(value="spring.aop.declareParents.Monster+",defaultImpl=DefaultFighter.class)
	public static Fighter fight;
}
