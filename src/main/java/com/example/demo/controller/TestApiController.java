package com.example.demo.controller;

import com.example.demo.models.Request;
import com.example.demo.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.service.TextService;

@RestController
@RequestMapping("/api/test")
public class TestApiController {
	
	@Autowired
	private TextService service; 

	
	@PostMapping("/hola")
	public Response changeText(@RequestBody Request request) {
		return service.sayHello(request);
	}	
}
