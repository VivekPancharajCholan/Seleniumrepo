package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumNewCommand {
	
	WebDriver d;
	
	public void invokeBrowser()
	
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d =new FirefoxDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//	boolean b	 = d.findElement(By.id("but1")).isDisplayed();
	
d.findElement(By.xpath("//h2[@class='title']")).isDisplayed();

     List<WebElement> e =   d.findElements(By.tagName("a"));
     

for(int i =0 ; i<e.size(); i++)
{
	
	boolean  b = e.get(i).isDisplayed();
	
	
	Boolean c = true;
	
	if(c = e.get(i).isDisplayed())
	{
		System.out.print(e.get(i).getText());
		System.out.println();
	}
	
	
	
}
	/*
	if(b = true)
	{
	System.out.println(b);
		
	}
	
	else
	{
		System.out.println("False");
	}
	*/
	
	
	d.quit();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SeleniumNewCommand sn = new  SeleniumNewCommand();
		 sn.invokeBrowser();

	}

}
