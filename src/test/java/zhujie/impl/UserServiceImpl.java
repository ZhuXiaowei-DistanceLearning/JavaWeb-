package zhujie.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	public void printUser() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		for (int i = 0; i < 5; i++) {
			System.out.println("测试aspect切面，这是printUser方法");
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println("当前程序耗时：" + (endTime - startTime) + "ms");
	}

}
