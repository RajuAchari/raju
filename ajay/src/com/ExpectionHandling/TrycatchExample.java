package com.ExpectionHandling;

public class TrycatchExample {

	public static void main(String[] args) {
     try
     {
    	 int var1=10;
    	 int var2=0;
    	 int var3;
    	 var3=var1/var2;
    	 System.out.println("The division of 2 variables is:"+var3);
     }
     catch(Exception hi)
     {
    	 System.out.println("The exception is:"+hi);
    	 System.out.println("unable to perform the divison");
     }
     
    	 
     }

	}


