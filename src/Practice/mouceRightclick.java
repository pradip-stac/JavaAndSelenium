package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import program.Browser;

public class mouceRightclick {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Browser.openbrowser("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);
		
		action.contextClick(rclick);
		
		action.perform();
		
		Thread.sleep(2000);
		
		WebElement copy =driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[4]/span"));
		copy.click();
		
		Thread.sleep(2000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
	}

}
