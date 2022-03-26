package base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\AutomationFrameworkBatchDec\\src\\main\\java\\config\\configuration.properties");
		 prop.load(file);
		}
		catch(Exception e) {
			System.out.println("File not available");
		}
		
	}
	
	static public void initilization() {
		String browser=prop.getProperty("browser");
		if(browser.contains("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Please select valid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("website"));
	}
}

	