package com.running;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class JavaCollectionPractice {
	
	//static int [] array= {1,2,3,4,4,5,6,6};	
	public void getArray(int [] array){
		
		for (int i=0;i<array.length;i++) {
			for (int c=(i+1);c<array.length;c++) {
				
				if (array[i]==array[c]) {
					
					//System.out.println(array[i]+"======="+array[c]);
					//System.out.println("Found my duplicate Value = "+array[c]);
				}
			
		}  
		 
	}
	
	 }	
	
	

	}
	