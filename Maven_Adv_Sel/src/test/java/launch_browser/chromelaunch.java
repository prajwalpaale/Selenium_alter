package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromelaunch {
public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "")
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	
}
}
