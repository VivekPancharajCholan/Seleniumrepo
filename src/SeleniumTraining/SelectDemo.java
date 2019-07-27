package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {
	
	WebDriver d;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d = new FirefoxDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//d.findElement(By.id("drop1")).sendKeys("doc 2");
		
		WebElement w = d.findElement(By.id("multiselect1"));	
		 Select s = new Select(w);
		 
		 s.selectByIndex(1);
		 s.selectByIndex(3);
		 
		 s.deselectByIndex(1);
		 s.deselectByIndex(3);
		 
		 s.selectByValue("volvox");
		 s.selectByValue("swiftx");
		 s.selectByValue("Hyundaix");
		 s.selectByValue("audix");
		 
		 s.deselectByValue("volvox");
		 s.deselectByValue("audix");
		 
	
	List<WebElement>	we = s.getOptions();
	System.out.println(we.get(0).getText());
	 
	  List<WebElement>  ws =     s.getAllSelectedOptions();
	  
	  for(int i = 0; i<ws.size(); i++)
	  {
		  System.out.println(ws.get(i).getText());
	  }
	
	  
	System.out.println(s.isMultiple());
	
		/* s.selectByVisibleText("Volvo");
		 s.selectByVisibleText("Swift");
		 s.selectByVisibleText("Hyundai");
		 s.selectByVisibleText("Audi");*/
		 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SelectDemo sd =  new SelectDemo();
		sd.invokeBrowser();

	}

}
