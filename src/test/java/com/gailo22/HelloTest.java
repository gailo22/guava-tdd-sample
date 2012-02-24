package com.gailo22;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class HelloTest {
	
	private HelloWorld helloWorld;
	
	@Before
	public void setup() {
		helloWorld = new HelloWorld();
	}
	
	@Test
	public void shouldReturnHelloWorldMessage() {
		// Given
		
		// When
		String message = helloWorld.sayHello();
		
		// Then
		assertThat(message, equalTo("Hello World"));
	}

}
