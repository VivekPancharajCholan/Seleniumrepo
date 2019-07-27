package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebElement {
	
	WebDriver d;
	public void invokeBrowser()
	{
		
	System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	d =new FirefoxDriver();
	d.get("http://omayo.blogspot.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

	d.findElement(By.xpath("//select[@id='drop1']/option[3]")).click();
				
			//	WebElement element = d.findElement(By.xpath("//select[@id='drop1"));
				
			//	 element.findElements(By.xpath("//option")"//*[@id= 'LinkList1']/div/ul/li/a");
	
	
	try {
		WebElement element = d.findElement(By.xpath("//*[@id= 'LinkList1']/div/ul"));
		  List<WebElement> list     =  element.findElements(By.xpath("li/a"));
		  
		  System.out.println(list.size());
		  
		  for(int i =0; i<list.size(); i++)
		  {
			  list.get(i).click();
			  d.navigate().back();
			   element = d.findElement(By.xpath("//*[@id= 'LinkList1']/div/ul"));
			  list     =  element.findElements(By.xpath("li/a"));
		  }
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SeleniumWebElement test = new SeleniumWebElement();
		test.invokeBrowser();

	}

}
