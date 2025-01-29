package com.verizon.consumerapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class DiscoveryController {
	@Autowired
	DiscoveryClient discoveryClient;
	@Autowired
	RestTemplate restTemplate;
	@GetMapping("/data")
	   public String getProduct() {                  
	    	List<ServiceInstance> siList = discoveryClient.getInstances("PRODUCERAPP");
	           ServiceInstance si = siList.get(0);
	            String url = si.getUri() +"/producer";
	         String response = restTemplate.getForObject(url, String.class);
	          System.out.println("using discovery client"+ response);
	            return response;
	      }
}
