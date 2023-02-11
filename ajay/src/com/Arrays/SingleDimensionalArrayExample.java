package com.Arrays;

public class SingleDimensionalArrayExample {

	public static void main(String[] args) {
		/*int var=10;
		var=10;
		System.out.println(var);
		/*
		//Array is capable of saving multiple values
		//Array size is fixed
		//Array index starts with 0
		//Array once created with a size mentioned it wont allow to save evan an extra
		//value more than the size declared
		//An Array index once assigned with a value of the same index of an Array
		//Array once declared with a data type - it accepts only similar data type values
		//If An Array index is created and thw value is not assigned into - it will be occupied with 0 - wastage of memory
		 
		 */
		  int array1[]=new int[4];
		      array1[0]=10;
		      array1[1]=5;
		      array1[2]=20;
		      array1[3]=30;
		     /* 
		       System.out.println(array1[0]);
		       System.out.println(array1[1]);
		       System.out.println(array1[2]);
		       System.out.println(array1[3]);
		       */
		    //  for(int index=0;index<5;index++)
		  //  for(int index=0;index<=3;index++)
		      for(int index=0;index<array1.length;index++)
		    	//  System.out.println(array1[10]);
		      {
		      System.out.println(array1[index]);
		      }
		    	  
		       
		      
		       
		       
		       
	}
}
