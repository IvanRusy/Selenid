import org.testng.*;

public class TestListener implements ITestListener, IInvokedMethodListener{
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Start");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Success");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failure");
    }


}
