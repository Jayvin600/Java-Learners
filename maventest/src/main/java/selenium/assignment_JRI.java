package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment_JRI {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.justrechargeit.com/");
		driver.findElement(By.xpath("//*[@id=\"txtMobileNo\"]")).sendKeys("9879515602");
		Select opretors = new Select(driver.findElement(By.xpath("//*[@id=\"ddlMobileServiceProvider\"]")));
		opretors.selectByValue("57");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"amount_textfield\"]")).sendKeys("151");
		driver.findElement(By.xpath("//*[@id=\"imgbtnMobileRecharge\"]")).click();
	}

}
