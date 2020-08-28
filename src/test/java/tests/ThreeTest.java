package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.Base;

public class ThreeTest extends Base {
	
	WebDriver driver;
	
	@Test
	public void testThree() throws IOException, InterruptedException {
		
		System.out.println("TestThree");
		
		driver = initializeBrowser();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
