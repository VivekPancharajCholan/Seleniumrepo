package TestNG;

import org.testng.annotations.Test;

public class NewTestprior {
	
  @Test (groups = "A")
  public void a() {
	  
  }
  
  @Test (priority = 100)
  public void b() {
	  
  }
  
  @Test (priority = 50)
  public void c() {
	  
  }
}
