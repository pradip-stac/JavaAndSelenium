package program;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLink {

	public static void main(String[] args) {
		WebDriver driver = Browser.openbrowser("http://www.zlti.com");
		
		List <WebElement> ankor =driver.findElements(By.tagName("a"));
		
		for (int i = 1;i>ankor.size();i++) {
		
			WebElement tag =  ankor.get(i);
		
			String url = tag.getAttribute("href");
			
			if(url == null || url.isEmpty()) {
				System.out.println("url is not comfigured");
				continue;
			}	
				try {
					HttpURLConnection huc = (HttpURLConnection)(new URL (url).openConnection());
					huc.setRequestMethod("HEAD");
					huc.connect();
					int responseCode = huc.getResponseCode();
					System.out.println(responseCode);
					
					if(responseCode >= 400) {
						System.out.println("link is broken:-"+url);
					}
					else {
						System.out.println("link is valid:-"+url);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

