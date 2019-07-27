package SeleniumIntro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day5 {
	
	WebDriver d;
	
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
	 d = new FirefoxDriver();
	 d.manage().window().maximize();
	 d.get("https://www.flipkart.com/");
	 
	 loginPage();
		
	}
	
	public void loginPage()
	
	{
		
		d.findElement(By.className("_2zrpKA")).sendKeys("vivekraj.pr@gmail.com");
		//d.findElement(By.xpath("//html//body//div[3]//div//div//div//div//div[2]//div//form//div[2]//input")).sendKeys("ViPa57(*");
        
        d.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("ViPa57(*");
                                                                                              
	//	d.findElement(By.className("_2zrpKA _3v41xv")).sendKeys("ViPa57(*");
        
        //d.findElement(By.xpath("//div[@class="_2VTdOs _1_qmw3"]//span[1]")).click();
        
		d.findElement(By.xpath("//span[contains(text(), 'Login')]")).click();
		
		//d.findElement(By.xpath("//span[contains(text(),'Puma')]")).click();
			
		
		
	}
	

	public static void main(String[] args) {
		
		Day5 vp = new Day5();
       vp.invokeBrowser();
	}

}
