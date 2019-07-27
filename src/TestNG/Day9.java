package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Day9 {
	WebDriver d;
	  @Test
	  public void f() {
		  try {
			System.setProperty("webdriver.gecko.driver",
						"D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
				d = new FirefoxDriver();

				d.get("https://www.flipkart.com/");
				d.manage().deleteAllCookies();
				d.manage().window().maximize();
						Thread.sleep(3000);	
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
}
