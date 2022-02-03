package com.zee.zee5app;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Series;
import com.zee.zee5app.service.SeriesService;
import com.zee.zee5app.service.UserService2;

@SpringBootApplication
public class Zee5appspringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = 
		SpringApplication.run(Zee5appspringbootApplication.class, args);
		
		UserService2 service = applicationContext.getBean(UserService2.class);
		Register register = new Register("ZEE500001", "vibhor11", "kumar11", "vibhor1234@gmail.com", "abcd1234",new BigDecimal("9998989812"));
		System.out.println(service.addUser(register));
		
		
		SeriesService seriesService = applicationContext.getBean(SeriesService.class);
		String[] cast = new String[2];
		cast[0]= "core";
		cast[1]= "java";
		Series series = new Series("Ser100001", "spring", "22/12/2011", "winter", "English", cast, "SAD", 21, 1);
		seriesService.addSeries(series);
		
		applicationContext.close();
	}

}
