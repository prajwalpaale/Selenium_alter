package com.project.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_javascript {

	public static void enter_disabled(WebDriver driver,String data,WebElement ele)
	{
		JavascriptExecutor jss = utility_object.javascript(driver);
		jss.executeScript("arguments[0].value='"+data+"'",ele);
	}
	
	public static void scroll_element(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor jss = utility_object.javascript(driver);
		jss.executeScript("arguments[0].scrollIntoView();",ele);
	}
	
	
}
