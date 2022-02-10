package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HcheckController {
	@GetMapping("/check")
	public Long hcheck() {
		return System.currentTimeMillis();
	}
}
