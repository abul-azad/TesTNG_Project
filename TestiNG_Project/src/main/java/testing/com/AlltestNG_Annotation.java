package testing.com;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlltestNG_Annotation 
{//Start From here
	
	@BeforeSuite
	public void Setup_Suite()
	{
	System.out.println("This is my before suite");	
	}
	
	@BeforeTest
	public void Open_Browser1()
	{
	System.out.println("This is my open browser before test");	
	}
	
	@BeforeClass
	public void My_Class()
	{
	System.out.println("This is my before test");	
	}
	
	@BeforeMethod
	public void Get_Method()
	{
	System.out.println("This is my before test");	
	}
	
	@Test
	public void Get_Login()
	{
	System.out.println("This is my before test");	
	}
	
	@Test
	public void Get_UserName()
	{
	System.out.println("I need my user name");	
	}
	
	@Test
	public void Get_Password()
	{
	System.out.println("I need my password");	
	}
	
	@Test
	public void Get_Url()
	{
	System.out.println("I need my url link");	
	}
	
	@AfterTest
	public void Close_Browser()
	{
	System.out.println("This is my before test");	
	}
	
	public void AfterSuite()
	{
	System.out.println("This is my after Suite");	
	}
	
	public void AfterClass()
	{
	System.out.println("This is my after class");	
	}
	
	
	public void AfterMethod()
	{
	System.out.println("This is my after method");	
	}
	
}//End is here
