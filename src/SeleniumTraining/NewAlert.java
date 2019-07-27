package SeleniumTraining;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewAlert {
	
	WebDriver d;
	JavascriptExecutor j;
	public void invokeBrowser()
	
	{
		
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d = new FirefoxDriver();
		
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(d, 10);

		/*WebElement w =	d.findElement(By.id("alert1"));
		w.click();
		Alert a  = d.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(a.getText());
		Thread.sleep(3000);
		
		a.accept();
		d.switchTo();
		d.findElement(By.linkText("Selenium143")).click();
		
		d.navigate().back();
		d.quit();*/
	
/*List<WebElement> w	= 	d.findElements(By.xpath("//table[@id = 'table1']//tbody//tr//*[1]"));
List<WebElement> w2	= 	d.findElements(By.xpath("//table[@id = 'table1']//tbody//tr//*[2]"));
		
	System.out.println(w.size());
		
		
		
		 for(int i = 0; i<w.size(); i++) 
		 {
			
			 if(w.get(i).getText().equals("Praveen"))
			 {
			String f =	 w2.get(i).getText();
			System.out.println(f);
			 }*/
		
			
			 
		/*		
			String d = w.get(i).getText();
			System.out.println(d);*/
		 
		
		 //try {
			d.findElement(By.className("dropbtn")).click();
			 
			// Thread.sleep(3000);
		//WebElement s=	 d.findElement(By.linkText("Flipkart"));
			 
			
//WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
			
	//		e.click();
			
// WebElement g = wait.until(ExpectedConditions.elementToBeClickable(By.id("but1")));

WebElement g  =   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("but1")));

if(g.isEnabled())
	
{
	System.out.println("Enabled");
}
     
else
{
	System.out.println("not enabled");
}

  wait.until(ExpectedConditions.elementToBeClickable(By.id("alert1"))).click();
  
 Alert a =  d.switchTo().alert();
 
 System.out.println(a.getText());
 a.accept();
 d.switchTo().defaultContent();
   
   
//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewAlert na = new NewAlert();
		na.invokeBrowser();
		
	}

}
