package program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser {
	
	public static void main(String[] args) {
		
		WebDriver driver =Browser.openbrowser("https://vctcpune.com");
		
		WebElement practice = driver.findElement(By.xpath("//a[@target='_blank']"));
		
		practice.click();
		
		Set<String> handles =driver.getWindowHandles();
		Iterator <String>i = handles.iterator();
		
		while(i.hasNext()) 
		{
			String handle =i.next();
			driver.switchTo().window(handle);
			String title=driver.getTitle();
			
			if(title.equals("Practice Page")) {
				WebElement radio =driver.findElement(By.xpath("//input[@type='radio']"));
				radio.click();
			}
			else {
				driver.close();
			}
			
			
			
		}
		
		
	}
}
