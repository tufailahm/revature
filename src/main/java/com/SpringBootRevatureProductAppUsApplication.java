package com;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.revature.pms.model.Product;

@SpringBootApplication
public class SpringBootRevatureProductAppUsApplication {
	

	public static void main(String[] args) {
	
		ConfigurableApplicationContext context =  SpringApplication.run(SpringBootRevatureProductAppUsApplication.class, args);
		
		String allBeans[] = context.getBeanDefinitionNames();
		
		Arrays.sort(allBeans);
		
		//This will display all the beans injected into my application - by default
		for(String bean:allBeans)
		{
			System.out.println(bean);
		}
	}
}
