package zhujie;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* zhujie.impl.*.*(..))")
	public void before() {
		System.out.println("before....");
	}
	
	@After("execution(* zhujie.impl.*.*(..))")
	public void after() {
		System.out.println("after....");
	}
	
	@AfterThrowing("execution(* zhujie.impl.*.*(..))")
	public void afterthrowing() {
		System.out.println("beforeThrowing....");
	}
	
	@AfterReturning("execution(* zhujie.impl.*.*(..))")
	public void afterreturning() {
		System.out.println("afterreturning....");
	}
	
	@Around("execution(* zhujie.impl.*.*(..))")
	public void around(ProceedingJoinPoint jp) {
		System.out.println("before....jp");
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("after....jp");
	}
}
