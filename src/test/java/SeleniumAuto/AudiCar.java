package SeleniumAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class AudiCar {
	
	@Parameters({"URL"})
	@BeforeTest
	public void welcome(String pmtr)
	{
		System.out.println("Welcome to Audi Car showroom");
		System.out.println(pmtr);
	}
	
	@Test
	public void catlog()
	{
		System.out.println("This is catlog for audi cars");
	}
	
	@Test
	public void servise()
	{
		System.out.println("This is the service details for Audi Car");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is the before test under Audi");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is the before Method under Audi");
	}
}
