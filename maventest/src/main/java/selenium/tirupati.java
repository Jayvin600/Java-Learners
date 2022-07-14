package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tirupati {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		Thread.sleep(5000);
		Select Country = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]/div/div[1]/form/div[2]/div[4]/select")));
		Country.selectByValue("number:1001");
		Select State = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div[4]/div/div[1]/form/div[2]/div[5]/select")));
		State.selectByValue("number:107");


	}

}
