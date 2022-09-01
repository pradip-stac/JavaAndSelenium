package program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keboardaction {

	public static void main(String[] args) {
		
		WebDriver driver = Browser.openbrowser("https://demoqa.com/text-box");
		
		WebElement form = driver.findElement(By.xpath("//input[@id='userName']"));
		
		form.sendKeys("velocity");
		
		Actions action = new Actions (driver);
		
		action.sendKeys(Keys.TAB);
	
		action.sendKeys("abc@gmail.com");
		
		action.sendKeys(Keys.TAB);
		
		action.sendKeys("parli vaijanath");
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.build().perform();
		action.keyUp(Keys.CONTROL);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		
		action.sendKeys(Keys.TAB);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		
		
		action.sendKeys(Keys.TAB);
		action.click();
		
		action.build().perform();
		
		
		
		
		
		
	}
}
