package com.project.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility_action {

	public static void mouseHover(WebDriver driver,WebElement tgt)
	{
		utility_object.Actions_object(driver).moveToElement(tgt).perform();
	}
	
	public static void click_hold(WebDriver driver,WebElement ele)
	{
		utility_object.Actions_object(driver).clickAndHold(ele).perform();
	}
}
