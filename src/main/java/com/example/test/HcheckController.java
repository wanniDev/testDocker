package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HcheckController {
	@GetMapping("/hcheck")
	public Long hcheck() {
		return System.currentTimeMillis();
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
