package com.mockitoDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ServiceToBeMocked {

	public int multiplyByTwo(int inputNum)
	{
		return inputNum * 2;
	}
	
}
