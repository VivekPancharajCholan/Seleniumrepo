package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest {
	
	WebDriver d;
	JavascriptExecutor j;
	
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	d = new FirefoxDriver();
			d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		j = (JavascriptExecutor)d;
		j.executeScript("scroll(0,700)");
	
		
     // d.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys("test");
		
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("Vivek");
	
   d.findElement(By.xpath("//input[@type='password']")).sendKeys("Raj");
	d.findElement(By.xpath("//button[@type='button']")).click();
	
	j.executeScript("scroll(0,-600)");  
	//d.findElement(By.id("ta1")).click();
	 // d.findElement(By.id("ta1")).sendKeys("Text Message");
	 //  j.executeScript("scroll(0, 300)");  
	//d.findElement(By.xpath("//div[@class='widget-content']/textarea[text() = 'The cat was playing in the garden.']")).click();
	//d.findElement(By.xpath("//div[@class='widget-content']/textarea")).clear();
	//d.findElement(By.id("drop1")).click();
	 	d.findElement(By.id("drop1")).sendKeys("doc 3");
	d.findElement(By.id("multiselect1")).sendKeys("Hyundaix");
	d.findElement(By.id("textbox1")).clear();
	d.findElement(By.id("textbox1")).sendKeys("Text");
	//d.findElement(By.xpath("//div[@class='widget-content']//textarea[text() = 'The cat was playing in the garden']")).click();
    System.out.println(d.findElement(By.linkText("Selenium143")).getText());
 String s = d.findElement(By.id("but2")).getText();
String e =	 d.getCurrentUrl();
 String u =	 d.getTitle();	

System.out.println(s);
System.out.println(e);
	System.out.println(u);  
	d.findElement(By.id("link1")).click();
	String h =	 d.getCurrentUrl(); 
	String k =	 d.getTitle();
	 System.out.println(h);  
	System.out.println(k); 
	
	d.navigate().back();
	
	j = (JavascriptExecutor)d;
	j.executeScript("scroll(0,700)");
	
	
String z	= d.findElement(By.name("samename")).getAttribute("type");
	System.out.println(z);
	
	String n	= d.findElement(By.name("samename")).getText();
	System.out.println(n);
	
	
	d.quit();
	}                                                           
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewTest t = new NewTest();
		t.invokeBrowser();
		
	}
	

	
	
	

}
