package com.vytrack.step_definitions;

import com.vytrack.pages.HomePage;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");

        Driver.get().get(url);
    }

    @When("the user enters the user information")
    public void the_user_enters_the_user_information() throws InterruptedException {
        String username = ConfigurationReader.get("user_username");
        String password = ConfigurationReader.get("user_password");

        HomePage homePage = new HomePage();

      homePage.LogInButton.click();

      Thread.sleep(2000);

      homePage.UserLogInButton.click();

        // homePage.login(username,password);


    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("pass");
    }

}
