package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "StudentServer")
public interface StudentClient {
	
	@GetMapping("/student/getstudent")
	public String getStudents();
	

}
