package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import program.Browser;

public class Dragdrop {
  
	public static void main(String[] args) throws InterruptedException {
	

		WebDriver driver = Browser.openbrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(iframe);
		
		List<WebElement> Source=driver.findElements(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])"));
		
		int a = Source.size();
		System.out.println(a);
		
		WebElement Destination = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions action = new Actions(driver);
		
		for(int i = 0;i<a;i++) {
			
		WebElement image =	Source.get(i);
		action.dragAndDrop(image,Destination);
		action.perform();
		Thread.sleep(1000);
			
		}		
	
		Thread.sleep(1000);
		List<WebElement> back =driver.findElements(By.xpath("//a[@title='Recycle this image']"));
		
		int b = back.size();
		for(int j=0;j<b;j++) {
			WebElement img = back.get(j);
			action.click(img);
			action.perform();
			Thread.sleep(1000);
		
		}
	}
	
}
