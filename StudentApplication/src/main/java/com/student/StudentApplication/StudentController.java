package com.student.StudentApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/API")
public class StudentController {

	@GetMapping("/getData")
	public String getData(@RequestParam String name) 
	{
		return "welcome to login page == "+name;
	}
	
}
