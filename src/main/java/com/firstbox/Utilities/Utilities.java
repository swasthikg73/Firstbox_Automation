package com.firstbox.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilities {

	public static final int Implicit_Wait_Time = 15;
	
	public static String Email() {
		return "superAdmin@eyepaste.com";
	}
	
	 public static String Password() {
		 return "p99IY0FZHG";
	 }
	 
	 public static Object[][] ExcelData(String sheetName) {
		
		 XSSFWorkbook workbook=null;
		try {
		FileInputStream file=new FileInputStream("C:\\Users\\hsalm\\Downloads\\automation\\Firstbox_Project\\src\\main\\java\\com\\firstbox\\TestData\\TestData.xlsx");
		 workbook = new XSSFWorkbook(file);
	 }
		 catch(Throwable e) {
			 e.printStackTrace();
		 }
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		int rows = sheet.getLastRowNum();
		int cols= sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[rows][cols];
		
		for(int i=0;i<rows;i++) {
			XSSFRow row= sheet.getRow(i+1);
			
			for(int j=0;j<cols;j++) {
			XSSFCell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			
			switch(cellType) {
			case STRING:
				data[i][j]=cell.getStringCellValue();
				break;
			case NUMERIC:
				data[i][j]= Integer.toString((int)cell.getNumericCellValue());
				break;
			case BOOLEAN:
				data[i][j]=cell.getBooleanCellValue();	
				break;
			}
			}
		}
		return data;
	 }
	 
	 public static String Capturescreenshot(WebDriver driver, String testname) {
		 File errorshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String DestinationscreenshotPath = System.getProperty("user.dir")+"\\Screenshot\\"+testname+".png";
			
				try {
					FileHandler.copy(errorshot, new File(DestinationscreenshotPath));
				} catch (IOException e) {
					e.printStackTrace();
				}
				return DestinationscreenshotPath;
			}
	 }
