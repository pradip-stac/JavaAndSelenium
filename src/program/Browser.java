package program;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver openbrowser(String Url)
	{
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\Chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.navigate().to(Url);
		
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
}
