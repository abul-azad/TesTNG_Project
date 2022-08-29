package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import utility.com.Basecofigration;

public class BasicAutomation 
{
	
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "c:.//Driver//chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get(Basecofigration.getcofigValue("URL"));
	driver.manage().window().maximize();
	PageFactory obj=new PageFactory();
	
	
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
