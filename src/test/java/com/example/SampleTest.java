package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class SampleTest{
	@Test
	public void testSample(){
		Sample s = new Sample();
		assertEquals("Hello",s.testMethod("Hello"));
		System.out.println("Testing completed");
	}
}