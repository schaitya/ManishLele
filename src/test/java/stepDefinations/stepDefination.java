package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Products.product;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import intro.Base;

public class stepDefination extends Base {
	
	

	@Given("^Initialize the browser$")
	public void initialize_the_browser() throws Throwable {
		driver=setthings();

	}

	@Given("^User will land to Home page \"([^\"]*)\" and need to hover on Shop Products$")
	public void user_will_land_to_Home_page_and_need_to_hover_on_Shop_Products(String arg1) throws Throwable {
		driver.get(arg1);
		product pro=new product(driver);
		Actions act=new Actions(driver);
		WebElement po=pro.name();
		act.moveToElement(po).perform();
		Thread.sleep(8000L);
		pro.password().click();
		if(pro.clicked().isDisplayed())
		{
			System.out.println("Present");
		}

	}


}
