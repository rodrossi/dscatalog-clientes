package com.bootcamp.desafio.controllers;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.desafio.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L,"Bob","123456789101",20.0,Instant.now(),2));
		list.add(new Client(2L,"Maria","123456789101",30.0,Instant.now(),4));
		return ResponseEntity.ok().body(list);
	}

}
