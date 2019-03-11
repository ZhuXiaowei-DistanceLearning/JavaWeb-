package zhujie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("zhujie.*")
public class aspectConfig {
	@Bean
	public MyAspect getMyAspect() {
		return new MyAspect();
	}
}	
