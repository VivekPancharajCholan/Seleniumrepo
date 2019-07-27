package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.BindingPriority;


public class TestAnnotationDemo {
	
	
	@BeforeClass
	public void demo()
	{
		System.out.println("BeforeClass");
	}
	

	@AfterClass
	public void demo2()
	{
		System.out.println("AfterClass");
	}
	
	
	@AfterMethod
	public void a()
	{
		System.out.println("After Method");
	}
	
	
	
	@BeforeMethod
	public void b()
	{
		System.out.println("Before Method");
	}
	
	
	@BeforeMethod
	public void AB()
	{
		System.out.println("Before Method2");
	}
	
	@Test (priority= 2)
	public void t()
	{
		System.out.println("Test#1");
	}
	
	@Test (priority = 3, description = "King")
	public void e()
	{
		System.out.println("Test#2");
	}
	
	@Test (priority = 1)
	
	public void s()
	{
		System.out.println("Test#3");
	}
	

}
