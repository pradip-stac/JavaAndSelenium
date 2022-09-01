package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import program.Browser;

public class Moucedoubleclick {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openbrowser("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions action = new Actions(driver);
		
		action.doubleClick(dclick);
		
		action.perform();
		
		Thread.sleep(2000);
		
		Alert a= driver.switchTo().alert();
		
		a.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
