package basic_hybrid_frameowrk;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
public static void getphoto(WebDriver driver) throws IOException
{
	Date d=new Date();
	String da = d.toString().replaceAll(":", "-");
	
	TakesScreenshot tss=(TakesScreenshot)driver;
	File src = tss.getScreenshotAs(OutputType.FILE);
	File dst=new File("./photo/"+da+".jpg");
	FileHandler.copy(src, dst);
}
}
