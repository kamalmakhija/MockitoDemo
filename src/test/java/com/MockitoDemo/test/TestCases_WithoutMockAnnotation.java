package com.MockitoDemo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.mockitoDemo.service.ServiceToBeMocked;
import com.mockitoDemo.service.ServiceToBeTested;

@RunWith(value = MockitoJUnitRunner.class)
class TestCases_WithoutMockAnnotation {

	@Test
	void test() {

		//Initializing MockService And ActualService
		ServiceToBeMocked serviceToBeMocked = mock(ServiceToBeMocked.class);
		ServiceToBeTested serviceToBeTested = new ServiceToBeTested(serviceToBeMocked);

		// Expected Input : ServiceToBeTested.
		int inputValue = 5;

		// Expected Output : ServiceToBeTested
		int expectedOutputValue = 30;

		// Mocking the Behaviour : ServiceToBeMocked.
		when(serviceToBeMocked.multiplyByTwo(inputValue)).thenReturn(10);

		// Calling the service : ServiceToBeTested
		int valueReturnedByTestingMethod = serviceToBeTested.methodToBeTested(inputValue);

		assertEquals(expectedOutputValue, valueReturnedByTestingMethod);

	}

}
