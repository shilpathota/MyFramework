package Framework.reusable;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Framework.Data.getProperty;

public class reusable {
	public WebDriver driver;
@BeforeTest
public void startBrowser() throws IOException{
	System.setProperty("webdriver.chrome.driver", getProperty.get("ChromePath", "data"));
	driver=new ChromeDriver();
	driver.get(getProperty.get("URL","data"));
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
}
@AfterTest
public void TearDown(ITestResult result) throws IOException{
	if(result.getStatus()==ITestResult.FAILURE){
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/screenshot.jpg"));
	}
	driver.quit();
}

}
