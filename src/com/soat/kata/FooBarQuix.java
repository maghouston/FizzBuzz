package com.soat.kata;

public class FooBarQuix {

	
	public static String getFooBarQix(int number){
		String resultat ="";
		if(number%3==0){
			resultat +="Foo"; 
		}
		if(number%5==0){
			resultat+="Bar";
		}
		if(number%7==0){
			resultat+="Qix";
		}
		
		String numStr = String.valueOf(number);
		
		for (int i = 0; i < numStr.length(); i++) {
			char c = numStr.charAt(i);
			if(String.valueOf(c).equals("3")){
				resultat+="Foo";
			}
			if(String.valueOf(c).equals("5")){
				resultat+="Bar";
			}
			if(String.valueOf(c).equals("7")){
				resultat+="Qix";
			}
			
		}
		
		if(resultat.isEmpty()){
			return ""+number;
		}
		return resultat;
	}
	
	public static void main(String[] args) {
		
		for (int i=1;i<100;i++){
			
			System.out.println(i+"==> "+FooBarQuix.getFooBarQix(i));
		}
		
		
	}
	
	public static String getFooBarQixListe(int... serie){
		 StringBuffer resultat = new StringBuffer();
		 for(int i : serie){
			 resultat.append(getFooBarQix(i)+"\n");
		 }
		
		return resultat.toString().substring(0, resultat.toString().length()-1);
	}
}
