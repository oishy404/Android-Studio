package BCL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


import org.Carcopolo.framework_design.utills.AndroiAction;

public class FormPage extends AndroiAction  {
	
	AndroidDriver driver;
	public FormPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(id="com.btracsolutions.bananiclub:id/etrLoginPhone")
	private WebElement phone;
	

	@AndroidFindBy(id="com.btracsolutions.bananiclub:id/etrLoginPassword")
	private WebElement password;
	
	@AndroidFindBy(id="com.btracsolutions.bananiclub:id/btnLogin")
	private WebElement login;
	

	public void setPhone(String mob)
	{
		phone.sendKeys(mob);
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void setLogin()
	{
		login.click();;
	}
	
	
}
