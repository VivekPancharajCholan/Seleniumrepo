package SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Day4 {

	WebDriver d;

	JavascriptExecutor jse;
	
	public void invokeBrowser(String url) {

		try {
			System.setProperty("webdriver.gecko.driver",
					"D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");

			d = new FirefoxDriver();
			d.get(url);
			//d.manage().deleteAllCookies();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public void commandtest()
	{
		
		try {
			//invokeBrowser("https://www.amazon.in/");
			//d.close();
			invokeBrowser("https://www.flipkart.com/");
			d.findElement(By.className("_2zrpKA")).sendKeys("vivekraj.pr@gmail.com");

			d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("ViPa57(*");
         Thread.sleep(3000);
			d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
			Thread.sleep(3000);
			d.findElement(By.xpath("//span[contains(text(), 'Men')]")).click();
			
		//	jse = (JavascriptExecutor)d;
		//	jse.executeScript("scroll(0 , 300)");	
			
			Thread.sleep(3000);
			d.findElement(By.xpath("//span[contains(text(),'Watches')]")).click();
			
	//		jse = (JavaScriptExecutor)d;
			
			jse = (JavascriptExecutor)d;
			jse.executeScript("scroll(0 , 800)");	
	          
			
			
			
			//driver.findElement(By.xpath("//span[contains(text(),'Puma')]")).click();
					
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day4 vp = new Day4();
		
         vp.commandtest();
	}

}
