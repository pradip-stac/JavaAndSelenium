package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Iframe {
	
	public static void main(String[] args) {
		
		WebDriver driver = Browser.openbrowser("https://vctcpune.com/selenium/practice.html");

		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));//by xpath
	
		//driver.switchTo().frame(0);//by index of iframe
		
		driver.switchTo().frame("iframe-name");//by name of iframe
		
		WebElement a =driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
		a.click();

		//driver.switchTo().defaultContent();//to switch the focus to direct main page
		driver.switchTo().parentFrame();//to switch the focus to its immediate parent frame
		WebElement radio = driver.findElement(By.xpath("(//input[@name='radio'])[1]"));
		radio.click();
	}

}
