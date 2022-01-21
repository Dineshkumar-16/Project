package com.Mvn_Proj;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excl {
	private static void Read_Excel() throws Exception {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\Mvn_Proj\\Excel\\Worksheet_Sample.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		org.apache.poi.ss.usermodel.Sheet s = w.getSheetAt(2);		
		Row r = s.getRow(2);
		Cell c = r.getCell(3);
		System.out.println(c);
	}

	public static void main(String[] args) throws Exception {

		Read_Excel();

	}

}
