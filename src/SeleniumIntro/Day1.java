package SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Day1 {

	WebDriver Driver;
	
	public void invokeBrowser()
	
	{

				System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
				Driver = new FirefoxDriver();
				Driver.manage().deleteAllCookies();
				Driver.manage().window().maximize();
		Driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
				
				Driver.get("https://www.amazon.in/");
				searchShoes();
		
	}
	
	public void searchShoes()
	{
	Driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
	Driver.findElement(By.className("nav-input")).click();
			
			
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
                 Day1 vp = new Day1();
                 vp.invokeBrowser();

		
	}

}
