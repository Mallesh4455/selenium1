package HYRTaskNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HYRTask1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(4000);
		
	    Select coursedropdown = new Select(driver.findElement(By.id("course")));
	    coursedropdown.selectByVisibleText("Java");
	    coursedropdown.selectByVisibleText("Dot Net");
	    coursedropdown.selectByVisibleText("Python");
	    coursedropdown.selectByVisibleText("Javascript");
	    
	    Thread.sleep(4000);	    
	    Select idedropdown = new Select(driver.findElement(By.id("ide")));
	    idedropdown.selectByVisibleText("Eclipse");
	    idedropdown.selectByVisibleText("IntelliJ IDEA");
	    idedropdown.selectByVisibleText("Visual Studio");
	    idedropdown.selectByVisibleText("NetBeans");
	    
	    Thread.sleep(4000);
	    
	    Select idedropdowns = new Select(driver.findElement(By.id("ide")));
	    idedropdowns.deselectByVisibleText("Eclipse");
	    idedropdowns.deselectByVisibleText("IntelliJ IDEA");
	    idedropdowns.deselectByVisibleText("Visual Studio");
	    idedropdowns.deselectByVisibleText("NetBeans");
	} 	

	
}
