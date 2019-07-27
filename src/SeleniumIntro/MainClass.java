package SeleniumIntro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {
       
       static WebDriver d;
       

       public static void main(String[] args) throws InterruptedException, AWTException 
       {

              method1();
       }
       
       public static void  method1() throws InterruptedException, AWTException
       {
    	   System.setProperty("webdriver.gecko.driver","D:\\New folder\\Local Disk (F)\\selenium\\geckodriver-v0.20.1-win64(1)\\geckodriver.exe");
              d = new FirefoxDriver();
              d.get("https://www.flipkart.com/");
              d.manage().window().maximize();
              Thread.sleep(2000);
              d.findElement(By.cssSelector("._29YdH8")).click();
              Thread.sleep(2000);
              d.findElement(By.xpath("//span[contains(text(), 'Men')]")).click();
              Robot robot = new Robot();
              
               robot.mouseMove(111, 344);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(500);
       }

}

