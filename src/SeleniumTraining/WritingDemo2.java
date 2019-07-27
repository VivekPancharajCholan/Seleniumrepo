package SeleniumTraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class WritingDemo2 {
	
	
	public void write(String path, String sheetname, String [] value) throws IOException
	
	{ 
		
		
File file = new File(path);
		
		FileInputStream in = new FileInputStream(file);
		Workbook wbok = null;
		      
		         wbok = new XSSFWorkbook(in);
	  Sheet	   sheet  =  wbok.getSheetAt(0);
	  
	System.out.println( sheet.getSheetName());
		        
int count	=  sheet.getLastRowNum() - sheet.getFirstRowNum();
	  
 System.out.println(count);
 
 Row row = sheet.getRow(0);
 Row newrow  = sheet.createRow(count+1);
 
 for(int j = 0; j < row.getLastCellNum(); j++){

      //Fill data in row

      Cell cell = newrow.createCell(j);
      cell.setCellValue(value[j]);
    

  }
 
 /*ow row = sheet.getRow(0);
 Row newrow  = sheet.createRow(count+1);
 
 for(int x =0; x < 10 ; x++)
  {
	  Cell cell=  newrow.createCell(x);
	  cell.setCellValue(value[x]);
  }
  */

  
  in.close();
  
  FileOutputStream out = new FileOutputStream("C://Users//vivekp//workspace//Seleniumbyvivek//src//Config//Excel10.xlsx");
  wbok.write(out);
  out.close();
	}
	

	public static void main(String args[]) throws IOException  {
		
	
		String value[] = {"I", "am", "king"};


		WritingDemo2 wd = new WritingDemo2();
		wd.write((System.getProperty("user.dir") + "//src//config//Book5.xlsx"), "write", value);

}
}

