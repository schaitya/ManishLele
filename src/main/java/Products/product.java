package Products;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class product {
	
	public WebDriver driver;
	
	By ShopPro=By.xpath("//div[@class='header-main-menu']/div[1]/a");
	
	By pass=By.xpath("//div[@class='submenu-child']/div[3]/a[1]");
	
	By click=By.xpath("//strong[text()='Free and Gentle']");
	
	public product(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement name()
	{
		 
		return driver.findElement(ShopPro);
	}
	
	public WebElement password()
	{
		return driver.findElement(pass);
	}
	
	public WebElement clicked()
	{
		return driver.findElement(click);
	}

}
