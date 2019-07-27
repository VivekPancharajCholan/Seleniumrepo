package SeleniumTraining;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesDemo {
	
	WebDriver d;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	d = new FirefoxDriver();
		d.get("https://www.ebay.com/");
		d.manage().window().maximize();
	    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
Set<Cookie>	sc   = d.manage().getCookies();
 Iterator<Cookie>    ic       =   sc.iterator();
 
   for(int i = 0; i<sc.size(); i ++)
  {
	  Cookie co = ic.next();
	  System.out.print(co.getName());
	  System.out.println();
  }
  
   d.manage().deleteAllCookies();
   
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CookiesDemo cd = new CookiesDemo(); 
		cd.invokeBrowser();
	}

}
