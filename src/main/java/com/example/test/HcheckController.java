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

	@GetMapping("/hello2")
	public String hello2() {
		return "hello2";
	}

	@GetMapping("/hello3")
	public String hello3() {
		return "hello3";
	}

	@GetMapping("/hello4")
	public String hello4() {
		return "hello4";
	}
}
