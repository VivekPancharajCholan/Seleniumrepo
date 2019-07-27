package SeleniumTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileDemo {
	
	WebDriver d;
	public void invokeBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d= new FirefoxDriver();
		d.get("http://omayo.blogspot.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String path = System.getProperty("user.dir");
	String pic = "\\sample files\\Desert.jpg";
	
	String Path2 = path + pic;
	
		d.findElement(By.id("uploadfile")).sendKeys(Path2);
		
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UploadFileDemo ud = new UploadFileDemo();
		ud.invokeBrowser();
	}

}
