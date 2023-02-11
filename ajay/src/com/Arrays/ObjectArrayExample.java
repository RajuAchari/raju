package com.Arrays;

public class ObjectArrayExample {
	public static void main(String[] args) {
	Object array1[]=new Object[4];
	//Object array is capable of saving any data type values
	  array1[0]=10;
	  array1[1]="Laddu";
	  array1[2]='A';
	  array1[3]=10.1234;
	  for(int index=0;index<array1.length;index++)
	  {
		  System.out.println(array1[index]);
		  
	  }
	

}
}