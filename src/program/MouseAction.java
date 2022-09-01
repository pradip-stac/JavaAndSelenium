package program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class MouseAction {
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = Browser.openbrowser("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rclick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions action = new Actions (driver);
		
		//action.contextClick(rclick);
		//action.perform();
		
		//WebElement edit = driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit context-menu-visible']"));
		
		//edit.click();
		
		//Thread.sleep(2000);
		//Alert a = driver.switchTo().alert();
		
	   // a.accept();
	    
	    WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    
	    action.doubleClick(dclick);
	    action.perform();
		
	    Thread.sleep(2000);
	    Alert a = driver.switchTo().alert();
		a.accept();
		
		
		
		
		
		
		
		
		
	}
}