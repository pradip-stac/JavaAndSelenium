package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import program.Browser;
import program.SoftAssertion;

public class Assertion {

	@Test(enabled = false)
	public void softassert() {
	WebDriver driver = Browser.openbrowser("https://vctcpune.com/selenium/practice.html");
	
	WebElement  hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
	
	//hide.click();
	
	WebElement  textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
	
	boolean result = textbox.isDisplayed();
	
	SoftAssert softassert= new SoftAssert();
	
	//softassert.assertTrue(result);
	//softassert.assertFalse(result);
	//softassert.assertEquals(result, true);
	
	softassert.assertNotEquals(result, false);
	
    System.out.println("pradip");
	softassert.assertAll();
	}
	@Test
	public void hardassert () {
		
		WebDriver driver = Browser.openbrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement  hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hide.click();
		

		WebElement  textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		boolean result = textbox.isDisplayed();
		
		//Assert.assertEquals(result,true);
		//Assert.assertNotEquals(result, true);
		//Assert.assertFalse(result);
		Assert.assertTrue(result);
		
		System.out.println("pd");
		
		
		
	}
	
	
}
