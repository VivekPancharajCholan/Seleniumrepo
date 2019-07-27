package SeleniumTraining;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RandomDemo {

	WebDriver d;
	
	public void invokeBrowser()
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d = new FirefoxDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	String test1 = "//div[@class='widget-content']/ul/li[";
	String test2 = "]/a";
	
	Logger lo = Logger.getLogger("Logger");
	
	lo.debug(d);
	
	Random r = new Random();
//int i	= r.nextInt(0);


	int y = d.findElements(By.xpath("//div[@class='widget-content']/ul/li/a")).size();
	
	lo.debug(r);
			
   
	int o = r.nextInt(y);
	
    d.findElement(By.xpath(test1+(o+1)+test2)).click();
    
    d.navigate().back();
    d.findElement(By.xpath(test1+(o+1)+test2)).click();
		
    d.navigate().back();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomDemo rd = new RandomDemo();
		rd.invokeBrowser();

	}

}
