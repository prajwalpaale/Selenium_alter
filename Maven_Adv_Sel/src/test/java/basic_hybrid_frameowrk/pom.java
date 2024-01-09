package basic_hybrid_frameowrk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
@FindBy(name = "username")
private WebElement un_txt;
@FindBy(name = "password")
private WebElement pass_txt;
@FindBy(xpath = "//button[text()=' Login ']")
private WebElement login_btn;
@FindBy(xpath = "//span[text()='Admin']")
private WebElement admin_btn;
@FindBy(xpath = "//p[text()='George Mathew']")
private WebElement user;
@FindBy(xpath = "//a[text()='Logout']")
private WebElement logout;
public pom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getuser()
{
	return un_txt;
}
public WebElement getpass()
{
	return pass_txt;
}
public WebElement getloginbtn()
{
	return login_btn;
}
public WebElement getadmin()
{
	return admin_btn;
}
public WebElement get_user()
{
	return user;
}
public WebElement getlogout()
{
	return login_btn;
}
}
