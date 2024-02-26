package com.jpa.test;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class Bootjpaexample1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Bootjpaexample1Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

//		Creating object of user

		/*
		 * User user1 = new User(); user1.setName("Kirti Gupta");
		 * user1.setCity("Indore"); user1.setStatus("I am a full stack developer");
		 * 
		 * User user2 = new User(); user2.setName("Neelam Gupta");
		 * user2.setCity("Gwalior"); user2.setStatus("I am a full stack developer");
		 * 
		 * List<User> users = List.of(user1,user2); Iterable<User> result =
		 * userRepository.saveAll(users);
		 * 
		 * result.forEach(user ->{ System.out.println(user); });
		 */

//		Updating the user with ID 102

		/*
		 * Optional<User> optional = userRepository.findById(102);
		 * 
		 * User user = optional.get(); user.setName("Sahil Shah"); User result =
		 * userRepository.save(user); System.out.println(result);
		 */

//		Getting the Data from Database

		/*
		 * Iterable<User> itr = userRepository.findAll();
		 * 
		 * itr.forEach(user -> { System.out.println(user); });
		 */
		
		
//		Deleting the user 
		
		//We have 4 methods for deleting : deleteById, deleteAll
		
		/*
		 * Iterable<User> allusers = userRepository.findAll(); allusers.forEach(user ->
		 * {System.out.println(user);}); userRepository.deleteAll(allusers);
		 */
		
		/*
		 * List<User> users = userRepository.findByNameAndCity("Krati", "Agra");
		 * 
		 * users.forEach(e->System.out.println(e));
		 */
		
		
		List<User> allUser = userRepository.getAllUser();
		System.out.println(allUser);
		allUser.forEach(user -> { System.out.println(user); });
		
		System.out.println("Done");
	}

}
