package basic_hybrid_frameowrk;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class runner extends base_class{
@Test(dataProvider = "logincred")
public void login(String un, String pwd) throws InterruptedException
{
	pom p=new pom(driver);
	p.getuser().sendKeys(un);
	Thread.sleep(2000);
	p.getpass().sendKeys(pwd);
	Thread.sleep(2000);
	p.getloginbtn().click();
	Thread.sleep(2000);
	p.getadmin().click();
	Thread.sleep(2000);
	p.get_user().click();
	Thread.sleep(2000);
	p.getlogout().click();
	Thread.sleep(2000);
	
}
@DataProvider(name = "logincred")
public Object[][] data()
{
	return new Object[][] {
		{"admin","admin123"}
	};
}
}
