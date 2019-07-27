package SeleniumIntro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class Day8 {

	WebDriver d;

	public void invokeBrowser() {

		try {
			System.setProperty("webdriver.gecko.driver",
					"D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
			d = new FirefoxDriver();

			d.get("https://phptravels.com/demo/");
			d.manage().deleteAllCookies();
			d.manage().window().maximize();
						
			Thread.sleep(9000);
			d.findElement(By.id("onesignal-popover-cancel-button")).click();
			Thread.sleep(3000);
			
			//d.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div/a")).click();


			String parentWindow = d.getWindowHandle();

			// d.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div/img")).click();

			//.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div/a")).click();

		WebElement w =  d.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div/a"));
		w.click();
				
	//hread.sleep(3000);	
		//or (String newWindow : d.getWindowHandles()) {
		//d.switchTo().window(newWindow);
		//

		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("loader"))).click();
	//.findElement(By.xpath("/html/body/div[13]/div/input")).sendKeys("Coimbatore, India");
		
		//d.findElement(By.id("datepicker")).click();
		
		//	loginPage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*public void loginPage()

	{

		String parentWindow = d.getWindowHandle();

		// d.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div/img")).click();

		d.findElement(By.xpath("/html/body/section[2]/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div/a")).click();

		for (String newWindow : d.getWindowHandles()) {
			d.switchTo().window(newWindow);
		}

		WebDriverWait wait = new WebDriverWait(d, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("select2-input"))).sendKeys("coimbatore");
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Day8 vp = new Day8();
		vp.invokeBrowser();
	}

}
