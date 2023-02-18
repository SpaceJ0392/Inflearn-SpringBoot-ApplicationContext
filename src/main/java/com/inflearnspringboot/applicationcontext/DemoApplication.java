package com.inflearnspringboot.applicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//일부러 SpringBootApplication 어노테이션을 제거해서, 보다 엣날 방법으로 빈을 사용해 볼 것.
public class DemoApplication {

	public static void main(String[] args) {
		//고전적인 방법으로 Spring Bean 설정 파일을 만들어 IoC를 구현해 볼 것.
		//xmlBeanConfig();

		//자바 설정 파일을 이용한 방법
		javaBeanConfig();
	}

	public static void xmlBeanConfig(){
		//Bean 설정 파일을 component-scan 방시으로 바꾸어도 동일하게 작동.
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Application.xml");
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
		BookService bookService = (BookService) applicationContext.getBean("bookService");
		System.out.println(bookService.bookRepository != null);
	}

	private static void javaBeanConfig() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
		BookService bookService = (BookService) applicationContext.getBean("bookService");
		System.out.println(bookService.bookRepository != null);
	}
}
