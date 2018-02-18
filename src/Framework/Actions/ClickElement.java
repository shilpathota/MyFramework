package Framework.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class ClickElement {
	public static void ClickElementById(WebDriver driver,String id){
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.id(id))).click().build().perform();
	}
	public static void ClickElementbyXpath(WebDriver driver,String xpath){
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(xpath))).click().build().perform();
	}
	}
