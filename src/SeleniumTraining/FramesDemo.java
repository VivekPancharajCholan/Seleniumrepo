package SeleniumTraining;

import java.awt.Frame;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesDemo {
	
	WebDriver d;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d = new FirefoxDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		//d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> lw	=	d.findElements(By.tagName("iframe"));
	
			 System.out.println(lw.size());
			  for(int i = 0; i<lw.size(); i++)
		  {
	           d.switchTo().frame(i);
				int we = d.findElements(By.xpath("//input[@id='q']")).size();
				if(we == 1)
				{
				System.out.println(i);	
				}
			d.switchTo().defaultContent();
		
	 }
			 d.switchTo().frame("iframe2");
	 WebElement wew = d.findElement(By.xpath("//input[@id='q']"));
	 wew.click();
	
		wew.sendKeys("Hello");
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FramesDemo fr = new FramesDemo();
		fr.invokeBrowser();

	}

}
