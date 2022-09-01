package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import program.Browser;

public class Scroll {

	public static void main(String[] args) {

		WebDriver driver = Browser.openbrowser("https://demoqa.com/text-box");
		
		//WebElement ab = driver.findElement(By.xpath(""));
		
		((JavascriptExecutor)driver).executeScript("window.scrollby(100,300)");
		
		
		
		
	}

}
