package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


	public class BrowserClass {

		public static WebDriver driver;
		
		public static void OpenBrowser(String browserName) {
			try {
				if (browserName.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zain\\Desktop\\chromeWebDriver\\chromedriver.exe");
					driver =new  ChromeDriver();
				}
				else if (browserName.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "C:\\Users\\Zain\\Desktop\\FirefoxWebDriver\\geckodriver.exe");
					driver = new FirefoxDriver();
				}
		}catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}

	}
	
}
