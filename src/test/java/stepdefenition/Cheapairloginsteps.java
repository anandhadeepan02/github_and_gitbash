
package stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageexe.Pageexe;

public class Cheapairloginsteps extends Pageexe {

	@Given("user on the homepage")
	public void user_on_the_homepage() {
	   openbrowser();
	    	}

	@When("user  enter the from and to places {string}{string}")
	public void user_enter_the_from_and_to_places(String data, String data1) {
		fromdata(data);
		todata(data1);
	}

	@When("user enter the departure date {string}")
	public void user_enter_the_departure_date(String data) {
		 departuredate( data );
	}
	@When("user enter the return date {string}")
	public void user_enter_the_return_date(String data) {
		returndate(data);
	}
//	@When("user click to add passanger")
//	public void user_click_to_add_passanger() {
//		toclick();
//	}

	@When("user click to add adult")
	public void user_click_to_add_adult() {
		adding_adult();
	}

	@When("user click to add child")
	public void user_click_to_add_child() {
		adding_children() ;
		//adding_children() ;
	}

	@When("user click to add senior")
	public void user_click_to_add_senior() {
		adding_senior(); 
	}

	@When("user click to add adultinfant")
	public void user_click_to_add_adultinfant() {
		adding_infant();
	}
	@When("user click the search flights")
	public void user_click_the_search_flights() {
		searchFlights();
		
	}
	@When("new window is opened")
	public void new_window_is_opened() {
		handlewindow();
	}
	@When("user close the box")
	public void user_close_the_box() {
		closeButton();
		//driver.getCurrentUrl();
	}
	@When("user select the flight")
	public void user_select_the_flight() {
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectFlights();
		
	}
	@When("user select the return flight")
	public void user_select_the_return_flight() {
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchReturnFlight();
	}
	@When("user click continue")
	public void user_click_continue() {
		clickContinue();
	}
//	@When ("user click to close popup")
//	public void user_click_to_close_popup() {
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		cliclToClose() ;
//	}
	@When("user enter firstname1 and lastname1 {string} and {string}")
	public void user_enter_firstname1_and_lastname1_and(String data, String data1) {
		first_Name1( data);
		last_Name1(data1);
		
		
		
	}
	@When("user select the gender1 {string}")
	public void user_select_the_gender1(String data) {
		WebElement element1=driver.findElement(By.id("gender1"));
		Select gen1=new Select(element1);
		
		
		gen1.selectByVisibleText(data); 
	}
	@When("user enter the date of month1 , date and year {string} and  {string} and {string}")
	public void user_enter_the_date_of_month1_date_and_year_and_and(String data, String data1, String data2) {
		WebElement month1=driver.findElement(By.id("dobMonth1"));
		Select mth1=new Select(month1);
		mth1.selectByVisibleText(data);
		date_of_birth_1( data1);
		date_of_year1( data2);
	}
	@When("user enter firstname2 and lastname2 {string} and {string}")
	public void user_enter_firstname2_and_lastname2_and(String data, String data1) {

		first_Name2( data);
		last_Name2(data1);
	}

	@When("user select the gender2 {string}")
	public void user_select_the_gender2(String data) {
		WebElement element1=driver.findElement(By.id("gender2"));
		Select gen1=new Select(element1);
		
		
		gen1.selectByVisibleText(data);  
	   
	}
	@When("user enter the date of month2 , date and year {string} and  {string} and {string}")
	public void user_enter_the_date_of_month2_date_and_year_and_and(String data, String data1, String data2) {
		WebElement month1=driver.findElement(By.id("dobMonth2"));
		Select mth1=new Select(month1);
		mth1.selectByVisibleText(data);
		date_of_birth_2( data1);
		date_of_year2( data2);
	}

	@When("user enter firstname3 and lastname3 {string} and {string}")
	public void user_enter_firstname3_and_lastname3_and(String data, String data1) {
		first_Name3( data);
		last_Name3(data1);
	}

	@When("user select the gender3 {string}")
	public void user_select_the_gender3(String data) {
		WebElement element1=driver.findElement(By.id("gender3"));
		Select gen1=new Select(element1);
		
		
		gen1.selectByVisibleText(data);    
	}

	@When("user enter the date of month3 , date and year {string} and  {string} and {string}")
	public void user_enter_the_date_of_month3_date_and_year_and_and(String data, String data1, String data2) {
		WebElement month1=driver.findElement(By.id("dobMonth3"));
		Select mth1=new Select(month1);
		mth1.selectByVisibleText(data); 
		date_of_birth_3( data1);
		date_of_year3( data2);
	}

	@When("user enter firstname4 and lastname4 {string} and {string}")
	public void user_enter_firstname4_and_lastname4_and(String data, String data1) {
		first_Name4( data);
		last_Name4(data1);
	}

	@When("user select the gender4 {string}")
	public void user_select_the_gender4(String data) {
		WebElement element1=driver.findElement(By.id("gender4"));
		Select gen1=new Select(element1);
		
		
		gen1.selectByVisibleText(data);    
	}

	@When("user enter the date of month4 , date and year {string} and  {string} and {string}")
	public void user_enter_the_date_of_month4_date_and_year_and_and(String data, String data1, String data2) {
		WebElement month1=driver.findElement(By.id("dobMonth4"));
		Select mth1=new Select(month1);
		mth1.selectByVisibleText(data);
		date_of_birth_4( data1);
		date_of_year4( data2);
	}

	@When("user enter firstname5 and lastname5 {string} and {string}")
	public void user_enter_firstname5_and_lastname5_and(String data, String data1) {
		first_Name5( data);
		last_Name5(data1);
	}

	@When("user select the gender5 {string}")
	public void user_select_the_gender5(String data) {
		WebElement element1=driver.findElement(By.id("gender5"));
		Select gen1=new Select(element1);
		
		
		gen1.selectByVisibleText(data);   
	}

	@When("user enter the date of month5 , date and year {string} and  {string} and {string}")
	public void user_enter_the_date_of_month5_date_and_year_and_and(String data, String data1, String data2) {
		WebElement month1=driver.findElement(By.id("dobMonth5"));
		Select mth1=new Select(month1);
		mth1.selectByVisibleText(data); 
		date_of_birth_5( data1);
		date_of_year5( data2);
	}
	@When("user enter the card number {string}")
	public void user_enter_the_card_number(String data) {
		credit_card_number( data);
	    
	}

	@When("user enter the month year and cvv {string} {string} {string}")
	public void user_enter_the_month_year_and_cvv(String data, String data1, String data2) {
	   WebElement cardmonth=driver.findElement(By.id("expMonth1"));
	   Select expirymonth= new Select(cardmonth);
	   expirymonth.selectByVisibleText(data);
	   WebElement cardyear=driver.findElement(By.id("expYear1"));
	   Select expiryyear=new Select(cardyear);
	   expiryyear.selectByVisibleText(data1);
	   C_V_V( data2);
	    
	}

	@When("user enter the cardholder name {string}")
	public void user_enter_the_cardholder_name(String data) {
		credit_card_holder_name( data) ;
	    
	}

	@When("user enter the country name {string}")
	public void user_enter_the_country_name(String data) {
	   WebElement countryname=driver.findElement(By.id("paymentCountry1"));
	   Select customercountry=new Select(countryname);
	   customercountry.selectByVisibleText(data);
	    
	}

	@When("user enter the billing address {string}")
	public void user_enter_the_billing_address(String data) {
		billing_address( data);
	    
	}

	@When("user select the city {string}")
	public void user_select_the_city(String data) {
	   
		select_city( data);
	}

//	@When("user select the state {string}")
//	public void user_select_the_state(String data) {
//	  WebElement customerstate=driver.findElement(By.id("paymentState1")) ;
//	    Select ststeofthecustomer=new Select(customerstate);
//	    ststeofthecustomer.selectByVisibleText(data);
//	}

//	@When("user enter the zipcode {string}")
//	public void user_enter_the_zipcode(String data) {
//		enter_zipcode( data) ;
//	    
//	}

	@When("user enter the billing phone number {string}")
	public void user_enter_the_billing_phone_number(String data) {
	   
		phone_number( data);
	}

	@When("user enter the email {string}")
	public void user_enter_the_email(String data) {
	   
		customer_email( data);
	}

	@When("user enter create password {string}")
	public void user_enter_create_password(String data) {
	   
		email_password( data);
	}

	@When("user enter the confirm password {string}")
	public void user_enter_the_confirm_password(String data) {
	   
		confirm_password( data);
	}

	@When("user click to accept the terms and conditions")
	public void user_click_to_accept_the_terms_and_conditions() {
		terms_condition() ;
	    
	}


	}