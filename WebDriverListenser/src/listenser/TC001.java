package listenser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class TC001 {
	
	@Test
	
	public void webAPP(){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		// Step2: Create object for EventFiring WebDriver class
		EventFiringWebDriver eventdriver=new EventFiringWebDriver(driver);
		// Step3 : Create class where we implemented WebDriverEventListener  child class
		Driverupdate listener=new Driverupdate();
		//Step 4: Register WebDriverEventListener  child object refernce in EventFiringWebDriver class 
		eventdriver.register(listener);
		eventdriver.navigate().to("http://sampleapp.tricentis.com/101/");
		eventdriver.findElement(By.xpath("//a[text()='Automobile']")).click();
	}

}
