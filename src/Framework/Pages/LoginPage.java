package Framework.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Framework.Data.getProperty;

public class LoginPage {
	static WebDriver driver;
	static By username;
	public LoginPage() throws IOException{
		this.driver=driver;
	}
	public static void Controls() throws IOException{

		username=By.id(getProperty.get("Username","uimap"));
	
	}
	public static void username(){
		WebElement user=driver.findElement(username);
	}
}
