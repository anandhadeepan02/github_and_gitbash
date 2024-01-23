package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseclass.Baseclass;

public class Loginpagelocators extends Baseclass {
	public Loginpagelocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "from1")
	private WebElement from1;

	public WebElement getfrom() {
		return from1;
	}

	@FindBy(id = "to1")
	private WebElement to1;

	public WebElement getto() {
		return to1;

	}

	@FindBy(id = "departs")
	private WebElement departs;

	public WebElement departuredate() {
		return departs;
	}

	@FindBy(id = "returns")
	private WebElement returns;

	public WebElement returndate() {
		return returns;
	}

//	@FindBy(xpath = "//span[@class='form-control-wrapper form-control-wrapper-prominent icn icn-user']")
//	private WebElement click;
//
//	public WebElement clicks() {
//		return click;
//	}

	@FindBy(xpath = "(//button[@data-trav-type='adults'])[2]")
	private WebElement add_adult;

	public WebElement addAdult() {

		return add_adult;
	}
	@FindBy(xpath = "(//button[@data-model='travelers.children'])[2]")
	private WebElement add_children;

	public WebElement addChildren() {
		return add_children;
	}

	@FindBy(xpath = "(//button[@data-model='travelers.seniors'])[2]")
	private WebElement add_senior;

	public WebElement addSenior() {
		return add_senior;
	}

	@FindBy(xpath = "(//button[@data-model='travelers.infants'])[2]")
	private WebElement add_infant;

	public WebElement addInfant() {
		return add_infant;
	}
	@FindBy(xpath="//button[@class='btn large block']")
	private WebElement search_flights;
	
	public WebElement flightsearch() {
		return search_flights;
	}
	@FindBy(xpath="//button[@class='sc-ipEyDJ bGlmlY MarketingModal__CloseButton-sc-1805bkx-1 fsxaYy']")
	private WebElement close;
	
	public WebElement close_button() {
		return close;
	}
	@FindBy(xpath="(//*[text()='$354'])[2]")
	private WebElement selectflight;
	public WebElement selet_flight() {
		

		return selectflight;
		
	}
	@FindBy(xpath="(//*[text()='$354'])[3]")
	private WebElement selectreturnflight;
	public WebElement search_retutn_flight() {
		return selectreturnflight;
	}
	@FindBy(xpath="//div[text()='Continue']")
	private WebElement clickcontinue;
	public WebElement click_continue() {
		return clickcontinue;
	}
	@FindBy(xpath="//span[@class='sc-bcXHqe bJOVkr']")
	private WebElement clicktoclose;
	public WebElement click_to_close() {
		return clicktoclose;
	}
	@FindBy(id="firstName1")
	private WebElement firstname1;
	public WebElement FirstName1() {
		return firstname1;
		
	}
	@FindBy(id="lastName1")
	private WebElement lastname1;
	public WebElement LastName1() {
		return lastname1;
	}
	@FindBy(id="dobDay1")
	private WebElement dateofbirth1;
	public WebElement dateOfBirth1() {
		return dateofbirth1;
	}
	@FindBy(id="dobYear1")
	private WebElement dateofyear1;
	public WebElement dateOfYear1() {
		return dateofyear1;
	}
	@FindBy(id="firstName2")
	private WebElement firstname2;
	public WebElement FirstName2() {
		return firstname2;
		
	}
	@FindBy(id="lastName2")
	private WebElement lastname2;
	public WebElement LastName2() {
		return lastname2;
	}
	@FindBy(id="dobDay2")
	private WebElement dateofbirth2;
	public WebElement dateOfBirth2() {
		return dateofbirth2;
	}
	@FindBy(id="dobYear2")
	private WebElement dateofyear2;
	public WebElement dateOfYear2() {
		return dateofyear2;
	}
	@FindBy(id="firstName3")
	private WebElement firstname3;
	public WebElement FirstName3() {
		return firstname3;
		
	}
	@FindBy(id="lastName3")
	private WebElement lastname3;
	public WebElement LastName3() {
		return lastname3;
	}
	@FindBy(id="dobDay3")
	private WebElement dateofbirth3;
	public WebElement dateOfBirth3() {
		return dateofbirth3;
	}
	@FindBy(id="dobYear3")
	private WebElement dateofyear3;
	public WebElement dateOfYear3() {
		return dateofyear3;
	}
	@FindBy(id="firstName4")
	private WebElement firstname4;
	public WebElement FirstName4() {
		return firstname4;
		
	}
	@FindBy(id="lastName4")
	private WebElement lastname4;
	public WebElement LastName4() {
		return lastname4;
	}
	@FindBy(id="dobDay4")
	private WebElement dateofbirth4;
	public WebElement dateOfBirth4() {
		return dateofbirth4;
	}
	@FindBy(id="dobYear4")
	private WebElement dateofyear4;
	public WebElement dateOfYear4() {
		return dateofyear4;
	}
	@FindBy(id="firstName5")
	private WebElement firstname5;
	public WebElement FirstName5() {
		return firstname5;
		
	}
	@FindBy(id="lastName5")
	private WebElement lastname5;
	public WebElement LastName5() {
		return lastname5;
	}
	@FindBy(id="dobDay5")
	private WebElement dateofbirth5;
	public WebElement dateOfBirth5() {
		return dateofbirth5;
	}
	@FindBy(id="dobYear5")
	private WebElement dateofyear5;
	public WebElement dateOfYear5() {
		return dateofyear5;
	}
	@FindBy(id="ccNum1")
	private WebElement cardnumber;
	public WebElement card_Number() {
		return cardnumber;
	}
	@FindBy(id="cvv1")
	private WebElement cvv;
	public WebElement Cvv1() {
		return cvv;
	}
	@FindBy(id="paymentName1")
	private WebElement cardholdername;
	public WebElement cardHolderName() {
		return cardholdername;
	}
	@FindBy(id="paymentAddress1")
	private WebElement billingaddress;
	public WebElement BillingAddress(){
		return billingaddress;
	}
	@FindBy(id="paymanetCity1")
	private WebElement selectcity;
	public WebElement SelectCity() {
		return selectcity;
	}
	@FindBy(id="paymentZip1")
	private WebElement entercode;
	public WebElement  EnterCode() {
		return entercode;
	}
	@FindBy(id="paymentPhone1")
	private WebElement phonenumber;
	public WebElement PhoneNumber() {
		return phonenumber;
	}
	@FindBy(id="email")
	private WebElement email;
	public WebElement  customeremail() {
		return email;
	}
	@FindBy(id="password")
	private WebElement password;
	public WebElement customerpassword() {
		return password;
	}
	@FindBy(xpath="//*[@name='confirmPassword']")
	private WebElement cnfirmpassword;
	public WebElement cnpassword() {
		return cnfirmpassword;
	}
	@FindBy(id="termsCheck")
	private WebElement termcheck;
	public WebElement termsandcondition() {
		return termcheck;
	}
}
