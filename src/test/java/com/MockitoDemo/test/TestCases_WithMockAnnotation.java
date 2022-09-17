package com.MockitoDemo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.mockitoDemo.service.ServiceToBeMocked;
import com.mockitoDemo.service.ServiceToBeTested;

@RunWith(value = MockitoJUnitRunner.class)
class TestCases_WithMockAnnotation {

	@Mock
	private ServiceToBeMocked serviceToBeMocked;

	@InjectMocks
	private ServiceToBeTested serviceToBeTested;

	@SuppressWarnings("deprecation")
	@BeforeEach
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void test() {

		// Expected Input : ServiceToBeTested.
		int inputValue = 5;

		// Expected Output : ServiceToBeTested
		int expectedOutputValue = 30;

		// Mocking the Behaviour : ServiceToBeMocked.
		when(serviceToBeMocked.multiplyByTwo(inputValue)).thenReturn(10);
//		when(serviceToBeMocked.divideByTwo(inputValue)).thenReturn(2.5f);

		// Calling the service : ServiceToBeTested
		int valueReturnedByTestingMethod = serviceToBeTested.methodToBeTested(inputValue);

		//Comparing
		assertEquals(expectedOutputValue, valueReturnedByTestingMethod);

	}

	@Test
	void testException_Junit5() {

		Assertions.assertThrows(NullPointerException.class, () -> {
			String test = null;
			test.charAt(1);
		});
	}

}
