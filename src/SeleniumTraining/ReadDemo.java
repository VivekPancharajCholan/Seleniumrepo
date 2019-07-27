package SeleniumTraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	String path	 = System.getProperty("user.dir")+"//src//config//msg.xlsx";
	
	File file = new File(path);
	
	FileInputStream input = new FileInputStream(file);
	
	Workbook book = null;
	
	book = new XSSFWorkbook(input);
	
	Sheet sheet  =   book.getSheetAt(0);
	 
    // Row row	 = sheet.getRow(0);
     
  int c =  sheet.getLastRowNum() - sheet.getFirstRowNum();
  System.out.println(c);
  
  for(int p = 0 ; p<c; p++)
	  {
	  
	Row w  = sheet.getRow(p);
	for(int g =0; g<w.getLastCellNum(); g ++)
	{
	Cell ce	= w.getCell(g);
	String d = ce.getStringCellValue();
	if(d.equals("Raj"))
	{
		
		System.out.println(d);
	}
	
	}
	
  }
  

 for(int x =0 ; x<=c; x++)
 {
	 Row row	 = sheet.getRow(x);
     
	 for(int y= 0; y<row.getLastCellNum(); y++)
	 {
		 
	  Cell cell  = row.getCell(y);
	   System.out.println(cell.toString());
	    
	
	 }
	 
	 System.out.println();
	 
 }
	
 input.close();
 

 
 FileInputStream in2 = new FileInputStream(file);
 
 Workbook b2 = null ;
 
  b2 = new XSSFWorkbook(in2);
Sheet sheet2    =  b2.getSheet("Sheet2");
String v[] = {"Selenium", "by", "vivek"};
int cr    = sheet2.getLastRowNum() - sheet2.getFirstRowNum();

System.out.println(cr);

Row r2  = sheet2.getRow(0);
Row r    = sheet2.createRow(cr+1);

//Row r2  = sheet2.getRow(cr+1);

for(int x =0; x<2; x++)

{

Cell cell2   = r.createCell(x);

cell2.setCellValue(v[x]);

}

in2.close();

FileOutputStream ot2 = new FileOutputStream(file);
b2.write(ot2);
ot2.close();

}

}
	
	
	
