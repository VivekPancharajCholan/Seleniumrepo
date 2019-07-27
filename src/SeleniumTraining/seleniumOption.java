package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumOption {
	

	WebDriver d;
	public void invokeBrowser()
	{
		
	System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	d =new FirefoxDriver();
	d.get("http://omayo.blogspot.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	try {
		List<WebElement> list = d.findElements(By.xpath("//input[@name = 'vehicle']"));
		System.out.println(list.size());
		for(WebElement element : list)
		{
			
			if(element.isSelected())
			{
			
			System.out.println(element.getAttribute("value"));
			Thread.sleep(3000);
			}
		}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		seleniumOption so = new seleniumOption();
		so.invokeBrowser();
	}

}
