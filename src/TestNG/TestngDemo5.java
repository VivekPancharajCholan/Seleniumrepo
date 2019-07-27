package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo5 {
	


	
  @Test
  public void fo() {
	  System.out.println("Demo5");
  }
  
	
@BeforeGroups
public void fr()
{
	  System.out.println("Before group - Demo 3");
}
 
}
