package SeleniumTraining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewItretor {

	WebDriver d;
	

	public void invokeBrowser()
	{
		
	System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	d =new FirefoxDriver();
	d.get("http://omayo.blogspot.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	Logger lo = Logger.getLogger("devpinoyLogger");
	lo.debug("start");
	lo.debug(d);
	
	String main;
	String child;
	try {
		WebElement e =	d.findElement(By.linkText("Open a popup window"));
		
	lo.debug(e);
		e.click();
		Set<String> s = d.getWindowHandles();
		
		
		 Iterator<String>  it = s.iterator();
		          
		   main = it.next();
		   
		  child = it.next();
		 d.switchTo().window(child);
		 d.manage().window().maximize();
		 Thread.sleep(3000);
		 d.close();
		 d.switchTo().window(main);
		 Thread.sleep(3000);
d.close();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
      
      
	/*
	List<WebElement> list = new ArrayList<WebElement>();
	list.add(e);
	*/
	
	lo.debug("end");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewItretor it = new NewItretor();
		it.invokeBrowser();
			

	}

}
