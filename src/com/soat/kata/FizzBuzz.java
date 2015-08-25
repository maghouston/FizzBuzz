package com.soat.kata;

public class FizzBuzz {
	
	
	public static String sayNumber(int x){
		
		if(x%15==0){
			
			return "FizzBuzz";
		}
		
		if(x%3==0){
			
			return "Fizz";
		}
		
		if(x%5==0){
			return "Buzz";
		}
		
		return ""+x;
		
	}
	
	public static String getFizzBuzz(int ... args){
		
		StringBuffer resultat = new StringBuffer();
		for( int x :args){
			
			resultat.append(FizzBuzz.sayNumber(x)+" ");
		}
		
		return resultat.toString().trim();
		
		
	}
	
	
	
}
