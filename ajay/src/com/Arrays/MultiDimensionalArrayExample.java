package com.Arrays;

public class MultiDimensionalArrayExample {
	public static void main(String[] args) {
		String array1[][]=new String[2][2];
		array1[0][0]=" Venkat Sir ";
		array1[0][1]=" Manual Testing ";
		array1[1][0]=" Srini ";
		array1[1][1]=" Selenium ";
		/*
		 array1[2][0]="Vasu";
		 array1[2][1]="Load Runner";
		 */
	//	System.out.println(array1[1][1]);
		//Nested for Loop
		for(int i=0;i<=1;i++)//goes to all the row
		{
			for(int a=0;a<=1;a++)//goes to the very row of all the cells
			{
				System.out.print(array1[i][a]);
			}
			System.out.println();
		}
	}

}
