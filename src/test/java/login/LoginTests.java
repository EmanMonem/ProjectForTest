package login;

import base.BaseTests;
import data.DataModel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testLoginSuccessfully() throws FileNotFoundException {

        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature(dataModel.Login.ValidCredentials.Username , dataModel.Login.ValidCredentials.Password);


    }
    @DataProvider
    public Object[][] dataForInvalidEmail() throws FileNotFoundException {
        return dataModel().Login1;
    }

    @Test(dataProvider = "dataForInvalidEmail")
    public void testInvalidEmail(String email,String password)  {
        LoginPage loginPage = homePage.clickOnLoginLink();
        loginPage.loginFeature(email,password);
        Assert.assertTrue(loginPage.emailErrorMSGIsDisplayed());
    }
}
