package utility.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageFactory 
{
	
	@FindBy(xpath="//*[contains(@id,'logInPanelHeading')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[contains(@name,'txtUsername')]")
	WebElement UsernameBtn;
	
	@FindBy(xpath="//*[contains(@id,'txtPassword')]")
	WebElement PasswordBtn;
	
	@FindBy(xpath="//*[contains(@name,'Submit')]")
	WebElement SubmitBtn;
	private WebDriver driver;
	private WebElement LoginBtn;
	
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
	public PageFactory () 
	{
	org.openqa.selenium.support.PageFactory.initElements(driver, this);
	}
	
	public WebElement getLoginBtn () 
	{
	return LoginBtn;
	}
	
	public WebElement getUsernameBtn () 
	{
	return UsernameBtn;
	}
	
	public WebElement getPasswordBtn () 
	{
	return PasswordBtn;
	}
	
	public WebElement getSubmitBtn () 
	{
	return SubmitBtn;
	}
	
	public WebDriver getdriver () 
	{
	return driver;
	}
	
	public WebElement getLoginBtn1 () 
	{
	return LoginBtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@FindBy(xpath="//*[contains(@class,'login')]")
//    private WebElement SignInBtn;
//	
//	@FindBy(xpath="//*[@id='email']")
//	private WebElement UserName;
//	
//	@FindBy(xpath="//*[contains(@name, 'passwd')]")
//	private WebElement Password;
//	
//	@FindBy(xpath="//*[contains(@class,'icon-lock left')]")
//	private WebElement SubmitBtn;
//	
//	public WebElement getSignInBtn() {
//	return SignInBtn;
//	}
//	public WebElement getUserName() {
//	return UserName;
//	}
//	public WebElement getPassword() {
//	return Password;
//	}
//	public WebElement getSubmitBtn() {
//	return SubmitBtn;
//	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


