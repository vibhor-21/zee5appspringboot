package com.zee.zee5app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zee.zee5app.dto.Movies;
import com.zee.zee5app.dto.Role;
import com.zee.zee5app.repository.RoleRepository;
import com.zee.zee5app.service.MoviesService2;
import com.zee.zee5app.service.RoleService;

@SpringBootApplication
public class Main2 {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(Zee5appspringbootApplication.class, args);
		
//		
//		MoviesService2 movieService = applicationContext.getBean(MoviesService2.class);
//		
//		Movies movie = new Movies();
//		movie.setId("mov001");
//		
//		movie.setAge_limit(18);
//		movie.setCast("Allu Arjun");
//		movie.setLanguage("hindi");
//		movie.setMovieName("pushpa");
//		movie.setGenre("abc");
//		FileInputStream fileInputStream = null;
//		FileOutputStream fileOutputStream = null;
//		try {
//		 fileInputStream = new FileInputStream("C:\\Users\\vibhor.kumar\\Videos\\Trailer");
//		 File file = new File("C:\\Users\\vibhor.kumar\\Videos\\Trailer");
//		 long fileSize= file.length();
//         byte[] allBytes = new byte[(int) fileSize];
//         
//         fileInputStream.read(allBytes);
//         
//         movie.setTrailer("C:\\Users\\vibhor.kumar\\Videos\\Trailer\\movieStore\\"+file.getName());
//         
//         movie.setRelease_date("2022-12-15");
//       String result =  movieService.addMovies(movie);
//       
//       if(result.equals("success")) {
//    	   
//    	   fileOutputStream = new FileOutputStream("C:\\Users\\vibhor.kumar\\Videos\\Trailer\\movieStore\\"+file.getName());
//    	  
//    	   byte[] data = new byte[(int) file.length()];
//    	   
//    	   fileInputStream.read(data);
//    	   fileOutputStream.write(data);
//    	   
//       }
// 
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				fileInputStream.close();
//				fileOutputStream.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
////		FileInputStream fileInputStream = null;
////		FileOutputStream fileOutputStream = null;
////		Optional<Movies> optional;
////		try {
////			optional = movieService.getMoviesById("mov001");
////			if(optional.isEmpty()) {
////				System.out.println("record not found");
////			}
////			else {
////				Movies movie = optional.get();
////				
////				fileOutputStream = new FileOutputStream(null);
////				fileOutputStream.write(movie.getTrailer());
////				
////			}
////		} catch (IdNotFoundException e1) {
////			// TODO Auto-generated catch block
////			e1.printStackTrace();
////		}finally {
////			fileOutputStream.close();
////		}
////
////		
////		Movies movie = new Movies();
////		movie.setId("mov001");
////		movie.setAge_limit(18);
////		movie.setCast("Arjun");
////		movie.setLanguage("hndi");
////		movie.setMovieName("pushpa");
////		movie.setGenre("abc");
////		try {
////			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\vibhor.kumar\\Videos\\Trailer");
////			long fileSize = new File("C:\\Users\\vibhor.kumar\\Videos\\Trailer").length();
////			byte[] allBytes = new byte[(int) fileSize];
////			movie.setTrailer(allBytes);
////			movie.setRelease_date("2022-12-15");
////			movieService.addMovies(movie);
////		} catch (FileNotFoundException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		
//		UserRepository repository = applicationContext.getBean(UserRepository.class);
//		System.out.println(repository.existsByEmailAndContactNumber("vibhor12@gmail.com",new BigDecimal("9998989811")));
		
//		SeriesRepository repository = applicationContext.getBean(SeriesRepository.class);
//		System.out.println(repository.findBySeriesNameAndLanguage("spring", "English"));
		
//		Role role1 = new Role();
//		role1.setRoleName(EROLE.ROLE_ADMIN);
//		
//		Role role2 = new Role();
//		role2.setRoleName(EROLE.ROLE_USER);
////		
//		RoleService roleService = applicationContext.getBean(RoleService.class);
//		RoleRepository roleRepository = applicationContext.getBean(RoleRepository.class);

//		roleService.addRole(role1);
//		roleService.addRole(role2);
//		
//		Set<Role> set = new HashSet<>();
//		set.add(roleRepository.findById(1).get());
//		set.add(roleRepository.findById(2).get());
//		
//		UserService2 service = applicationContext.getBean(UserService2.class);
//		Register register = new Register("reg00001", "vibhor11", "kumar11", "vibhor10@gmail.com", "abcd12345",new BigDecimal("1234567"), set, null);
//		
//		try {
//			System.out.println(service.addUser(register));
//		} catch (AlreadyExistsException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		SubscriptionService2 service2 = applicationContext.getBean(SubscriptionService2.class);
//		Subscription subscription = new Subscription("sub00001", "subscription1", "2001-09-20","Active", "India", "Online", "Active", "2020-09-09", 10000, new BigDecimal("912221232"), register);
//		service2.addSubscribtion(subscription);
//		applicationContext.close();
	}
}
