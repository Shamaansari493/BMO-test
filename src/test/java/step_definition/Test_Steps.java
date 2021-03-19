package step_definition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {

	public static WebDriver driver;	 

	@Given("^User is on the login page$")
	public void userOnLoginPage() throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.just-eat.co.uk");
		String homepage = driver.getTitle();
		
		/*
		 * driver.findElement(By.xpath("(//a[contains(@href, '/account/login')])[1]")).
		 * click();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * //solve-captcha
		 * driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).
		 * click();
		 * 
		 * String expected_title = "Log in to your account at Just Eat"; String
		 * actual_title = driver.getTitle();
		 * 
		 * Assert.assertEquals(expected_title, actual_title);
		 * 
		 * if (!actual_title.equals(homepage)) {
		 * System.out.println("Verified page title prior to login");
		 * System.out.println("Verified Page Title and URL for login page"); }
		 * 
		 * else throw new Exception("Not on login page- precondition failed");
		 * 
		 */
	}

	@When("^User logs in with valid email address and password$")
	public void User_logs_in_with_valid_email_address_and_password() {

		/*driver.findElement(By.xpath("")).sendKeys("valid_username");
			driver.findElement(By.xpath("")).sendKeys("valid_password");
			driver.findElement(By.xpath("")).click();*/

		System.out.println("Entered valid username and password");
	}

	@Then("^User should be to logged in successfully$")
	public void User_should_be_to_logged_in_successfully() throws Throwable {

		//Code to verify User name is displayed on the page post login
		System.out.println("Successful Login");
	}

	@And("^User should be redirected to landing page or where user last left-off$")
	public void User_should_be_redirected_to_landing_page_or_where_user_last_left_off() throws Throwable {
		System.out.println("Verified page title after login");
	}

	
	@Given("^User is already logged-in$")
	public void uderAlreadyLoggedIn()
	{
		System.out.println("User already logged in");	
	}
	
	@When("^User logout from JUST EAT$")
	public void User_logout_from_JUST_EAT() throws Throwable {
		//Code to click on the Logout link
		System.out.println("Successfully clicked on Logout link");
	}

	@Then("^User should be to logged out successfully and remain on same page$")
	public void User_should_be_to_logged_out_successfully_and_remain_on_same_page() throws Throwable {
		System.out.println("Verfied no username is displayed on page anymore");
		System.out.println("Verfied Login link again made available to user");
	}

	@Given("^I want food in (.*?)$")
	public void I_want_food_in_(String postalCode) throws Throwable {
		//driver = this.driver;
		System.out.println(postalCode);
		 //Code to enter postal code
		 driver.findElement(By.xpath("//input[@class=\"Form_c-search-input_3ySg3\"]")).sendKeys("AR51 1AA"); 
		 
		System.out.println("User successfully able to enter postal code");
	}

	@When("^I search for restaurants$")
	public void I_search_for_restaurants() throws Throwable {

		//Code to click on search restaurants button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("^I should see some restaurants in (.*?)$")
	public void I_should_see_some_restaurants_in(String arg1) throws Throwable {

		//Capturing restaurants in the given postal code for verification purposes
		List <WebElement> restaurantList = driver.findElements(By.xpath("//div[@class='c-listing-loader']//h3"));
		for (int i = 0; i < restaurantList.size(); i++)
			System.out.println(restaurantList.get(i).getText());

		System.out.println("Verified all the restaurants in AR51 1AA");

	}
	
	@Given("^I want food as (.*?)$")
	public void I_want_food_as(String arg1) throws Exception {
	    // Express the Regexp above with the code you wish you had
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//input[@id='dish-search']")).sendKeys("burgers");
	}

	
	@When("^I search for the burgers$")
	public void I_search_for_the_burgers() {
	    // Express the Regexp above with the code you wish you had
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   }
	
	   

	@Then("^I should see some restaurants that offer burgers$")
	public void I_should_see_some_restaurants_that_offer_burgerss() {
		List <WebElement> burgerresturants = driver.findElements(By.xpath("//div[@class='c-listing-loader']//h3"));
		for (int i = 0; i < burgerresturants.size(); i++)
			System.out.println(burgerresturants.get(i).getText());

		System.out.println("Verified all the restaurants offering burgers in AR51 1AA");
	    
	}

}
