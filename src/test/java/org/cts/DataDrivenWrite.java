package org.cts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenWrite {
	public static void main(String[] args) throws IOException {
		
	
	File f = new File("C:\\Users\\karth\\eclipse-workspace\\MavenDemo\\Excel\\write.xlxs");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook();
	Sheet createSheet = w.createSheet("course");
	Row createRow = createSheet.createRow(0);
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue("Java");
	
	
	FileOutputStream fout = new FileOutputStream(f);
	w.write(fout);
	
	
	
	
	
	
	

}
}
