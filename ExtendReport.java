package BCL;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ExtendReport {
	ExtentSparkReporter spark;
	ExtentReports extent;
@BeforeSuite
	public void reportsetup() {
	// start reporters
	spark = new ExtentSparkReporter("Spark.html");
	

    // create ExtentReports and attach reporter(s)
    extent = new ExtentReports();
    extent.attachReporter(spark);

		
	}

@AfterSuite
	public void reportteardown() {
		
    // calling flush writes everything to the log file
    extent.flush();
	}
}
