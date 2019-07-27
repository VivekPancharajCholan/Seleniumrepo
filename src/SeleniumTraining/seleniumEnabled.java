package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumEnabled {
	
 WebDriver d;
	public void invokeBrowser()
	
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d =new FirefoxDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println(d.findElement(By.id("but2")).isEnabled());
	
	 List<WebElement> le= d.findElements(By.xpath("//input[@name='color']"));
	 
for(int i =0; i<le.size(); i++)
{
	boolean c = true;
	if(c=le.get(i).isSelected())
	{
		System.out.println(le.get(i).getAttribute("value") + " " + "Selected");
	}
	else
	{
		
		System.out.println(le.get(i).getAttribute("value")+" " + "Not slected");
		le.get(i).click();
	}
}
		
String r = d.getPageSource();
System.out.println(r.contains("PracticeAutomationHere"));


	// d.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		seleniumEnabled se = new seleniumEnabled();
		se.invokeBrowser();

	}

}
