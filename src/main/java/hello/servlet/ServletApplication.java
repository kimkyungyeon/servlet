package hello.servlet;

import hello.servlet.web.springmvc.v1.SpringMemberFormControllerV1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

//	@Bean
//	ViewResolver internalResourceViewResolver() {
//		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
//	}

//	@Bean
//	SpringMemberFormControllerV1 springMemberFormControllerV1() {
//		return new SpringMemberFormControllerV1();
//	}
}
