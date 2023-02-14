package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Practice {
public static void main(String[] args) throws Throwable {
	File f= new File("C:\\\\Users\\\\PRIYABALA\\\\Desktop\\\\Usermail_password.xlsx");
	FileInputStream fis= new FileInputStream(f);
	Workbook wb= new XSSFWorkbook(fis);
Sheet sheetAt = wb.getSheetAt(0);
int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
for (int i = 0; i < physicalNumberOfRows; i++) {
Row row = sheetAt.getRow(i);
int cells = row.getPhysicalNumberOfCells();
for (int j = 0; j < cells; j++) {
	Cell cell = row.getCell(j);
	CellType cellType = cell.getCellType();
	if (cellType.equals(CellType.STRING)) {
		String scv = cell.getStringCellValue();
		System.out.println(scv);

	}
	else if (cellType.equals(CellType.NUMERIC)) {
double ncv = cell.getNumericCellValue();
System.out.println(ncv);
	}
	
	
}
}
	
	
	
}
	
}
