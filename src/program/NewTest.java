package program;

import org.testng.annotations.Test;

import POM.FaceBookLogInPagae;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  FaceBookLogInPagae ob = new FaceBookLogInPagae(driver);
	//  Thread.sleep(5000);
	  ob.enteremailid("pradip@gmail.com");
	  ob.enterpassword("vgvggfgfgffgff");
	  
	  ob.clickonlogin();
  }
  @BeforeMethod
  public void beforeMethod() {
	driver =  Browser.openbrowser("https://www.facebook.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
