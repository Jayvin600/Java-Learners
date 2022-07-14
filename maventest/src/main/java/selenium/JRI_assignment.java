package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JRI_assignment {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/index_justrecharge.aspx");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"signup-link9\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"signup_name\"]")).sendKeys("Chirag");
		driver.findElement(By.xpath("//*[@id=\"signup_mobileno\"]")).sendKeys("0123456789");
		driver.findElement(By.xpath("//*[@id=\"signup_email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"signup_password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"imgbtnSubmit\"]")).click();

	}

}
