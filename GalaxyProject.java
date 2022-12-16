package Galaxy;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GalaxyProject {
	WebDriver driver;
	Logger logger = LogManager.getLogger("GalaxyProject");

	@FindBy(xpath="(//a[@title='Laptops'])[2]")
	WebElement laptops;

	@FindBy(xpath="(//h2[@class='woocommerce-loop-product__title']")
	WebElement Names ;

	@FindBy(xpath="//span[@class='woocommerce-Price-amount amount']")
	WebElement Prices ;

	@FindBy(xpath="//div[@class='product-short-description']")
	WebElement Descriptions ;
	
	@FindBy(xpath="//select[@class='electro-wc-wppp-select c-select']")
	WebElement Select;
	
	@FindBy(xpath="//div[@class='product-thumbnail product-item__thumbnail']")
	WebElement Pictures ;
	
	
	public GalaxyProject(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	  }
	 public void LaptopClick() throws InterruptedException {
		 Thread.sleep(2000);
		 Actions action = new Actions(driver);
		 action.moveToElement(laptops).build().perform();
		 laptops.click();
	  }	 
	 public void PrintLaptops() throws InterruptedException{
		 
	     List <WebElement> Names;
	     List <String> title = new ArrayList<>();
	     for(WebElement name1 :  Names) {
	    	 title.add(name1.getText());
	     }
	     for(String laptopNames : title) {
	    	 System.out.println(laptopNames);    	 
	     }
	     
	     List <WebElement> Prices;
	     List <String> price1 = new ArrayList<>();
	     for(WebElement price2 :  Prices) {
	    	 price1.add(price2.getText());
	     }
	     for(String laptopPrices : price1) {
	    	 System.out.println(laptopPrices);    	 
	     }
	     List <WebElement>  Descriptions;
	     List <String>  description1 = new ArrayList<>();
	     for(WebElement description2 :   Descriptions) {
	    	 description1.add(description2.getText());
	     }
	     for(String laptopDescriptions :  description1) {
	    	 System.out.println(laptopDescriptions);    	 
	     }
	     for (int i= 1; i<159; i++) {
		 System.out.println(title.get(i)+ "  "+ price1.get(i)+ "  "+description1.get(i));
	     }
	 }
}
