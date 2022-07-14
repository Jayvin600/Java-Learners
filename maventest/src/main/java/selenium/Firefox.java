package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().browserVersion("102.0.1").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.applevacations.com/deals/all-inclusive/#!/");
		Thread.sleep(4000);
		driver.findElement(By.id("accessible-megamenu-1657803227414-24")).click();

	}

}
