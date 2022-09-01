package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import program.Browser;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = Browser.openbrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement Source=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		
		WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions action = new Actions(driver);
		
		action.dragAndDrop(Source, destination);
		action.perform();
		
		Thread.sleep(2000);
		
		WebElement back = driver.findElement(By.xpath("//a[@title='Recycle this image']"));
	
		back.click();
	
	
	
	
	}

}
