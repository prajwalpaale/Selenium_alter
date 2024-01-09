package basic_hybrid_frameowrk;

import org.apache.hc.core5.http.ConnectionReuseStrategy;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listen implements ITestListener {

	public void onTestSuccess(ITestResult result) {
		System.out.println("testcase is success "+result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("testcase failed "+result.getName());
		
	}

}
