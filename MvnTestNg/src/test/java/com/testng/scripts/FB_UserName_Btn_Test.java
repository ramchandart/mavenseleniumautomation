/**
 * 
 */
package com.testng.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testng.browsers.BrowserBaseSetup;

/**
 * @author Raam
 *
 */
public class FB_UserName_Btn_Test extends BrowserBaseSetup {


	WebElement element;

	@BeforeMethod
	public void beforeMethod() {

	}

	@Test
	public void testFBUserNameBtn() throws InterruptedException {

		element = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span"));
		element.click();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}

	


}
