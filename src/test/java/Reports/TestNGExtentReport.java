package Reports;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
 
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class TestNGExtentReport implements ITestListener {
 
    private ExtentReports extent;
    private ExtentTest test;
 
    @Override
    public void onStart(ITestContext context) {
        // Initialize ExtentReports
        extent = new ExtentReports();
 
        // Common setup for ExtentReports
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/src/test/Reports/");
        htmlReporter.config().setDocumentTitle("TestNG Extent Report");
        htmlReporter.config().setReportName("TestNG Extent Report");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
 
        // Attach reporter
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("OS", System.getProperty("os.name"));
        extent.setSystemInfo("User", System.getProperty("user.name"));
    }
 
    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
 
    @Override
    public void onTestStart(ITestResult result) {
        // Create a test entry in the Extent Report with the test method name
        test = extent.createTest(result.getMethod().getMethodName()).assignCategory(result.getTestContext().getName());
        test.assignAuthor("Author Name");
 
        // Set the file name of the report with the test method name
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String reportName = "extent_" + result.getMethod().getMethodName() + "_" + timestamp + ".html";
        String reportPath = System.getProperty("user.dir") + "/src/test/Reports/" + reportName;
 
        // Create the ExtentSparkReporter with the unique filename
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter(reportPath);
        htmlReporter.config().setDocumentTitle("TestNG Extent Report - " + result.getMethod().getMethodName());
        htmlReporter.config().setReportName("TestNG Extent Report");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        extent.attachReporter(htmlReporter);
    }
// 
//    @Override
//    public void onTestSuccess(ITestResult result) {
//        test.log(Status.PASS, "Test Passed");
//    }
// 
//    @Override
//    public void onTestFailure(ITestResult result) {
//        test.log(Status.FAIL, "Test Failed");
//        test.log(Status.FAIL, result.getThrowable());
// 
//        WebDriver driver = (WebDriver) result.getTestContext().getAttribute("driver");
//        if (driver != null) {
//            String screenshotPath = captureScreenshot(driver, result.getMethod().getMethodName());
//            try {
//                test.fail("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
//            } catch (Exception e) {
//                test.log(Status.FAIL, "Failed to capture screenshot: " + e.getMessage());
//            }
//        }
//    }
// 
//    @Override
//    public void onTestSkipped(ITestResult result) {
//        test.log(Status.SKIP, "Test Skipped");
//    }
// 
//    private String captureScreenshot(WebDriver driver, String screenshotName) {
//        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//        String screenshotPath = System.getProperty("user.dir") + "/src/test/Reports/" + screenshotName + "_" + timestamp + ".png";
//        try {
//            MethodActions.takeScreenshot(driver); // Ensure this method saves the screenshot at screenshotPath
//        } catch (Exception e) {
//            test.log(Status.FAIL, "Failed to capture screenshot: " + e.getMessage());
//        }
//        return screenshotPath;
//    }
}
//has context menu