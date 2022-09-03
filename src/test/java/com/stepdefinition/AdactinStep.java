package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class AdactinStep {
	
	WebDriver driver;
	
	@Given("User is on the Adactin login page")
	public void user_is_on_the_adactin_login_page() {
	    WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
	    
	}
	@When("User should login with {string},{string}")
	public void user_should_login_with(String username, String Password) {
	    
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(username);
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(Password);
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
	@When("User should search hotel using details {string}, {string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_search_hotel_using_details_and(String Location, String Hotels, String Roomtype, String NumberofRooms, String CheckInDate, String CheckOutDate, String AdultsPerRoom, String ChildrenPerRoom) {
		WebElement location1 = driver.findElement(By.id("location"));
	    Select select=new Select(location1);
	    select.selectByValue(Location);
	    
	    WebElement hotels1 = driver.findElement(By.id("hotels"));
		Select select1 =new Select(hotels1);
		select1.selectByVisibleText(Hotels);
	    
	    WebElement  roomtype= driver.findElement(By.xpath("//select[@id='room_type']"));
	     Select select2 =new Select(roomtype);
	     select2.selectByVisibleText(Roomtype);
		
	     WebElement  roomnos= driver.findElement(By.xpath("//select[@id='room_nos']"));
	     Select select3 =new Select(roomnos);
	     select3.selectByVisibleText(NumberofRooms);
	     
	     WebElement  checkindate= driver.findElement(By.xpath("//input[@id='datepick_in']"));
	     checkindate.clear();
	     WebElement  checkininput= driver.findElement(By.xpath("//input[@id='datepick_in']"));
	     checkininput.sendKeys(CheckInDate);
	     WebElement  checkoutdate= driver.findElement(By.xpath("//input[@id='datepick_out']"));
	     checkoutdate.clear();
	     WebElement  checkoutinput= driver.findElement(By.xpath("//input[@id='datepick_out']"));
	     checkoutinput.sendKeys(CheckOutDate);
	     
	     WebElement  adultroom= driver.findElement(By.id("adult_room"));
	     Select select4 =new Select(adultroom);
	     select4.selectByVisibleText(AdultsPerRoom);
	     
	     
	     WebElement  childroom= driver.findElement(By.id("child_room"));
	     Select select5 =new Select(childroom);
	     select5.selectByVisibleText(ChildrenPerRoom);
	     
	     WebElement  search= driver.findElement(By.xpath("//input[@id='Submit']"));
	     search.click();
		
	
		
	}
	@When("User should select hotel")
	public void user_should_select_hotel() {
		
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
	    radiobtn.click();
	    
	    WebElement  button = driver.findElement(By.id("continue"));
	    button.click();
	}
	@When("User should book hotel using details {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_book_hotel_using_details_and(String FirstName , String LastName, String BillingAddress, String CreditCardNo, String CreditCardType, String ExpiryMonth, String ExpiryYear, String CVVNumber ) throws InterruptedException {
		WebElement  firstname1 = driver.findElement(By.id("first_name"));
	    firstname1.sendKeys(FirstName);
	    WebElement  lastname1 = driver.findElement(By.id("last_name"));
	    lastname1.sendKeys(LastName);
	    WebElement  address1 = driver.findElement(By.id("address"));
	    address1.sendKeys(BillingAddress);
	    WebElement  cardnumber = driver.findElement(By.id("cc_num"));
	    cardnumber.sendKeys(CreditCardNo);
	    
	    WebElement  cardtype = driver.findElement(By.id("cc_type"));
	    Select select6 =new Select(cardtype);
	    select6.selectByVisibleText(CreditCardType);
	    
	    WebElement  cardexpiremonth = driver.findElement(By.id("cc_exp_month"));
	    Select select7 =new Select(cardexpiremonth);
	    select7.selectByVisibleText(ExpiryMonth);
	   
	    WebElement  cardexpireyear = driver.findElement(By.id("cc_exp_year"));
	    Select select8 =new Select(cardexpireyear);
	    select8.selectByVisibleText(ExpiryYear);
	    
	   
	    WebElement  cvv = driver.findElement(By.id("cc_cvv"));
	    cvv.sendKeys(CVVNumber);
	    
	    WebElement  clickbtn = driver.findElement(By.id("book_now"));
	    clickbtn.click();
	    
	    Thread.sleep(6000);
	}
	@Then("User should print booking order Id")
	public void user_should_print_booking_order_id() {
	    
		WebElement bookingid = driver.findElement(By.xpath("//input[@id='order_no']"));
	    String text = bookingid.getAttribute("value");
	    System.out.println("Booking Id: "+text);
	     driver.quit();
	}



}

