package TestNG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Base64.Encoder;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xslf.usermodel.XSLFSlideShowFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DadaProviderDemo {
	@Test(dataProvider = "details")
	public void f(String d, String p) throws Throwable {

		System.setProperty("webdriver.gecko.driver",
				"D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		WebDriver o;
		o = new FirefoxDriver();
		o.get("https://www.flipkart.com/");

		o.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys(d);
		o.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys(p);
		o.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		String s = o.getCurrentUrl();
		if(s.equals("https://www.flipkart.com/"))
		{
			
			TakesScreenshot screen = (TakesScreenshot)o ;
			String path = System.getProperty("user.dir")+ "//src//config//shot2.jpg";
		File src	 = screen.getScreenshotAs(OutputType.FILE);
		
			 FileUtils.copyFile(src, new File(path));
		}
		

	}

 @DataProvider(name = "details")

	public Object [][] login() throws Throwable

	{

		Object[][] user = data();

		return user;

	}
	
	
 public String[][] data() throws Throwable {

	 Workbook book = null;
		String path = System.getProperty("user.dir") + "//src//config//data.xlsx";
		File file = new File(path);
		FileInputStream in = new FileInputStream(file);
		book = new XSSFWorkbook(in);
		Sheet s = book.getSheetAt(0);
		String[] ss = new String[4];
		String[] [] ss2 = new String[3][2];
		int i = 0;
		int j = 0;
		int z = 0;
		String value = null;
		int c = s.getLastRowNum() - s.getFirstRowNum();

		

		for (int x = 0; x <= c-1; x++) {

			Row nr = s.getRow(x+1);

			for (int y = 0; y < nr.getLastCellNum(); y++) {

				Cell d = nr.getCell(y);
				String e = d.getStringCellValue();
				
				
				ss[i]=e;
				ss2[x][y] = ss[i];
				i++ ;
				
			}

		}

		
		
		return ss2;

	}

}
