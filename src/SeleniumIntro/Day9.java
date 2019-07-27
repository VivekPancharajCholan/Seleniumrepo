package SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day9 {
	
	WebDriver d;
	
	public void invokeBrowser()
	
	{
		try {
			System.setProperty("webdriver.gecko.driver",
					"D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
			d = new FirefoxDriver();
			d.get("https://phptravels.com/demo/");
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			Thread.sleep(9000);
			d.findElement(By.id("onesignal-popover-cancel-button")).click();
			
         d.findElement(By.xpath("//a[@class='btn btn-primary btn-lg btn-block']")).click();
			d.navigate().refresh();
			
		
			
			d.findElement(By.xpath("//html//body//nav//div//div[2]//ul[2]//ul//li[1]//a")).click();
					//	.xpath("//html//body//nav//div//div[2]//ul[2]//ul//li[1]//a"))).click();
				
		
			
			
			//loginHome();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*public void loginHome()
	{
		
	
		
		try {
			d.findElement(By.xpath("//a[@class='btn btn-primary btn-lg btn-block']")).click();
			
			
			for(String newWindow : d.getWindowHandles())
			{
				d.switchTo().window(newWindow);
			
			d.findElement(By.xpath("//html//body//nav//div//div[2]//ul[2]//ul//li[1]//a")).click();
					//	.xpath("//html//body//nav//div//div[2]//ul[2]//ul//li[1]//a"))).click();
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day9 vp = new Day9();

		vp.invokeBrowser();
	}

}
