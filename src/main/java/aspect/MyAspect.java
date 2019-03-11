package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;

public class MyAspect {
	public void before() {
		System.out.println("before....");
	}

	public void after() {
		System.out.println("after....");
	}

	public void afterthrowing() {
		System.out.println("beforeThrowing....");
	}

	public void afterreturning() {
		System.out.println("afterreturning....");
	}
	
	public void around(ProceedingJoinPoint jp) {
		System.out.println("环绕前置通知");
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("环绕后置通知");
	}
}
