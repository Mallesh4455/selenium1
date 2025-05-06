package NewApril;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.adactin.com/HotelApp/index.php");
		Thread.sleep(4000);
		
		driver.findElement(By.id("username")).sendKeys("Mallesh");
		driver.findElement(By.id("password")).sendKeys("Mallesh123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='login_forgot']")).click();
		driver.findElement(By.id("emailadd_recovery")).sendKeys("test123@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.id("Reset")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(4000);
		driver.navigate().to("https://www.adactin.com/HotelApp/index.php");
		
		driver.findElement(By.xpath("//td[@class='login_register']")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("username")).sendKeys("Sandeepaaaaa");
		driver.findElement(By.id("password")).sendKeys("Sandeep123");
		driver.findElement(By.id("re_password")).sendKeys("Sandeep123");
		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
