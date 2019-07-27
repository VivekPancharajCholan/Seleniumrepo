package TestNG;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class TestngDemo1 {
	
	@BeforeClass
	public void last()
	{
		System.out.println("Beforeclass");
	}
	
	
	@AfterClass
	public void first()
	{
		System.out.println("Afterclass");
	}
	@BeforeTest 
	public void demo()
	{
		System.out.println("BeforeTest");
	}

	@Test (priority = 3)
	
	public void demo2()
	{
		System.out.println("Test#1");
	}
	
         @Test (priority = 2)
	  
	public void demo20()
	{
		System.out.println("Test#2");
	}
   @Test (priority = 1)

          public void demo21()
          {
	System.out.println("Test#3");
}

	
	
	@AfterTest
	public void demo3()
	{
		System.out.println("AfterTest");
	}
	
	@AfterMethod
	public void demo4()
	{
		System.out.println("Aftermethod");
	}
	

	@BeforeMethod
	public void demo5()
	{
		System.out.println("Beforemethod");
	}
	
	
	@After
	public void demo6()
	{
		System.out.println("After");
	}
	

	@Before
	public void demo7()
	{
		System.out.println("Before");
	}
	
}
