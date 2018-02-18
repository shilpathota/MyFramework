package Framework.Logger;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		LoggerFile.logMessage(getClass(), "====Test Started====");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		LoggerFile.logMessage(getClass(), "====Test Passed====");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		LoggerFile.logMessage(getClass(), "====Test Failed====");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		LoggerFile.logMessage(getClass(), "====Test skipped====");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		String Suite=context.getSuite().getName();
		LoggerFile.logMessage(getClass(), "====Suite "+Suite+" started====");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		String Suite=context.getSuite().getName();
		LoggerFile.logMessage(getClass(), "====Suite "+Suite+" finished====");
	}

}
