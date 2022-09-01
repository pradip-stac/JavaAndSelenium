package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	public static void main(String[] args) {
		
		WebDriver driver = Browser.openbrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement  hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		
		hide.click();
		
		WebElement  textbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		boolean result = textbox.isDisplayed();
		
		SoftAssert softassert = new SoftAssert();
		
		
		
		
		
		
		
		
		
	}

}
