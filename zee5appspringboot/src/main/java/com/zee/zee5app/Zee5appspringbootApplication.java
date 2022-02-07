package com.zee.zee5app;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import com.zee.zee5app.dto.Episode;
import com.zee.zee5app.dto.Register;
import com.zee.zee5app.dto.Series;
import com.zee.zee5app.dto.Subscription;
import com.zee.zee5app.exception.AlreadyExistsException;
import com.zee.zee5app.service.EpisodeService;
import com.zee.zee5app.service.SeriesService;
import com.zee.zee5app.service.SubscriptionService2;
import com.zee.zee5app.service.UserService2;

import antlr.collections.List;

@SpringBootApplication
public class Zee5appspringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = 
		SpringApplication.run(Zee5appspringbootApplication.class, args);
////		
//		UserService2 service = applicationContext.getBean(UserService2.class);
//		Register register = new Register("ZEE5000002", "vibhor11", "kumar11", "vibhor123@gmail.com", "abcd12345",new BigDecimal("1234567"), null);
//		try {
//			System.out.println(service.addUser(register));
//		} catch (AlreadyExistsException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
		
//		SeriesService seriesService = applicationContext.getBean(SeriesService.class);
//		
//		Series series = new Series("Ser100001", "spring", "22/12/2011", "winter", "English","cast", "SAD", 21, 1);
//		seriesService.addSeries(series);
//		
		
		
//		SubscriptionService2 subscriptionService = applicationContext.getBean(SubscriptionService2.class);
//		Subscription subscription1 = new Subscription("subId001", "Annual", "2022-01-09", "Active", "India", "Online","Active", "2022-09-09", 10000, new BigDecimal("2345676"), "ZEE5000012");
//		subscriptionService.addSubscribtion(subscription1);
		
//		Optional<java.util.List<Subscription>> optional =  subscriptionService.getAllSubscribtion();
//		if(optional.isEmpty())
//			System.out.println("no records");
//		else
//			optional.get().forEach(e -> System.out.println(e));
		
//		SeriesService seriesService = applicationContext.getBean(SeriesService.class);
//		Series series1 = new Series("ser0001", "series1", "2022-01-01", "comming soon", "English", "xyz", "sad", 13, 3, null);
//		seriesService.addSeries(series1);
//		EpisodeService episodeService = applicationContext.getBean(EpisodeService.class);
//		Episode episode1 = new Episode("ep0001", "episode1", "125", "drive", "xyz", series1);
//		episodeService.addEpisode(episode1);
		
//		Series series[] = seriesService.getAllSeries();
//		System.out.println(series[0].getSeriesName());
//		applicationContext.close();
	}

}
