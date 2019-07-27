package TestNG;

import org.testng.annotations.Test;

public class NewTestdepend {
	
	
  @Test (dependsOnMethods = "c")
  public void a() {
  }
  
  @Test (enabled = false)
  public void b() {
  }
  
  @Test(groups = "A")
  public void c() {
  }
  
  @Test
  public void d() {
  }
  
}
