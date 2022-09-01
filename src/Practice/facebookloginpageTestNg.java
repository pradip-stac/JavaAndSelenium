package Practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.FaceBookLogInPagae;
import program.Browser;

public class facebookloginpageTestNg {
	WebDriver driver;
	@BeforeMethod 
	public void launchbrowser () {
	 driver = Browser.openbrowser("https://www.facebook.com/");
	}
	@Test
	public void credentiallogin () throws InterruptedException {
		

		FaceBookLogInPagae facebookloginpage = new FaceBookLogInPagae(driver);
		Thread.sleep(2000);

		facebookloginpage.enteremailid("pradip@gmil.com");
		Thread.sleep(2000);
		
		facebookloginpage.enterpassword("1234");
		Thread.sleep(2000);

		facebookloginpage.clickonlogin();
	}
	
	@Test
	public void loginwithpass() {
		FaceBookLogInPagae facebookloginpage = new FaceBookLogInPagae(driver);
		facebookloginpage.enterpassword("1234567");
		facebookloginpage.clickonlogin();
	}
	@Test
	public void createnewac() {
		FaceBookLogInPagae facebookloginpage = new FaceBookLogInPagae(driver);
		facebookloginpage.clickoncreatenewaccount();

	}
	@AfterMethod
	public void closetab()
	{
		driver.close();
	}
	@Test
	public void loginwithemail() {
		FaceBookLogInPagae facebookloginpage = new FaceBookLogInPagae(driver);
		facebookloginpage.enteremailid("dhakne@gmail.com");
		facebookloginpage.clickonlogin();
	}
	
	
	
	
	
	
	
	
	
	
}