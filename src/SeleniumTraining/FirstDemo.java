package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class FirstDemo {
	
	 WebDriver d;
	JavascriptExecutor j;
	public  void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	 
	d = new FirefoxDriver();
	
	d.get("http://omayo.blogspot.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	d.findElement(By.xpath("//span[@id = 'blogsmenu']")).click();
	
	j = (JavascriptExecutor) d;
	j.executeScript("scroll(0,400)");
	
	d.findElement(By.xpath("//input[@id = 'checkbox1']")).click();
	d.findElement(By.xpath("//p[text() = 'PracticeAutomationHere']")).click();
String e =	d.findElement(By.linkText("compendiumdev")).getText();
System.out.println(e);
	//d.findElement(By.xpath("//div[@class= 'widget-content']//textarea[contains(text(), 'The cat was playing in the garden.']")).sendKeys("how are you");
	//d.findElement(By.xpath("//a[@id = 'selenium143']")).click();
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstDemo FD = new FirstDemo();
		FD.invokeBrowser();

	}

}
