package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Request;
@RestController
public class MyController {
	@PostMapping("/add")
	public int add(@RequestBody Request req) {
		System.out.println(req.getVal1()+":"+req.getVal2());
		 int sum=req.getVal1()+req.getVal2();
		 System.out.println(sum);
		 return sum;
		
	}

}
