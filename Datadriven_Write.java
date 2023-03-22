package com.datadrivenWRITE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_Write {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Javed\\eclipse-workspace\\Project_Maven\\Project_Name\\Adactin.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		//fis= file input stream
		Workbook wb = new XSSFWorkbook(fis);
		
		//creating sheet, row and cell & sending values to the particular cell
		
		wb.createSheet("ACC").createRow(0).createCell(0).setCellValue("username");
		wb.getSheet("ACC").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("ACC").getRow(0).createCell(2).setCellValue("Acc_No");
		
		wb.getSheet("ACC").createRow(1).createCell(0).setCellValue("JavedMo7");
		wb.getSheet("ACC").getRow(1).createCell(1).setCellValue("JAVED987654!");
		wb.getSheet("ACC").getRow(1).createCell(2).setCellValue("1220424334791");
		
		FileOutputStream fos = new FileOutputStream(f);
		//write //fos = file output stream
		wb.write(fos);
		
		wb.close();
		
		
		
	}

}
