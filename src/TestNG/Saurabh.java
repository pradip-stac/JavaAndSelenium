package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import program.Browser;

public class Saurabh {
	@Test
	public void vctc() {
		WebDriver driver = Browser.openbrowser("https://vctcpune.com/selenium/practice.html");
		WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hide.click();
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean result = textBox.isDisplayed();
		
		SoftAssert softAssert = new SoftAssert();//soft assert
		
		softAssert.assertTrue(result);//soft assert
		
		String title = driver.getTitle();
		
		softAssert.assertEquals(title,"Practice Page");
		
		System.out.println("Thank you");
		
		softAssert.assertAll();//it prints the assertion result at the end
	}

	}

