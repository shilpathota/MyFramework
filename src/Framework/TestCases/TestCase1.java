package Framework.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Framework.Actions.ClickElement;
import Framework.Actions.EnterText;
import Framework.Data.getProperty;
import Framework.reusable.*;

public class TestCase1 extends reusable{

@Test
public void Login() throws IOException{
	ClickElement.ClickElementbyXpath(driver, getProperty.get("LoginButton", "uimap"));	
}
}
