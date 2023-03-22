package com.datadrivenWRITE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Datadriven {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Javed\\Documents\\EXCEL\\DATADRIVEN write.xlsx");
		FileInputStream file = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(file);
		
		wb.createSheet("login").createRow(0).createCell(0).setCellValue("username");
		wb.getSheet("login").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("login").getRow(0).createCell(2).setCellValue("Acc_No");
		
		wb.getSheet("login").createRow(1).createCell(0).setCellValue("JavedMo7");
		wb.getSheet("login").getRow(1).createCell(1).setCellValue("JAVED987654!");
		wb.getSheet("login").getRow(1).createCell(2).setCellValue("1220424334791");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		wb.close();
		
	}
}
