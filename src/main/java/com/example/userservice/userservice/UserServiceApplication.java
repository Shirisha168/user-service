package com.example.userservice.userservice;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserServiceApplication {

	private static ApplicationContext applicationContext;


	public static void main(String[] args) {
		String str = "Thaurn";
		System.out.println(str.length());
		applicationContext = SpringApplication.run(UserServiceApplication.class, args);
		displayAllBeans();
	}

	public static void displayAllBeans(){
		String[] allBeans = applicationContext.getBeanDefinitionNames();
		for(String beanNames : allBeans){
			System.out.println("Beans present in application context " + beanNames);
		}
	}

}
