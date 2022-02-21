package com.lino.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lino.model.entities.User;

@RestController
@RequestMapping("/users")
public class UserController {

	
	@GetMapping
	public ResponseEntity<User> findAll() {

		User u = new User(1L, "Felipe Lino", "f.lino1934@hotmail.com", "981375682", "1234");
		return ResponseEntity.ok().body(u);
	}

}
