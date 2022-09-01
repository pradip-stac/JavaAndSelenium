package program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scrollupndown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =Browser.openbrowser("https://demoqa.com/text-box");
	
		WebElement abc = driver.findElement(By.xpath("//button[@id='submit']"));
		
		Thread.sleep(4000);
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",abc);
	
		  ((JavascriptExecutor)driver).executeScript("window.scrollby(100,300)");
	
	}

}
