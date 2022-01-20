package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stone.springmvc.presentation.TodoController;
import com.stone.springmvc.service.TodoService;
import com.stone.springmvc.dataservice.TodoDAO;

@Configuration
public class BeanConfig {
	@Bean
	public TodoController TodoController( ) {//@Controller 컨트롤링
		return new TodoController( );
	}
	@Bean
	public TodoService TodoService( ) { //@Service 업무로직
		return new TodoService( );
	}
	@Bean
	public TodoDAO TodoDAO( ) { //@Repository 데이터저장
		return new TodoDAO( );
	}
	
}
