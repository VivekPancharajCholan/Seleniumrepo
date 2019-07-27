package SeleniumTraining;

import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCodeDemo {
	
	WebDriver d;
	
	JavascriptExecutor j;
	
	public void invokeBrowser()
	{
	System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	d = new FirefoxDriver();
	d.get("http://omayo.blogspot.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Logger lo = Logger.getLogger("devpinoyLogger");
	
	lo.debug("start");
//	ArrayList<String> ar = new ArrayList<String>();
	
	/*
	String e = d.findElement(By.id("ta1")).getAttribute("rows");
	String r = d.findElement(By.id("ta1")).getAttribute("cols");*/
	
   try {
	List<WebElement>  we    =  d.findElements(By.xpath("//*[@id ='LinkList1']/div/ul/li/a"));
	   
	lo.debug(we);
		  for(int i = 0; i<we.size(); i++)
	{
		  
		 

	we.get(i).click();
	  Thread.sleep(3000);
	  d.navigate().back();
	  
	we   =  d.findElements(By.xpath("//*[@id ='LinkList1']/div/ul/li/a"));
	  Thread.sleep(5000);
		  /*we.get(i).click();
		d.navigate().back();
		Thread.sleep(3000);*/
		  
		  
		  
	}
		  
		
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
  d.quit();
      
  lo.debug("close");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SeleniumCodeDemo s = new SeleniumCodeDemo();
		s.invokeBrowser();
	}

}
