package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Jayvin");
		Thread.sleep(500);
		Alert name = driver.switchTo().alert();
		String simple = name.getText();
		System.out.println("name is : " + simple);
		driver.switchTo().alert().accept();

	}

}
