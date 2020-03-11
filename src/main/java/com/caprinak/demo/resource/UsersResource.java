package com.caprinak.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caprinak.demo.model.Users;
import com.caprinak.demo.repository.UserRepository;

@RestController
@RequestMapping(value="/rest/users")
public class UsersResource 
{
		@Autowired
		UserRepository usersRepository;
		
		@GetMapping(value="/all")
		public List<Users> getAll(){
			return usersRepository.findAll();
		}
		@PostMapping(value="/load")
		public List<Users> persist(@RequestBody final Users users){
			usersRepository.save(users);
			return usersRepository.findAll();
		}
}
