package SeleniumIntro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day3 {

	WebDriver d;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.gecko.driver",
					"D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");

			d = new FirefoxDriver();
			d.get("https://www.amazon.in/");
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			d.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			execution();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void execution() {

		String name = d.getTitle();

		System.out.println("Title of the page is " + name);

		d.findElement(By.partialLinkText("Today's Deals")).click();

		String url = d.getCurrentUrl();
		
		d.get(url);

		System.out.println("Current url is" + url);
		


		navigateCommand();
		/// html/body/div[1]/header/div/div[2]/div[3]/div[2]/div/a[2]

	}
	
	public void navigateCommand()
	{
		
		try {
			d.navigate().back();
			Thread.sleep(3000);
			d.navigate().forward();
			
			Thread.sleep(3000);
			d.navigate().refresh();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void elementLocator(){
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day3 vp = new Day3();

		vp.invokeBrowser();
	}

}
