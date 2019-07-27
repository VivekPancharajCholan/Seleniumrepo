package SeleniumTraining;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDemo22 {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub

	String path	 = System.getProperty("user.dir") + "//src//config//last1.xlsx" ;
	path.indexOf(".x");
	
int f	 = path.indexOf(".x");

 String g = path.substring(f);

 
 System.out.println(g);
	
	
	String value[] = {"Selenium", "by", "Vivek"};
	
	File file = new File(path);
	
	FileInputStream in = new FileInputStream(file);
	
	Workbook book = null;
	
	 book = new XSSFWorkbook(in);
	Sheet sheet = book.getSheetAt(0);
	// r = sheet.createRow(0);
//Row nr	 = sheet.getRow(0);
for (int y =0; y<10; y++)
{
	Row r = sheet.createRow(y);
	Row nr	 = sheet.getRow(y);
	for(int x = 0; x<=2; x++)
	{
		
		Cell cell  = r.createCell(x);
		cell.setCellValue(value[x]);
		
	}
	
}
	
	 in.close();
	
	 FileOutputStream out = new FileOutputStream("C://Users//vivekp//workspace//Seleniumbyvivek//src//config//pv.xlsx");
	 book.write(out);
	 out.close();
	 
	 System.out.println("done");
	}
 
}
