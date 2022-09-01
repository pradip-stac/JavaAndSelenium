package Practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.FaceBookLogInPagae;
import program.Browser;
import program.XlsheetData;

public class TestFacebookLogin {
    
	public void loginwithcredentialtest() throws EncryptedDocumentException, IOException
	{
		
		WebDriver driver = Browser.openbrowser("https://www.facebook.com/");
		FaceBookLogInPagae facebookloginpage = new FaceBookLogInPagae(driver);
		
		String email = XlsheetData.xldata("Sheet1", 0, 0);
		facebookloginpage.enteremailid(email);
		
	    String pass =XlsheetData.xldata("sheet1", 10, 3);
	    facebookloginpage.enterpassword(pass);
		
		facebookloginpage.clickonlogin();
	}
    
	public void loginwithemail() throws InterruptedException {
		WebDriver driver = Browser.openbrowser("https://www.facebook.com/");
		FaceBookLogInPagae facebookloginpage = new FaceBookLogInPagae(driver);
		facebookloginpage.enteremailid("pradip@gmil.com");
		Thread.sleep(2000);
		facebookloginpage.clickonlogin();
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		TestFacebookLogin obj =new TestFacebookLogin();
		//obj.loginwithcredentialtest();
		obj.loginwithemail();
		
	}
	
	}
	


