package com.testng.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testng.browsers.BrowserBaseSetup;
import com.testng.utils.ExcelUtils;

public class FB_Login_Test extends BrowserBaseSetup {
	WebElement element;

	@BeforeClass
	public void beforeClass() {
		// Nothing to do
	}

	@Test(dataProvider = "testData", priority = 0)
	public void testFBLoginPage(String emailId, String password) throws InterruptedException {

		element = driver.findElement(By.id("email"));
		element.sendKeys(emailId);
		element = driver.findElement(By.name("pass"));
		element.sendKeys(password);
		element.submit();

	}

	@Test(priority = 1)
	public void testFBUserNameBtn() throws InterruptedException {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span"));
		element.click();
		Thread.sleep(5000);
	}

	@Test(priority = 2)
	public void testFBHomeBtn() throws InterruptedException {

		element = driver.findElement(By.xpath("//*[@id=\"u_0_d\"]"));
		element.click();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void testFrndsBtn() throws InterruptedException {

		element = driver.findElement(By.xpath("//*[@id=\"findFriendsNav\"]"));
		element.click();
		Thread.sleep(5000);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	// DEFINE DATAPROVIDOR TO GET DATA FROM EXCEL
	@DataProvider(name = "testData")
	public Object[][] testDataProvidor() {
		Object[][] testDataFromExcel = ExcelUtils.readExcelData("D:\\AUTOMATION\\sampledoc.xls", "Sheet1");
		return testDataFromExcel;
	}

}
