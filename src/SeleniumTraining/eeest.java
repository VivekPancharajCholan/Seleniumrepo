package SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class eeest {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			System.setProperty("webdriver.gecko.driver", "D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
			ProfilesIni pro = new ProfilesIni();
		FirefoxProfile	defaults = pro.getProfile("name");
			WebDriver d = new FirefoxDriver();
			d.get("https://www.google.com/");
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Firefox Nightly\\firefox.exe");
			WebDriver e = new FirefoxDriver();
			e.get("https://www.google.com/");

		}




}

