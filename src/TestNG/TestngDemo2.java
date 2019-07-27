package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo2 {
	

	
  @Test (groups = ("group1"))
  public void f() {
	  
	  System.out.println("Demo2");
  }
	  
  
  @BeforeGroups
  public void fr()
  {
  	  System.out.println("Before group - Demo 2");
  }
 
	  
  }

