package com.verizon.consumerapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/consumer")
	public String getMesssage() {
		String msg=restTemplate.getForObject("http://localhost:8081/producer", String.class);
		return   "Message from Producer :" + msg; //   "Consumer MEssage";
	}

}
