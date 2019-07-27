package SeleniumIntro;

import java.util.Set;
import java.util.concurrent.TimeUnit;

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

import org.openqa.selenium.WebDriverException;

public class Day7 {

	WebDriver d;

	JavascriptExecutor jse;

	public void invokeBrowser() {
		System.setProperty("webdriver.gecko.driver",
				"D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
		d = new FirefoxDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		loginDetails();
	}

	public void loginDetails()

	{

		try {
			d.findElement(By.className("_2zrpKA")).sendKeys("vivekraj.pr@gmail.com");
			d.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("ViPa57(*");
			d.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']//span")).click();
			Thread.sleep(3000);

			d.findElement(By.xpath("//span[contains(text(), 'Men')]")).click();

			Thread.sleep(3000);

			d.findElement(By.xpath("//span[contains(text(), 'Track pants')]"));
			// d.findElement(By.xpath("//span[contains(text(),
			// 'Men')]")).click();
			mensWear();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void mensWear()

	{


		try {
			Actions a = new Actions(d);

			WebElement w = d.findElement(By.xpath("//span[contains(text(), 'Men')]"));

			a.moveToElement(w).click(w).build().perform();

			WebElement sw = d.findElement(By.xpath("//span[contains(text(), 'Track pants')]"));

		//	d.findElement(By.xpath("//span[contains(text(), 'Track pants')]"));

			a.moveToElement(sw).click(sw).build().perform();

			Thread.sleep(3000);

			// d.findElement(By.cssSelector("div._1xHtJz:nth-child(3)")).click();;

			trackPant();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// a.click().build().perform();

	}

	public void trackPant() {

		try {
			d.findElement(By.cssSelector("div._1xHtJz:nth-child(3)")).click();
			;
			d.findElement(By.xpath("//input[@class='_3vKPvR']")).sendKeys("Duke");
			Thread.sleep(3000);
			d.findElement(By
					.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div/div[1]/div/div/div/section[4]/div[2]/div[1]/div[2]/div/div/label/div[1]"))
					.click();
			Thread.sleep(3000);
			jse = (JavascriptExecutor) d;
			jse.executeScript("scroll(0, 900)");

			String parentWindow = d.getWindowHandle();

			// d.findElement(By.xpath("/html/body/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/a[1]/div[1]/div/div/img")).click();

			d.findElement(By
					.xpath("/html/body/div/div/div[1]/div/div[2]/div/div[2]/div[5]/div/div[2]/div/a[1]/div[1]/div/div/img"))
					.click();
			;

			for (String newWindow : d.getWindowHandles()) {
				d.switchTo().window(newWindow);
			}

			WebDriverWait wait = new WebDriverWait(d, 20);
			wait.until(ExpectedConditions.presenceOfElementLocated(By
					.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[1]/div/div[2]/div[6]/div[2]/div[1]/ul/li[2]/a")))
					.click();

			d.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/button"))
					.click();

			Thread.sleep(3000);

			d.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[1]/div/div[3]/div/div/a/button")).click();

			d.findElement(By.className("_2bVfmg")).click();

			Thread.sleep(3000);

			d.findElement(By.xpath("//span[contains(text(), 'Remove')]")).click();
			d.findElement(By.className("_2cyQi_")).click();
			Thread.sleep(3000);
			d.findElement(By
					.xpath("/html/body/div[1]/div/header/div[1]/div/div/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div/ul/li[7]/a/div"))
					.click();

		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args)

	{

		Day7 vp = new Day7();
		vp.invokeBrowser();

	}

}
