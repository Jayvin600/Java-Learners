package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class blazedemo {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		Thread.sleep(2000);
		Select depature = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
		depature.selectByValue("San Diego");
		//Thread.sleep(5000);
		Select destination = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
		destination.selectByValue("New York");
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"inputName\"]")).sendKeys("Jayvin");
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("62 Wheat Lane");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Kitchener");
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("Ontario");
		driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("123456");
		Select cardtype = new Select(driver.findElement(By.xpath("//*[@id=\"cardType\"]")));
		cardtype.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id=\"creditCardNumber\"]")).sendKeys("1234567891234567");
		driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"creditCardMonth\"]")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"creditCardYear\"]")).sendKeys("2022");
		driver.findElement(By.xpath("//*[@id=\"nameOnCard\"]")).sendKeys("Jayvin Amrutiya");
		driver.findElement(By.xpath("//*[@id=\"rememberMe\"]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		
		
		String confirmationDetails = driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		System.out.println("text is : " + confirmationDetails);
		String details = driver.findElement(By.xpath("/html/body/div[2]/div/table")).getText();
		System.out.println("detail is : " + details);
	}

}
