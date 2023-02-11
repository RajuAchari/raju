package com.excell;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read_multipleTestdata {
public static void main(String[] args) throws IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\rajua\\Desktop\\Book1.xlsx");
	Workbook wb=new XSSFWorkbook(file);
	Sheet sheet=wb.getSheet("sheet1");
	int sheetRowcount=sheet.getLastRowNum();
	for(int rowindex=0;rowindex<=sheetRowcount;rowindex++);
	{
	int rowofcellcount=sheet.getRow(sheetRowcount).getLastCellNum();
	for (int cellindex=0;cellindex<rowofcellcount;cellindex++)
	{
}     Row row1=sheet.getRow(sheetRowcount);
      Cell rowofcell=row1.getCell(rowofcellcount);
      String data1=rowofcell.getStringCellValue();
      System.out.print(data1+" ");
	}
	    System.out.println();
}
}