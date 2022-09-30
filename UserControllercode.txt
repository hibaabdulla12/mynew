package com.api.restapi;

import java.util.List;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.restapi.entity.User;

@RestController
public class UserController {
	@GetMapping("/users")	
	 public List<User> getuser()
	 
	{
		 List<User> userList= new ArrayList<>();
			User u1 = new User(1l,"Arjun","rampal","kochi",8.7,"male","cs");
			User u2 = new User(2l,"nithya","menon","kochi",7.7,"female","cs");
			User u3 = new User(3l,"Bharat","kumar","kannur",8.5,"male","CE");
			userList.add(u1);
			userList.add(u2);
			userList.add(u3);
			
			
			return userList;
		}
	}


