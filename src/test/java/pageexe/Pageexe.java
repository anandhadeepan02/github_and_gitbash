package pageexe;



import org.openqa.selenium.Keys;

import baseclass.Baseclass;
import locators.Loginpagelocators;

public class Pageexe extends Loginpagelocators{
	
	public static void fromdata(String data) {
		Baseclass.input_data(new Loginpagelocators().getfrom(),data );
	}
public static void todata(String data) {
	Baseclass.input_data(new Loginpagelocators().getto(),data );
}
public static void departuredate(String data ) {
	Baseclass.date(new Loginpagelocators().departuredate(),data);
}
public static void returndate(String data) {
	Baseclass.date(new Loginpagelocators().returndate(),data);
}
//public static void toclick() {
//	Baseclass.click(new Loginpagelocators().clicks());
//	
//}
public static void adding_adult() {
	Baseclass.click(new Loginpagelocators().addAdult());
}
public static void adding_children() {
	Baseclass.click(new Loginpagelocators().addChildren());
}
public static void adding_senior() {
	Baseclass.click(new Loginpagelocators().addSenior());
}
public static void adding_infant() {
	Baseclass.click(new Loginpagelocators().addInfant());
}
public static void searchFlights() {
	Baseclass.click(new Loginpagelocators().flightsearch());
}
public static void  closeButton() {
	Baseclass.click(new Loginpagelocators().close_button());
}
public static void selectFlights() {
	
	Baseclass.click(new Loginpagelocators().selet_flight());

}
public static void searchReturnFlight() {
	Baseclass.click(new Loginpagelocators().search_retutn_flight());
}
public static void clickContinue() {
	Baseclass.click(new Loginpagelocators().click_continue());
}
public static void cliclToClose() {
	Baseclass.click(new Loginpagelocators().click_to_close());
}
public static void first_Name1(String data) {
	Baseclass.input_data(new Loginpagelocators().FirstName1(),data);
}
public static void last_Name1(String data) {
	Baseclass.input_data(new Loginpagelocators().LastName1(),data);
}
public static void date_of_birth_1(String data) {
	Baseclass.date(new Loginpagelocators().dateOfBirth1(),data);
}
public static void date_of_year1(String data) {
	Baseclass.date(new Loginpagelocators().dateOfYear1(),data);
}
public static void first_Name2(String data) {
	Baseclass.input_data(new Loginpagelocators().FirstName2(),data);
}
public static void last_Name2(String data) {
	Baseclass.input_data(new Loginpagelocators().LastName2(),data);
}
public static void date_of_birth_2(String data) {
	Baseclass.date(new Loginpagelocators().dateOfBirth2(),data);
}
public static void date_of_year2(String data) {
	Baseclass.date(new Loginpagelocators().dateOfYear2(),data);
}
public static void first_Name3(String data) {
	Baseclass.input_data(new Loginpagelocators().FirstName3(),data);
}
public static void last_Name3(String data) {
	Baseclass.input_data(new Loginpagelocators().LastName3(),data);
}
public static void date_of_birth_3(String data) {
	Baseclass.date(new Loginpagelocators().dateOfBirth3(),data);
}
public static void date_of_year3(String data) {
	Baseclass.date(new Loginpagelocators().dateOfYear3(),data);
}
public static void first_Name4(String data) {
	Baseclass.input_data(new Loginpagelocators().FirstName4(),data);
}
public static void last_Name4(String data) {
	Baseclass.input_data(new Loginpagelocators().LastName4(),data);
}
public static void date_of_birth_4(String data) {
	Baseclass.date(new Loginpagelocators().dateOfBirth4(),data);
}
public static void date_of_year4(String data) {
	Baseclass.date(new Loginpagelocators().dateOfYear4(),data);
}
public static void first_Name5(String data) {
	Baseclass.input_data(new Loginpagelocators().FirstName5(),data);
}
public static void last_Name5(String data) {
	Baseclass.input_data(new Loginpagelocators().LastName5(),data);
}
public static void date_of_birth_5(String data) {
	Baseclass.date(new Loginpagelocators().dateOfBirth5(),data);
}
public static void date_of_year5(String data) {
	Baseclass.date(new Loginpagelocators().dateOfYear5(),data);
}
public static void credit_card_number(String data) {
	Baseclass.input_data(new Loginpagelocators().card_Number(),data);
}
public static void C_V_V(String data) {
	Baseclass.input_data(new Loginpagelocators().Cvv1(),data);
}
public static void credit_card_holder_name(String data) {
	Baseclass.input_data(new Loginpagelocators().cardHolderName(),data);
}
public static void billing_address(String data) {
	Baseclass.input_data(new Loginpagelocators().BillingAddress(),data);
}
public static void select_city(String data) {
	Baseclass.input_data(new Loginpagelocators().SelectCity(),data);
}
public static void enter_zipcode(String data) {
	Baseclass.input_data(new Loginpagelocators().EnterCode(),data);
}
public static void phone_number(String data) {
	Baseclass.input_data(new Loginpagelocators().PhoneNumber(),data);
}
public static void customer_email(String data) {
	Baseclass.input_data(new Loginpagelocators().customeremail(),data);
}
public static void email_password(String data) {
	Baseclass.input_data(new Loginpagelocators().customerpassword(),data);
}
public static void confirm_password(String data) {
	Baseclass.input_data(new Loginpagelocators().cnpassword(),data);
}
public static void terms_condition() {
	Baseclass.click(new Loginpagelocators().termsandcondition());
}
}
