package com.excell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_write_data {

	public static void main(String[] args) throws IOException {
	   //identify the file in the system
		FileInputStream file=new FileInputStream("C:\\Users\\rajua\\Desktop\\Book1.xlsx");
		//identify the workbook in the file
		Workbook wb=new XSSFWorkbook(file);
		//identify the sheet in the workbook
		Sheet sheet=(Sheet) wb.getSheet("sheet4");
		//creating a row in the sheet
		Row row=sheet.createRow(2);
		//in the row created-created a cell 
		Cell cell=row.createCell(3);
		//set the value into the row of a cell created
		cell.setCellValue("selinium");
		//The excel file with workbook should be saved
		FileOutputStream file1=new FileOutputStream("C:\\\\Users\\\\rajua\\\\Desktop\\\\Book1.xlsx");
		wb.write(file1);
	
		
		 

	}

}
