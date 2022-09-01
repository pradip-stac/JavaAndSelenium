package program;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Getdataxl {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver = Browser.openbrowser("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU5NDM3NTcwLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
	
		String ema =XlsheetData.xldata("Sheet1", 0, 0);
		
		email.sendKeys(ema);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));

		double a= XlsheetData.exelintdata("Sheet1", 8, 2);
		
		//how to fetch the data of numeric form exel;
	
	}

}
