package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Practice {

	public static void writeData() throws Throwable {
File f = new File("C:\\Users\\PRIYABALA\\Desktop\\Usermail_password.xlsx");
FileInputStream fis= new FileInputStream(f);
Workbook wb= new XSSFWorkbook(fis);
wb.createSheet("datasheet").createRow(0).createCell(0).setCellValue("Name");
wb.getSheet("datasheet").getRow(0).createCell(1).setCellValue("Username");
wb.getSheet("datasheet").getRow(0).createCell(2).setCellValue("Password");
wb.getSheet("datasheet").createRow(1).createCell(0).setCellValue("Balaji");
wb.getSheet("datasheet").getRow(1).createCell(1).setCellValue("balajinammazhwar");
wb.getSheet("datasheet").getRow(1).createCell(2).setCellValue("priyabala89");
wb.getSheet("datasheet").createRow(2).createCell(0).setCellValue("YogaPriya");
wb.getSheet("datasheet").getRow(2).createCell(1).setCellValue("priyareddy992");
wb.getSheet("datasheet").getRow(2).createCell(2).setCellValue("sarojapandu");
wb.getSheet("datasheet").createRow(3).createCell(0).setCellValue("Bala");
wb.getSheet("datasheet").getRow(3).createCell(1).setCellValue("bala89mechanic");
wb.getSheet("datasheet").getRow(3).createCell(2).setCellValue("99948601");

FileOutputStream fos= new FileOutputStream(f);
wb.write(fos);
wb.close();
System.out.println("Written Successfully");

	}
	public static void main(String[] args) throws Throwable {
		writeData();
	}
	
	
	
	
	
	
	
	
	
	
}
