package SeleniumAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import kotlin.jvm.Strictfp;

public class MarutiCar {
	
	
	@Test
	public void welcome()
	{
		System.out.println("Welcome to Maruti Car showroom");
		//System.out.println(urlhome);
	}
	
	@Test
	public void catlog()
	{
		System.out.println("This is catlog for Maruti cars");
	}
	
	@Test
	public void servise()
	{
		System.out.println("This is the service details for Maruti Car");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is after test method");
	}
	
	
	
	@Test
	public void openUrl() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91890\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(12000);
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
