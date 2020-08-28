package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import resources.Base;

public class FourTest extends Base {
	
	public WebDriver driver;
	
	@Test
	public void testFour() throws IOException, InterruptedException {
		
		System.out.println("TestFour - Updated this text - Updated by other Tester in different machine - subbranch");
		
		driver = initializeBrowser();
		
		driver.get("http://tutorialsninja.com/demo/");
		
		Assert.assertTrue(false);
	
	}
	
	
	@AfterMethod
	public void closure() {
		
		driver.close();
		
	}

}
