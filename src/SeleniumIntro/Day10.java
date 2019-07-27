package SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;



public class Day10 {
	
	WebDriver d; 
	JavascriptExecutor jse;
	
	public void invokeBrowser()
	
	{
		System.setProperty("webdriver.gecko.driver",
				"D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	 d = new FirefoxDriver();
	 d.get("https://www.amazon.in/");
	 d.manage().window().maximize();
	 d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 SerachItem();
	 }
	
	public void SerachItem()
	{
		try {
			d.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
			d.findElement(By.className("nav-input")).click();
			jse = (JavascriptExecutor)d;
			jse.executeScript("scroll(0 , 400)");
//	d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[3]/div[2]/ul[8]/div/li[1]/span/span/div/label/input")).click();
			d.findElement(By.xpath("//input[@name='s-ref-checkbox-Puma']")).click();
			Thread.sleep(3000);
			System.out.println(d.getCurrentUrl());
			d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[1]/div/div[2]/div/a/img")).click();
			System.out.println(d.getCurrentUrl());
			for(String window : d.getWindowHandles())
			{
			d.switchTo().window(window);	
			System.out.println(d.getCurrentUrl());
			}
			
			
			System.out.println(d.getCurrentUrl());
			
			d.findElement(By.xpath("//*[@id='native_dropdown_selected_size_name']")).click();
			d.findElement(By.xpath("//*[@id='native_size_name_3']")).click();
			d.findElement(By.id("add-to-cart-button")).click();
			d.findElement(By.id("hlb-ptc-btn-native")).click();
			d.findElement(By.id("ap_email")).sendKeys("vivekraj.pr@gmail.com");
			d.findElement(By.id("continue")).click();
			d.findElement(By.id("ap_password")).sendKeys("iamcholan01");
			d.findElement(By.id("signInSubmit")).click();
			d.navigate().back();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day10 vp = new Day10();
		vp.invokeBrowser();

	}

}
