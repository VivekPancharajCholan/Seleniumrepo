package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindow {
	

	WebDriver d;
	public void invokeBrowser()
	{
		
	System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	d =new FirefoxDriver();
	d.get("http://omayo.blogspot.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement e = d.findElement(By.linkText("Open a popup window"));
	e.click();
	d.switchTo();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewWindow n = new NewWindow();
		n.invokeBrowser();

	}

}
