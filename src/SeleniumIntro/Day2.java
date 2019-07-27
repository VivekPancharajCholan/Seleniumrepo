package SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2 {
	
	private static final String JavascriptExecutor = null;
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser(){
		
		try {
			System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			searchBox();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void searchBox(){
		
		
		try {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
					driver.findElement(By.className("nav-input")).click();
			
			jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0 , 800)");
           Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Puma')]")).click();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
}

	
	public static void main (String[] args)
	
	{
		Day2 vp = new Day2();
		
		vp.invokeBrowser();
		
	}
}