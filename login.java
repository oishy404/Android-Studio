package BCL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class login extends basicbcl {
	@Test
	public void Apptest() throws MalformedURLException, InterruptedException {
		//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
	
	

		Thread.sleep(5000); 
		
//invalid password
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("01700704427");

		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("12356");
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		test.log(Status.PASS, "This step shows invalid credential login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String toast = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(toast, "invalid mobile or password.");
		test.log(Status.PASS, "This step shows the toast message for invalid password");
		Thread.sleep(5000); 
		
//invalid phone
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("0170070427");

		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("123456");
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		test.log(Status.PASS, "This step shows invalid credential login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		String msg = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		Assert.assertEquals(msg,"Invalid mobile number.");
		test.log(Status.PASS, "This step shows the toast message for invalid mobile");
		
		Thread.sleep(5000); 
		
//invalid phone and password
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("0170070427");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("12356");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "This step shows invalid credential login");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
				
				String ms = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(ms,"Invalid mobile number.");
				test.log(Status.PASS, "This step shows the toast message for invalid mobile and password");
				
				Thread.sleep(5000); 
				
//empty phone 
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("  ");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("12356");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "This step shows empty phone credential login");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
				
				String emptphn = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(emptphn,"Mobile number is required.");
				test.log(Status.PASS, "This step shows the toast message for empty phone");
				
				Thread.sleep(5000); 
				
//empty password 
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("0170070427");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "This step shows empty credential login");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
				
				String emptpass = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(emptpass,"Password is required.");
				test.log(Status.PASS, "This step shows the toast message for empaty password");
				
				Thread.sleep(5000); 
				
//empty password and phone
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("  ");

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("");
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
				test.log(Status.PASS, "This step shows invalid credential login");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
				
				String empt = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
				Assert.assertEquals(empt,"Mobile number is required.");
				test.log(Status.PASS, "This step shows the toast message for empty mobile and password");
				
				Thread.sleep(5000); 
		
//login with valid credential
		
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPhone")).sendKeys("01700704427");
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).clear();
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/etrLoginPassword")).sendKeys("123456");
		driver.findElement(By.id("com.btracsolutions.bananiclub:id/btnLogin")).click();
		test.log(Status.PASS, "This step shows valid credential login");
		Thread.sleep(10000);
		


		
	}
	
}