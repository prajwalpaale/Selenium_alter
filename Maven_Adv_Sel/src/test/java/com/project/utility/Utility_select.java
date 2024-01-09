package com.project.utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility_select {
	
	public static void select_option(WebElement element,Object data) {
		Select selec = utility_object.select_object(element);
		
		if(data instanceof Integer)
		{
			selec.selectByIndex((Integer)data);
		}
		else if (data instanceof String) {
			try {
				selec.selectByValue((String)data);
			}
			catch (Exception e) {
				selec.selectByVisibleText((String)data);
			}
		}
	}
	public static void deselect_option(WebElement element,Object data)
	{
		Select selec = utility_object.select_object(element);
		if(data instanceof Integer)
		{
			selec.deselectByIndex((Integer)data);
		}
		else if (data instanceof String) {
			try {
				selec.deselectByValue((String)data);
			}
			catch (Exception e) {
				selec.deselectByVisibleText((String)data);
			}
		}
	}
	public static void deselectAll_option(WebElement element)
	{
		Select selec = utility_object.select_object(element);
		selec.deselectAll();
	}
	
	public static List<WebElement> All_options(WebElement element)
	{
		Select selec = utility_object.select_object(element);
		List<WebElement> all_opt = selec.getOptions();
		return all_opt;
	}
}
