package SeleniumTraining;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITDemo2 {
	
	WebDriver d;
	
	
	public void invokeBrowser() 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d = new FirefoxDriver();
		
			d.get("http://omayo.blogspot.com/");
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.manage().deleteCookie(null);
		//	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		// d.findElement(By.id("uploadfile")).click();
			
		 d.findElement(By.xpath("//input[@id ='uploadfile']")).click();
			

			
		}
	/*		
    String pathdetails = System.getProperty("user.dir");
			
    
    String filepath = "\\AutoIT\\vivek.exe";
    
		String finalpath = pathdetails + filepath;
			
     Runtime.getRuntime().exec(finalpath);
     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AutoITDemo2  it = new AutoITDemo2();
		it.invokeBrowser();

	}

}
