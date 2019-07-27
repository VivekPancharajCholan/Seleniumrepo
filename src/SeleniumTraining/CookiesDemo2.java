package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CookiesDemo2 {

	WebDriver d;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	d=  new FirefoxDriver();
	d.get("http://seleniumone-by-arun.blogspot.com/");
	d.manage().window().maximize();
	//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	try {
	WebElement w=	d.findElement(By.className("goog-te-combo"));
		//w.sendKeys("Arabic");
		
	
	Select se = new Select(w);
	
List<WebElement> lw	= se.getOptions();

for (int i =0 ; i<lw.size(); i ++)
	
{
	System.out.println(lw.get(i).getText());
}
	
	
		se.selectByVisibleText("Arabic");
		
		Thread.sleep(3000);
		d.manage().deleteAllCookies();
		d.navigate().refresh();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CookiesDemo2 cd = new CookiesDemo2();
		cd.invokeBrowser();
	}

}
