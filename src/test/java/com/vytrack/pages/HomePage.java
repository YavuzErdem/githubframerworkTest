package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//div/input[@inputmode='email']")
    public WebElement userEmail;

    @FindBy(xpath="//div/input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//div/button[@name='action']")
    public WebElement submit;

    @FindBy(xpath = "//div/div[@routerlink='/login']")
    public WebElement LogInButton;

    @FindBy(xpath = "(//div/a[@class='btn color-bg flat-btn wnt-login-button'])[1]")
    public WebElement UserLogInButton;

    @FindBy(xpath = "//div/a[@id='hs-eu-confirmation-button']")
    public WebElement HomePageAcceptButton;


    public void login(String userNameStr, String passwordStr) {
        userEmail.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }


}
