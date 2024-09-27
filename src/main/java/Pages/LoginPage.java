package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    String URL = "https://parabank.parasoft.com/parabank/index.htm";


    By userNameTxt =By.name("username");
    By PasswordTxt =By.name("password");
    By loginBtn = By.xpath("//input[@value = 'Log In']");


}
