package SeleniumTraining;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOptionDemo {

	WebDriver d;
	
	JavascriptExecutor j;
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d = new FirefoxDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	try {
	WebElement we =	d.findElement(By.id("blogsmenu"));
			Actions a = new Actions(d);
			
		a.moveToElement(we).build().perform();
			d.findElement(By.linkText("SeleniumByArun")).click();
	//	 d.findElement(By.linkText("SeleniumByArun")).click();
		Thread.sleep(5000);
	d.navigate().back();
	Thread.sleep(3000);
			
			j = (JavascriptExecutor) d;
			j.executeScript("scroll(0, 1300)");
	
	WebElement er= d.findElement(By.linkText("Open a popup window"));
	//a.dragAndDropBy(er, 0, 1000);
	Thread.sleep(6000);
	
	a.contextClick(er).build().perform();
	Thread.sleep(6000);
	
	d.findElement(By.linkText("Open a popup window")).click();

          Set<String> ss  = d.getWindowHandles();
		 
           Iterator<String> dd =   ss.iterator();
           
       String main  =   dd.next();
      String pop  =  dd.next();
      
     d.switchTo().window(pop);
     d.manage().window().maximize();
     Thread.sleep(5000);
     d.close();
     Thread.sleep(5000);
     WebElement wr = d.findElement(By.id("alert1"));
        wr.click();
        Alert al = d.switchTo().alert();
       System.out.println(al.getText());
        al.accept();
        
          
        
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MouseOptionDemo md = new MouseOptionDemo();
		md.invokeBrowser();
	
	}

}
