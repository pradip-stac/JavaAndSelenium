package program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouceactions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openbrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
       WebElement iframe = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])"));
		
	    driver.switchTo().frame(iframe);
	    
	   List <WebElement>source= driver.findElements(By.xpath("//img[@height='72']"));
		int a =source.size();
		
		WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions action =new Actions(driver);
		
		for(int i=0;i<a;i++) {
		WebElement img = source.get(i);
		System.out.println(img);
		action.dragAndDrop(img, destination);
		action.perform();
		Thread.sleep(2000);
			
			
		
		
	}
	
	
	
	
	}
}
