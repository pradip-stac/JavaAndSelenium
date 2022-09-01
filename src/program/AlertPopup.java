package program;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopup {
	
	public static void main(String[] args) {
		
		WebDriver driver = Browser.openbrowser("https://the-internet.herokuapp.com/javascript_alerts");
		
		//WebElement abc =driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		
		//abc.click();
		
		WebElement ab = driver.findElement(By.xpath("/html/body"));
		ab.click();
		Alert a = driver.switchTo().alert();
		//a.accept();
		a.dismiss();
		
		
		
	}

}
