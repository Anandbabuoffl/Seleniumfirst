package reale;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedataexcele {

	public static void main(String[] args) throws IOException {
		/*HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Test");
		sheet.getRow(0).createCell(1).setCellValue("text");

		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("Test");
		sheet.getRow(1).createCell(1).setCellValue("text");
		
		File file=new File("C:/Users/bbuanan/Music/Test.xls");
		
		workbook.write(file);
		workbook.close();*/
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Sheettest");
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("Test1");
		sheet.getRow(0).createCell(1).setCellValue("text");

		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue(true);
		sheet.getRow(1).createCell(1).setCellValue("text");
		
		File file=new File("C:/Users/bbuanan/Music/Test5.xlsx");
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		workbook.close();
		
		
	}

}
