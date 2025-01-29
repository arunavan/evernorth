package com.verizon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
	@GetMapping("/producer")
	public String getMessage() {
		return "Producer Example";
	}
	
	

}
