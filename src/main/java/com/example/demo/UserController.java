package com.example.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping
	public String getUsers() {
		return "Status 200. You have successfully reached to getUsers";
	}
	
	@GetMapping("/{id}")
	public String getUserById(@PathVariable(value = "id") int id) {
		return "Status 200. You have successfully reached to getUser of ID " + id;
	}
	
	@PostMapping
	public String postUser() {
		return "Status 201. You have successfully reached to postUser";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "Status 200. You have successfully reached to deleteUser";
	}

}
