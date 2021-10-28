package SeleniumProject.Test_Amezon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lunch {

	@Test
	public void lunch() throws InterruptedException {
		System.out.println("Lunched");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siddu\\Desktop\\Selenium Component\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
		Thread.sleep(2000);
		driver.close();
	}

}
