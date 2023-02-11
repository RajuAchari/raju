package com.Webtable;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class DyanamicWebtable extends BaseTest {
	public void CapturingDyanamicWebtableData()
	{
		//identifying the webtable
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table
		By webtableLocator=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table");
		WebElement webtable=driver.findElement(webtableLocator);
		//in the table- identifying the number of rows
		By tableRowLocator=By.tagName("tr");
		List<WebElement>tableRows=webtable.findElements(tableRowLocator);
		//System.out.println(tableRows.size());
        //  to go to all the rows
		for(int rowIndex=0;rowIndex<tableRows.size();rowIndex++)
		{
			By rowofcellsLocator=By.tagName("td");
			//goes to a row and identifying the number of cells
			List<WebElement>tableRowofcells=tableRows.get(rowIndex).findElements(rowofcellsLocator);
			//System.out.println(rowIndex+""+tableRowofcells.size());
			//go to every row of the cells
			for(int rowofcellIndex=0;rowofcellIndex<tableRowofcells.size();rowofcellIndex++)
			{
				//goes to every row of a cell- get the data
				String tableData=tableRowofcells.get(rowofcellIndex).getText();
				System.out.print(tableData+" ");
			}
			
			System.out.println();
		}}
     public static void main(String[]args) {
    	 DyanamicWebtable dyanamicwebtable=new DyanamicWebtable();
    	 dyanamicwebtable.ApplicationLaunch();
    	 dyanamicwebtable.CapturingDyanamicWebtableData();
    	 dyanamicwebtable.Applicationclose();
}
}