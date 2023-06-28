package SEl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S_02_Separate_methods {
	static WebDriver driver;
	static String browser;

	public static void setBrowser() {

		browser = "firefox";

	}

	public static void setBrowserconfig() {
		if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium server\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if (browser.contains("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\selenium server\\geckodriver.exe");
			//System.setProperty("webdriver.gecko.driver", "C:\\selenium server\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}

	public static void runTest() {
		
		driver.get("https://mvnrepository.com/");

	}

	

	public static void main(String[] args) {
		setBrowser();
		setBrowserconfig();
		runTest();
		

	}

}
