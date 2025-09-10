package com.authservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authservice.service.AuthService;
import com.authservice.userdto.APIResponse;
import com.authservice.userdto.UserDto;

@RestController
@RequestMapping("/api/v1/auth")
public class UserController {
	@Autowired
	private AuthService authService;

	@PostMapping("/register")
	private ResponseEntity<APIResponse<String>> registerUser(@RequestBody UserDto userDto) {
		APIResponse<String> response = authService.register(userDto);
		System.out.println(userDto.getName());
		return new ResponseEntity<>(response, HttpStatusCode.valueOf(response.getStatus()));
	}
}