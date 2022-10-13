package com.vytrack.step_definitions;

import com.vytrack.pages.HomePage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");

        Driver.get().get(url);

        HomePage homePage = new HomePage();

        homePage.HomePageAcceptButton.click();

    }

    @When("the user enters the user information")
    public void the_user_enters_the_user_information() throws InterruptedException {
        String username = ConfigurationReader.get("user_username");
        String password = ConfigurationReader.get("user_password");

        HomePage homePage = new HomePage();

        homePage.LogInButton.click();

        Thread.sleep(2000);

        homePage.UserLogInButton.click();

        Thread.sleep(2000);

        homePage.login(username,password);


    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
        Thread.sleep(3000);
        String actualTitle = Driver.get().getTitle();

        System.out.println(actualTitle);

        Assert.assertEquals("Perfect events start with Wentsy",actualTitle);
    }






}
