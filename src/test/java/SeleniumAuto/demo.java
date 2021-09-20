package SeleniumAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Tanmay\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(15000);
		driver.get("https://www.google.co.in/");
		Thread.sleep(15000);
		driver.close();
		

	}

}
