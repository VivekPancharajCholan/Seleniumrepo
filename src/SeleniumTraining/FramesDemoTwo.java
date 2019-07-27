package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesDemoTwo {
	 WebDriver d;
	 
	 public void invokeBrowser()
	 {
		 System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		 d = new FirefoxDriver();
		 d.get("http://omayo.blogspot.com//p//page4_75.html");
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 d.switchTo().frame("parentIframe");
		 d.switchTo().defaultContent();
		 d.switchTo().frame("parentIframe2");
		 d.switchTo().defaultContent();
		 d.findElement(By.xpath("//input[@class='gsc-input']")).sendKeys("done");
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FramesDemoTwo fd = new FramesDemoTwo();
		fd.invokeBrowser();

	}

}
