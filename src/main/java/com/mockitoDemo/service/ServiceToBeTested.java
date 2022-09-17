package com.mockitoDemo.service;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ServiceToBeTested {
	
//	@Autowired
	private ServiceToBeMocked serviceToBeMocked;
	
	public ServiceToBeTested(ServiceToBeMocked serviceToBeMocked)
	{
		this.serviceToBeMocked = serviceToBeMocked;
	}
	
	//This service call serviceToBeMocked which multiply a given number by two.
	//The value is then mulitplied by 3 and returned back.
	public int methodToBeTested(int num)
	{
		int value = serviceToBeMocked.multiplyByTwo(num);
		
		return value * 3;
	}
	

}
