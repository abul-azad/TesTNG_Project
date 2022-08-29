package utility.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Basecofigration 
{
	
	public static String getcofigValue(String Value) 
	{
	File file = new File("./config.properties");	
	FileInputStream fis=null;
	try {
		fis=new FileInputStream(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Properties pro= new Properties();	
	try {
		pro.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return pro.getProperty(Value);
	}
	
	public static void main(String[] args) 
	{
    Basecofigration.getcofigValue("URL");
    Basecofigration.getcofigValue("UserName");
    Basecofigration.getcofigValue("Password");
    System.out.println(Basecofigration.getcofigValue("URL"));
    System.out.println(Basecofigration.getcofigValue("UserName"));
    System.out.println(Basecofigration.getcofigValue("Password"));
		
		
	}
	
	
	
	
	
	
	
}
