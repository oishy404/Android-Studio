package BCL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


import org.Carcopolo.framework_design.utills.AndroiAction;

public class update extends AndroiAction  {
	
	AndroidDriver driver;
	public update(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(id="com.btracsolutions.bananiclub:id/ivCart")
	private WebElement update;
	

	@AndroidFindBy(id="com.btracsolutions.bananiclub:id/tvEmail")
	private WebElement email;
	
	@AndroidFindBy(id="com.btracsolutions.bananiclub:id/tvMobile")
	private WebElement Mobile;
	
	@AndroidFindBy(id="com.btracsolutions.bananiclub:id/btnUpdate")
	private WebElement submit;
	
	@AndroidFindBy(id="com.btracsolutions.bananiclub:id/ivBack")
	private WebElement back;

	public void setUpdate() throws InterruptedException
	{
		update.click();
		Thread.sleep(3000); 
	}
	
	public void setEmail(String em)
	{
		email.sendKeys(em);
	}
	
	public void setMob(String phone)
	{
		Mobile.sendKeys(phone);
	}
	
	public void setSubmit()
	{
		submit.click();
	}
	
	public void setBack() throws InterruptedException
	{
		back.click();
		Thread.sleep(3000); 
	}
	
	
	
	
}
