package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openbrowser("https://www.globalsqa.com/demo-site/draganddrop/");
	
		WebElement iframe = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[1]"));
		
		driver.switchTo().frame(iframe);
		
		WebElement source = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
	
		WebElement destination = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
	
		Actions actions= new Actions(driver);
	
		actions.dragAndDrop(source, destination);
		actions.perform();
		Thread.sleep(2000);
	WebElement	send =driver.findElement(By.xpath("//a[@class='ui-icon ui-icon-refresh']"));
	
	send.click();
	
	
	
	}

}
