package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import program.Browser;

public class WebTable {
	WebDriver driver;
	
	public static void main(String[] args) {
		
		/*WebDriver driver = Browser.openbrowser("http://demo.guru99.com/test/web-table-element.php");
	
	
		List <WebElement>names = driver.findElements(By.xpath("//table//thead//tr//th"));
		
		 int a = names.size();
		 
		 for (int i = 0;i<a;i++) {
			WebElement namepath = names.get(i);
			String name = namepath.getText();
			System.out.println(name);
		 }
		 */
			
			WebDriver driver = Browser.openbrowser("http://demo.guru99.com/test/web-table-element.php");
		
		
			List <WebElement>price = driver.findElements(By.xpath("//table[1]//tbody[1]//tr//td[4]"));
			double max =0;
			int a = price.size();
			for (int j = 1;j<a;j++) {
				 WebElement pricepath = price.get(j);
				 String currentprice = pricepath.getText();
				double value =  Double.parseDouble(currentprice);
				if (value >max) {
					max = value;
					
				}
				
			}
			System.out.println("max price is" + max);
			
			
	
		
	
	
	
	}
	}
