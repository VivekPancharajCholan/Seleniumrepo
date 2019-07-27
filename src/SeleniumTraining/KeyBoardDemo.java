package SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class KeyBoardDemo {
	
	WebDriver d;
	Keys ky;
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d = new FirefoxDriver();
		try {
			d.get("https://www.flipkart.com/");
			Thread.sleep(5000);
			d.findElement(By.className("_2zrpKA")).sendKeys("vivekraj.pr@gmail.com");
			d.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("ViPa57(*");
			d.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).sendKeys(Keys.ENTER);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyBoardDemo kb= new KeyBoardDemo();
		kb.invokeBrowser();
	}

}
