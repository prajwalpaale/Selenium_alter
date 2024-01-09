package basic_hybrid_frameowrk;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import bsh.engine.BshScriptEngine;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class implements frameWork_constant{
 public WebDriver driver;
@BeforeMethod
public void openApp()
{
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	driver=new ChromeDriver(opt);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(base_url);

}
@AfterMethod
public void closeApp(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{

		screenshot.getphoto(driver);
	}
	driver.close();
}
}
