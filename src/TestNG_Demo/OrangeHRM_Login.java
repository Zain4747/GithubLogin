package TestNG_Demo;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.BrowserClass;

public class OrangeHRM_Login extends BrowserClass {

	@BeforeSuite
	public void InitiateBrowser() {
		OpenBrowser("Chrome");
	}
	@BeforeTest
	public void openAUT() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
}
	@Test
	public void Login() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}
	@AfterTest
	public void Logout() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
}
	@AfterSuite
	public void CloseTestCase() throws InterruptedException {
	
		Thread.sleep(3000);
	}
	
	
}