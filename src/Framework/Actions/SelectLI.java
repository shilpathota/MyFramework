package Framework.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectLI {
	public void SelectLItById(WebDriver driver,String id,String text){
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id(id))).click().build().perform();
	}
	public void SelectLIXpath(WebDriver driver,String xpath,String text){
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(xpath))).click().build().perform();
	}
}
