package com.soat.kata.test;

import com.soat.kata.FizzBuzz;

import junit.framework.TestCase;

public class FizzBuzzTest extends TestCase {

	
	public void testNombre(){
		
		assertEquals("1", FizzBuzz.sayNumber(1));
	}
	
	public void testFizz(){
		
		assertEquals("Fizz", FizzBuzz.sayNumber(3));
	}
	
	public void testBizz(){
		
		assertEquals("Buzz", FizzBuzz.sayNumber(5));
	}
	
public void testFizzBizz(){
		
		assertEquals("FizzBuzz", FizzBuzz.sayNumber(15));
	}
	

public void testFizzBuzzSerie(){
	
	assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz", FizzBuzz.getFizzBuzz(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
}
	
	
}
