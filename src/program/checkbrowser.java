package program;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkbrowser {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver  =Browser.openbrowser("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjU5MzI1OTY3LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("pradip");
		WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("1234");
		ScreenShot.Snap(driver, "pradip");
	}
	
		
	}


