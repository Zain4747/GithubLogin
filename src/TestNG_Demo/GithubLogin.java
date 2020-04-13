package TestNG_Demo;

import org.openqa.selenium.By;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Common.BrowserClass;

public class GithubLogin extends BrowserClass{

	
	
	@BeforeSuite
	public void InitiateBrowser() {
		OpenBrowser("Chrome");
		
	}
	@BeforeTest
	public void openAUT() {
		 driver.get("https://github.com/");
	}
	
	@Test
	public void Login() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("login_field")).sendKeys("zain.rahimi@hotmail.com");
		driver.findElement(By.id("password")).sendKeys("Ptm@afg47");
		driver.findElement(By.name("commit")).click();
		
	}
	
	@AfterTest
	public void Logout() throws InterruptedException {
		Thread.sleep(3000);
		driver .findElement(By.xpath("//*[@class=\"dropdown-item dropdown-signout\"]"));
		
	}
		@AfterSuite
		public void CloseTestCase() throws InterruptedException {
		
			Thread.sleep(3000);
	//	driver.quit();
		
	}
}
