package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenPractice {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\karth\\eclipse-workspace\\MavenDemo\\Excel\\vicky.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet sheet = w.getSheet("Sheet1");
		//Row row = sheet.getRow(4);
		//Cell cell = row.getCell(1);
		//System.out.println(cell);
		
		
		// To get All Rows And Columns
		
		
//		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//		System.out.println(physicalNumberOfRows);
//		
//		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//		System.out.println(physicalNumberOfCells);
		
		
		
		// To Print all the values
		
//		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//			Row row2 = sheet.getRow(i);
//			
//			for (int j = 0; j < row2.getPhysicalNumberOfCells(); j++) {
//				
//				Cell cell2 = row2.getCell(j);
//				System.out.print(cell2);
//				
//				
//			}
//			
//			System.out.println();
//			
//		}
		
		
		// To Print all the values including date format
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				//System.out.print(cell);
				
				
				int cellType = cell.getCellType();
				System.out.println(cellType);
				
				
				if(cellType==1)
				{
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
				
				else if (DateUtil.isCellDateFormatted(cell)) {
					
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
					String format = simple.format(dateCellValue);
					System.out.println(format);
					
					
				}
				
				
				else
				{
					double numericCellValue = cell.getNumericCellValue();
					long l =(long)numericCellValue;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
				}
					
				
				
					
			System.out.println();
			
			
		}
		}
		
						
		
		
		// Insert New Rows and Columns
		
//		Row createRow = sheet.createRow(10);
//		Cell createCell = createRow.createCell(0);
//		createCell.setCellValue("vijay");
//		
//		Cell createCell2 = createRow.createCell(1);
//		createCell2.setCellValue("Moral Science");
//		
//		
//		FileOutputStream fout = new FileOutputStream(f);
//		w.write(fout);
//		
		
		
		
		
		
		
	
	

	
//	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//		
//		Row row = sheet.getRow(i);
//		
//		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//			
//			Cell cell = row.getCell(j);
//			
//			int cellType = cell.getCellType();
//			
//			//System.out.print(cell);
//			
//			if(cellType ==1)
//			{
//				String stringCellValue = cell.getStringCellValue();
//				System.out.println(stringCellValue);
//			}
//			
//			
//			else if (DateUtil.isCellDateFormatted(cell)) {
//				Date dateCellValue = cell.getDateCellValue();
//				SimpleDateFormat simple = new SimpleDateFormat("dd-MM-YYYY");
//				String format = simple.format(dateCellValue);
//				System.out.println(format);
//		
//			}
//			
//			else {
//				
//				double numericCellValue = cell.getNumericCellValue();
//				long l =(long)numericCellValue;
//				String valueOf = String.valueOf(l);
//				System.out.println(valueOf);
//				
//			}
//			
//			}
//			
//			
//		}
//		
//	}	
}
}

		
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
// To Print all datas in table format
	
//	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//		
//		Row row = sheet.getRow(i);
//		
//		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//			
//			Cell cell = row.getCell(j);
//			System.out.print(cell);
//			
//			
//			
//		}
//		System.out.println();
//		
//		
//	}
//	
	
	
	
	
	
	
	
	
	
	
	

	
	
	


	
