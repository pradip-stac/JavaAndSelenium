package Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import program.Browser;

public class BrokenLink {
	
	public static void main(String[] args) {
		
		WebDriver driver = Browser.openbrowser("http://www.zlti.com");
		
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		
		for (int i = 0;i<tag.size();i++) {
			WebElement ankor = tag.get(i);
			String url = ankor.getAttribute("href");
			
			if(url == null || url.isEmpty() ) {
				System.out.println("url is not configured");
				
				continue;
			
			}		try {
							HttpURLConnection huc = (HttpURLConnection)(new URL (url).openConnection());
							
							huc.setRequestMethod("HEAD");
							huc.connect();
							
							int responseCode =  huc.getResponseCode();
							System.out.println(responseCode);
							if(responseCode>=400) {
								System.out.println("link is Broken:-"+url);
							}
							else {
								System.out.println("link is valid :-"+url);
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
				
				
			}
		}
	}
	


