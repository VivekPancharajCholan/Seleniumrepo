package TestNG;

import org.testng.annotations.*;

public class NewTestset {
  @Test
  public void f() {
	  System.out.println("firstclass");
  }
  
  /*@Test
  public void A() {
	  System.out.println("lastclass");
  }*/
  @BeforeTest
  public void beforeeverytest()
  {
	  System.out.println("Secondclass");
  }
  
  @AfterTest
  public void aftereverytest()
  {
	  System.out.println("thirdclass");
  }
  @BeforeClass
  public void beforeclass()
  {
	  System.out.println("Fourthclass");
  }
  @AfterClass
  public void afterclass(){
	  System.out.println("Fifthclass");
  }
  @BeforeMethod
  public void beforemethod()
  {
	  System.out.println("sixthclass");
  }
  
  @AfterMethod
  public void aftermethod()
  
  {
	  System.out.println("Seventhclass");
  }
}
