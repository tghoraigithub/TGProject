package SeleniumAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ToyotaCar {
	
	@Test
	public void welcome()
	{
		System.out.println("Welcome to Toyota Car showroom");
	}
	
	@Test
	public void catlog()
	{
		System.out.println("This is catlog for Toyota cars");
	}
	
	@Test
	public void servise()
	{
		System.out.println("This is the service details for Toyota Car");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("This is the before test");
	}

}
