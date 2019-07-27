package SeleniumTraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WritingDemo {

	public static void main(String args[]) throws IOException  {
		
		String path = System.getProperty("user.dir") + "//src//config//vivek.xlsx";
		String sheetname = "write";
		
		String value[] = {"I", "am", "king", "of", "Kings"};

		File file = new File(path);
		
		FileInputStream in = new FileInputStream(file);
		
		Workbook wbok = null;
		      
		         wbok = new XSSFWorkbook(in);
	  Sheet	   sheet    =  wbok.getSheetAt(2);
			System.out.println(sheet.getSheetName());
		        
int count	=  sheet.getLastRowNum() - sheet.getFirstRowNum();
	  
 System.out.println(count);
 

  Row row = sheet.getRow(0);
 Row newrow  = sheet.createRow(count+1);
 
 
 for(int j = 0; j <=4; j++){

      //Fill data in row

      Cell cell = newrow.createCell(j);
      cell.setCellValue(value[j]);
      
 }
     in.close();
     //"C://Users//vivekp//workspace//Seleniumbyvivek//src//Config//vivek11.xlsx"
  
  
  FileOutputStream out = new FileOutputStream(file);
  wbok.write(out);
  out.close();
	}

}

