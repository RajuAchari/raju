package com.Inheritance;

public class Test3 extends Test2 {
	void division()
	{
		int var1=20;
		int var2=10;
		int var3;
		var3=var1/var2;
		System.out.println("The value of var3 after division is:-"+var3);
	}
	public static void main(String[] args) {
		System.out.println("******Test3ClassMethod*****");
		Test3 t3=new Test3();
		t3.division();
		System.out.println();
		System.out.println("*****Test2ClassMethod***");
		t3.multiplication();
		System.out.println();
		System.out.println("*****Test1ClassMethod****");
		t3.addtion();
	}

}
