package com.example.dbcache.service;

import org.springframework.stereotype.Component;

@Component
public class RequestService {

	public Integer getTotal(Integer input1, Integer input2)
	{
		return input1 + input2;
	}
	
}
