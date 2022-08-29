import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Result 
{
	
	WebDriver driver;
	@BeforeTest
	   
	public void Pre_Action() 
	{
	System.setProperty("webdriver.chrome.driver", "c:.//Driver//chromedriver.exe");
	driver= new ChromeDriver();
	}
	
	@Test
	public void BaseLogin() 
	{
	driver.get("http://automationpractice.com/");

	}
	
	@Test
	public void SearchProduct() 
	{
	System.out.println("I am Searching My Product");	
	}
	
	@Test
	public void SelectItem() 
	{
	System.out.println("I select my items");	
	}
	
	@AfterTest
	public void CloseOperation() 
	{
	System.out.println("I want to logout now ");	
	}

}
