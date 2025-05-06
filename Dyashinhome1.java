package HYRTaskNew;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dyashinhome1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dyashin.com/");
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 5000)");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, 5000)");
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 fw-700 fs-16 css-1ey4h9j'])[7]"));
	
		driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body1 pb-1 fw-700 fs-12 css-9l3uo3'])[2]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0, 3700)");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-3 d-flex justify-content-center css-1ha4th6']")).click();
		Thread.sleep(4000);
		
		js1.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 d-flex justify-content-center mt-4 mb-4 css-15j76c0']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng']")).sendKeys("Mallesh");
		driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[2]")).sendKeys("Kumar");
		driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[3]")).sendKeys("1234567890");
		driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[4]")).sendKeys("test123@gmail.com");
		driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[5]")).sendKeys("Hi");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 d-flex justify-content-center mt-4 mb-4 css-15j76c0']")).click();
		Thread.sleep(4000);
		
		
	}

}
