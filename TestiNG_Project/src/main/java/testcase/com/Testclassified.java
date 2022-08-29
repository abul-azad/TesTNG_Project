package testcase.com;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Testclassified 
{
    // Before run your test case, We need to open Any browser (Pre_Action).
	
	WebDriver driver;
	@BeforeTest
	
	public void Pre_Action() 
	{
	System.setProperty("webdriver.chrome.driver", "c:.//Driver//chromedriver.exe");
	driver= new ChromeDriver();
	}
	
	@Test (priority=1)
	public void BaseLogin() 
	{
	driver.get("http://automationpractice.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//*[@class='login'])")).click();
	driver.findElement(By.id("email")).sendKeys("sobhanrstech@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("sabiha2019");
	driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
	}
	
	@Test (priority=2)
	public void SearchProduct() 
	{
	System.out.println("I am Searching My Product");	
	}
	
	@Test (priority=3)
	public void SelectItem() 
	{
	System.out.println("I select my items");	
	}
	
	@Test (priority=4)
	public void AddtoCart() 
	{
	System.out.println("I add to cart my items");	
	}
	
	@Test (priority=5)
	public void AddressInfo() 
	{
	System.out.println("I provide my shoping address");	
	}
	
	@Test (enabled=false)
	public void MakePayment() 
	{
	System.out.println("I made my payment through my card");	
	}
	
	@AfterTest 
	public void CloseOperation() 
	{
	System.out.println("I want to logout now ");	
	}
	

}
