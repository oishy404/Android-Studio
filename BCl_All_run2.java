package BCL;

import java.net.MalformedURLException;
//import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class BCl_All_run2 extends basicbcl {
	@Test
	public void Affliation() throws MalformedURLException, InterruptedException {
		
//Create report		
		// creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
  
		Thread.sleep(5000); 
		
//login

		FormPage formPage = new FormPage(driver);
		formPage.setPhone("01700704427");
		formPage.setPassword("123456");
		formPage.setLogin();
		Thread.sleep(3000); 


//Check BC club		
				driver.findElement(By.xpath("//android.widget.RelativeLayout[@resource-id=\'com.btracsolutions.bananiclub:id/rlMenu\']/android.widget.ImageView")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/llTheClub")).click();
				Thread.sleep(3000); 
				
				//Club History
				
				driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.btracsolutions.bananiclub:id/ivMenu\"])[1]")).click();
				Thread.sleep(5000); 

//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"taste\"))"));
//				Thread.sleep(10000); 
//	

				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
					
				//Founder Member
				
				driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.btracsolutions.bananiclub:id/ivMenu\"])[2]")).click();
				Thread.sleep(5000);
				
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"test\"))"));
				Thread.sleep(10000); 
				
//				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).flingBackward().scrollIntoView(new UiSelector().text(\"DILAN\"))"));
//				Thread.sleep(10000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Founder President Message
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[3]")).click();
				Thread.sleep(5000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Founder Advisor Message
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[4]")).click();
				Thread.sleep(5000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Guest Rules
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[5]")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Dress COde
				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[6]")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				//Timing
				
				driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.btracsolutions.bananiclub:id/textView3\"])[7]")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000);
				
				
				
	
	}

	@Test
	public void committee() throws MalformedURLException, InterruptedException {
		


//Check Committee		
				driver.findElement(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"com.btracsolutions.bananiclub:id/llCommittee\"]/android.widget.RelativeLayout")).click();
				Thread.sleep(3000); 
				
//				
//				//President msg
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[1]")).click();
				Thread.sleep(3000); 
	
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
//				
//				test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
//	
//				
//				//Present EC
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[2]")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				
				
//				//Former EC
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[3]")).click();
				Thread.sleep(3000);
		
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
//				
//				//Past President
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[4]")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
//				
//				//Present Sub Committe
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[5]")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(5000); 
				
				
	
	}

	@Test
	public void affiliation() throws MalformedURLException, InterruptedException {
		


//Check Affiliation		
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/llAffiliation")).click();
				Thread.sleep(3000); 
				
//				
//				//Club
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[1]")).click();
				Thread.sleep(3000); 
	
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
//				
//				test.log(Status.PASS, "This step shows successfully find the given club and go back to home page");
//	
//				
//				//Reciprocal
//				
				driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"com.btracsolutions.bananiclub:id/clMain\"])[2]")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(5000); 
				

	
	}
	

	@Test
	public void events() throws MalformedURLException, InterruptedException {
		


//Check Event Calendar		
				driver.findElement(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"com.btracsolutions.bananiclub:id/llEventCal\"]/android.widget.RelativeLayout")).click();
				Thread.sleep(3000); 
				
//				
//				//Event
				
				driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(id(\"com.btracsolutions.bananiclub:id/btnMore\"))"));
				Thread.sleep(10000); 
////				
//				driver.findElement(By.id( "com.btracsolutions.bananiclub:id/btnMore")).click();
//				Thread.sleep(3000); 
	
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/tvEventGuestLabel")).click();
				Thread.sleep(3000); 
			
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				
				driver.findElement(By.id("com.btracsolutions.bananiclub:id/ivBack")).click();
				Thread.sleep(3000); 
				

	
	}
	
}