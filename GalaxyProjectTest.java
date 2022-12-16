package Galaxy;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GalaxyProjectTest {
	 WebDriver driver;
	 GalaxyProject obj;
	@BeforeTest
	public void getUrl(){

		driver = new ChromeDriver();
		obj =new GalaxyProject(driver);
		driver.get("https://galaxy.pk/");	
		driver.manage().window().maximize();
		PropertyConfigurator.configure("log4j.properties");
	}
	@Test ( priority = 0)
	  public void LaptopClick() throws InterruptedException{
	    obj.LaptopClick();
}
	@Test ( priority = 1)
	  public void PrintLaptops()throws InterruptedException{
	    obj.PrintLaptops();
}
}