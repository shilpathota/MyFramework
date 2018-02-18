package Framework.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterText {
	
public static void EnterTextById(WebDriver driver,String id,String text){
	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.id(id))).sendKeys(text).build().perform();
}
public static void EnterTextByXpath(WebDriver driver,String xpath,String text){
	driver.findElement(By.xpath(xpath)).sendKeys(text);
	
}
public static void EnterTextByCSS(WebDriver driver,String css,String text){
	WebElement ele = null;
	try{
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css))).sendKeys(text);
	}catch(NoSuchElementException e){
	}
}
}
