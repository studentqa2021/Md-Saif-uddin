package com.testing;

public class Functional_test {
	
	int [] a= {1,2,2,3,4,4};
	
	public void getRun(){
		
	for(int i=0;i<a.length;i++) {
	for (int j=(1+1);j<a.length;j++) {
		
		if (a[i]==a[j]) {
			
			System.out.println(a[i]+"=="+a[j]);
		System.out.println("Found my duplicate value"+a[j]);
			
		}
	}

	}
	}
	
	public static void main(String[] args) {
		new Functional_test().getRun();
	}
}
