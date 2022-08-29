package testcase.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTestNGAuto 
{
	
	WebDriver driver;
	
	public void AutomationPractice() 
	{
	System.setProperty("webdriver.chrome.driver", "c:.//Driver//chromedriver.exe");
	driver= new ChromeDriver();	
	}
	
	@Test (groups="Smoke")
	public void Find_Store() 
	{
	System.out.println("I am finding Wlamart Store");	
	}
	
	@Test (groups="Smoke")
	public void Find_Tshirt() 
	{
	System.out.println("I am Finding My T_shirt");	
	}
	
	@Test (groups="Smoke")
	public void Get_color() 
	{
	System.out.println("I am looking for dress color");	
	}
	
	@Test (groups="Sanity")
	public void Addcart() 
	{
	System.out.println("I add all dress to cart");	
	}
	
	@Test (groups="Sanity")
	public void Make_Payment() 
	{
	System.out.println("I Made my payment");	
	}
}
