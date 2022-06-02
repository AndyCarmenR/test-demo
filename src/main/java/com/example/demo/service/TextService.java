package com.example.demo.service;

import com.example.demo.models.Request;
import com.example.demo.models.Response;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class TextService {

	public Response sayHello(Request request) {
		try {
			this.wait(10000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		if (request.getTextoSaludo().length() == 0) {
			return new Response("Hola, no me dijiste tu nombre :(",200, Boolean.TRUE,new HashMap<>());
		}
		return new Response("Hola "+request.getTextoSaludo()+", que tengas un excelente dia! :)",200, Boolean.TRUE,new HashMap<>());
	}
	

	
}
