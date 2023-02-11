package com.excell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Comexcelleadsingletestdata {

	public static void main(String[] args) throws IOException 
	{
		//identify the file in the system
		FileInputStream file = new FileInputStream("C:\\Users\\rajua\\Desktop\\Book1.xlsx");
		//identify the workbook in the file
		Workbook wb = new XSSFWorkbook(file);
		//identify the sheet in the workbook
		 Sheet sheet=  wb.getSheet("Sheet1");
		 //identify the row in the sheet
		 Row row =  sheet.getRow(0);
		 //identify the row of a cell
		  Cell cell= row.getCell(0);
		  //getting the data from the row of a cell
		   String data =  cell.getStringCellValue();
		   System.out.println(data);
		
		
		
		
		
		

	}

}
