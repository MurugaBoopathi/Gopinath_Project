package com.example.dbcache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbcache.service.RequestService;

@RestController
@RequestMapping("/sample")
public class RequestController {
	
	@Autowired
	private RequestService requestService;

	@GetMapping("/inputs/{input1}/{input2}")
	public Integer getStudent(@PathVariable final Integer input1, @PathVariable final Integer input2)
	{
		return requestService.getTotal(input1, input2);
	}
}
