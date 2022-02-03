package com.zee.zee5app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zee.zee5app.repository.UserRepository;

@SpringBootApplication
public class Main2 {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(Zee5appspringbootApplication.class, args);
		
		UserRepository repository = applicationContext.getBean(UserRepository.class);
		System.out.println(repository.existsByEmail("vibhor123@gmail.com"));
		applicationContext.close();
	}
}
