package SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Day6 {
	
	WebDriver d;
	
	//JavaScriptExecutor jse;
	
	public void invokeBrowser()
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		
		d =new FirefoxDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		loginDetails();
	}
	
	public void loginDetails()
	{
		
		try {
		d.findElement(By.className("_2zrpKA")).sendKeys("vivekraj.pr@gmail.com");
		//d.findElement(By.className("_2zrpKA _3v41xv")).sendKeys("ViPa57(*");
			d.findElement(By.xpath("//input[@type='password']")).sendKeys("ViPa57(*");
			d.findElement(By.xpath("//button[@type='submit']/span")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//span[contains(text(), 'Men')]")).click();
			Thread.sleep(3000);
		
	//Actions a = new Actions(d);
		
	//	WebElement   w = d.findElement(By.xpath("//a[@class='_3ZgIXy']/span"));
	//	a.moveToElement(w).click();
		
		
			
		d.findElement(By.xpath("//a[@class='_3ZgIXy']/span")).click();
		
	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
	public static void main (String[] args){
		
		Day6 vp = new Day6();
		vp.invokeBrowser();
	}
}
