package zhujie;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;

public class SpringTest {
	
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(aspectConfig.class);
		UserService bean = ac.getBean(UserService.class);
		bean.printUser();
	}
}
