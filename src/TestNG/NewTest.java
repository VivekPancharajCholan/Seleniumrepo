package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println(1 + "Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(2 + "beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println(3 + "afterMethod");
  }


 @BeforeClass
  public void beforeClass() {
	  System.out.println(4+ "beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(5+ "afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println(6 + "beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(7 + "afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(8 + "beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println(9 + "afterSuite");
  }

}
