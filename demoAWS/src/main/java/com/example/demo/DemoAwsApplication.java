package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.user.vo.User;

@SpringBootApplication
@ComponentScan({"com.example.demo"})
@EnableAutoConfiguration
@RestController
public class DemoAwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAwsApplication.class, args);
	}
	
	@GetMapping("/user")
	public List<User> hello() {
		User user1 = new User(1,"MA","EMAIL",637998182,new Date(),false);
		List<User> listUser = new ArrayList<User>();
		listUser.add(user1);
	    return listUser;
	}

}
