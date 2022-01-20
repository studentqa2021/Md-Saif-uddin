package com.generic.code;

public class Animal {
	
	void getSalary() {
		
		String country ="United State of America";
		
		for(int i=(country.length()-1);i>=0;i--) {
			
			System.out.println(country.charAt(i));
		}
		

			
			
		}
		
		
		//System.out.println(name.charAt(i));

	
	
	public static void main(String[] args) {
		Animal obj= new Animal();
		obj.getSalary();
	}

}
