package program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class mouceactionmove {
	public static void main(String[] args) {
		WebDriver driver = Browser.openbrowser("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462777326&hvpos=&hvnetw=g&hvrand=8052510213650465812&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=EAIaIQobChMIhtLMpIqo-QIVSw8rCh1y8gHiEAAYASAAEgL0a_D_BwE");
		
		WebElement login = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(login);
		actions.perform();
	}

}
