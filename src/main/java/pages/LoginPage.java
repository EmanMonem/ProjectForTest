package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginPage extends MethodHandles {
    public LoginPage(WebDriver driver) {
        super(driver);

    }

    private final By emailField = By.id("Email");

    private final By passwordField = By.id("Password");

    private final By loginButton = By.cssSelector(".button-1.login-button");

    private void insertEmail(String text){
        sendKeys(emailField,8,text);
    }
    private void insertPassword(String password){
        sendKeys(passwordField,7,password);
    }

    private void clickOnLoginButton(){
        click(loginButton,4);
    }

    public void loginFeature(String username ,String password ){
        insertEmail(username);
        insertPassword(password);
        clickOnLoginButton();
    }

}