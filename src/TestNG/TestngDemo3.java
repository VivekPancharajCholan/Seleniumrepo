package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo3 {

	
 @Test
  public void f() {
	  System.out.println("Demo3");
  }
	  
	
 @BeforeGroups
 public void fr()
 {
	  System.out.println("Before group - Demo 3");
 }
	
}
