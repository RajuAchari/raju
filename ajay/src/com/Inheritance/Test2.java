package com.Inheritance;

public class Test2 extends Test1 {
	private void subtraction()
	{
		int var1=20;
		int var2=10;
		int var3;
		var3=var1-var2;
		System.out.println("The value of the var3 after subtration is:-"+var3);
	}
	protected void multiplication()
	{
		int var1=20;
		int var2=10;
		int var3;
		var3=var1*var2;
		System.out.println("The value of var3 after multiplication is :-"+var3);
	}
	public static void main(String[] args) {
		System.out.println("*******Test2ClassMethod******");
		Test2 t2=new Test2();
		t2.subtraction();
		t2.multiplication();
		System.out.println();
		System.out.println("*******Test1ClassMethod******");
		//Test1 t1=new Test1();
		//t1.addtion();
		t2.addtion();
	}
	
		
	}

