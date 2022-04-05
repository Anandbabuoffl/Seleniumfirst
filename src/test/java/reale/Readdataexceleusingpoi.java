package reale;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdataexceleusingpoi {

	public static void main(String[] args) throws Exception {
		File file=new File("C:/Users/bbuanan/Music/Test2.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheetAt(0);
		//String c1=sheet.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(c1);
		//double d=sheet.getRow(0).getCell(2).getNumericCellValue();
		//System.out.println(d);
		
		
		
		int rows=sheet.getPhysicalNumberOfRows();
	
		for (int i = 0; i <rows; i++) {
		XSSFRow row=sheet.getRow(i);
		
		int columns=row.getPhysicalNumberOfCells();
		for (int j = 0; j < columns; j++) {
		
			XSSFCell cell=row.getCell(j);
			String cellvalue=getCellValue(cell);
			System.out.print("||"+cellvalue);
			
		}
		System.out.println();
		}
		
		workbook.close();
		fis.close();
		
		
	}

public static String getCellValue(XSSFCell cell) {
	switch (cell.getCellType()) {
	case NUMERIC:
		return String.valueOf(cell.getNumericCellValue());
	case BOOLEAN:
		return String.valueOf(cell.getBooleanCellValue());
	case STRING:
		return cell.getStringCellValue();
	default:
		return cell.getStringCellValue();
	}
	
}
}
