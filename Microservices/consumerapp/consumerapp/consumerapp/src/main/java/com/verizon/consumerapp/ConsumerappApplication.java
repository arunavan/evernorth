package com.verizon.consumerapp;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerappApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {

	    return builder.setConnectTimeout(Duration.ofMillis(300000))
	     .setReadTimeout(Duration.ofMillis(300000)).build();
	}
	

}
