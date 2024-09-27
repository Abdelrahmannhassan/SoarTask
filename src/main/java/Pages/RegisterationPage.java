package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterationPage {

    WebDriver driver;
    String URL = "https://parabank.parasoft.com/parabank/index.htm";


    By RegisterBtn = By.xpath("//a[@href='register.htm']");
     By firstNameField = By.id("customer.firstName");
     By lastNameField = By.id("customer.lastName");
     By addressField = By.id("customer.address.street");
     By cityField = By.id("customer.address.city");
     By stateField = By.id("customer.address.state");
     By zipCodeField = By.id("customer.address.zipCode");
     By phoneNumberField = By.id("customer.phoneNumber");
     By ssnField = By.id("customer.ssn");
     By usernameField = By.id("customer.username");
     By passwordField = By.id("customer.password");
     By confirmPasswordField = By.id("repeatedPassword");
     By submitButton = By.xpath("//input[@value='Register']");


     public RegisterationPage (WebDriver driver){
        this.driver = driver;
     }

    public void navigateToRegisterationPage(){
        driver.navigate().to(URL);
        driver.findElement(RegisterBtn).click();
    }
}
