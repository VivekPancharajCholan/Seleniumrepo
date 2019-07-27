package SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartTest {
	
	WebDriver d;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d = new FirefoxDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    d.findElement(By.className("_2zrpKA")).sendKeys("vivekraj.pr@gmail.com");
	    d.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("ViPa57(*");
	    d.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlipkartTest ft= new FlipkartTest();
		ft.invokeBrowser();
		

	}

}
