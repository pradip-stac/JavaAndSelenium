package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import program.Browser;

public class MouceMove {

	public static void main(String[] args) {

		WebDriver driver = Browser.openbrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement log = driver.findElement(By.xpath("//a[@class='no_border']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(log);
		
		action.perform();
		
		
		
	}

}
