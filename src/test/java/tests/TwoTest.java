package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class TwoTest extends Base{
	
	WebDriver driver;
	
	@Test
	public void testTwo() throws IOException, InterruptedException {
		
		System.out.println("TestTwo");
		
		driver = initializeBrowser();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
