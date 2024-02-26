package com.jpa.test.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.*;
import com.jpa.test.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name, String city);

	@Query("select u FROM User u")
	public List<User> getAllUser();
}
