package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCodeDemoTwo {
	
	WebDriver d;
	
	public void invokeBrowser() 
	{
		
	System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	d =new FirefoxDriver();
	d.get("http://omayo.blogspot.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	d.findElement(By.xpath("//select[@id='drop1']/option[3]")).click();
	
	
	
	try {
		String Part1 = "//*[@id = 'LinkList1']/div/ul/li[";
				String Part2 = "]/a";
				
				List<WebElement>  list = d.findElements(By.xpath("//*[@id= 'LinkList1']/div/ul/li/a"));
				
				int s = list.size();
				
				for (int i =1; i<s; i++ )
				{
					
					
				WebElement w =  d.findElement(By.xpath(Part1 + i + Part2));
					
				w.click();
				Thread.sleep(3000);
				d.navigate().back();
				Thread.sleep(3000);
				}
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	d.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumCodeDemoTwo test = new SeleniumCodeDemoTwo();
		test.invokeBrowser();

	}

}
