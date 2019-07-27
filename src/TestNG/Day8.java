package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Day8 {
	
	WebDriver d;
  @Test
  public void f() {
	  try {
		System.setProperty("webdriver.gecko.driver",
					"D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
			d = new FirefoxDriver();

			d.get("https://phptravels.com/demo/");
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
						
			Thread.sleep(9000);
			d.findElement(By.id("onesignal-popover-cancel-button")).click();
			Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
