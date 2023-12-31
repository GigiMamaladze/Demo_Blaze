package com.solvd.carina.demo.gui.components.forms.login;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LogInForm extends LogInFormBase {

    @FindBy(css = "#logInModalLabel")
    private ExtendedWebElement formTitle;

    @FindBy(css = "#loginusername")
    private ExtendedWebElement userNameTextField;

    @FindBy(css = "#loginpassword")
    private ExtendedWebElement passwordTextField;

    @FindBy(xpath = "//*[@onclick='logIn()']")
    private ExtendedWebElement logInButton;

    public LogInForm(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isLogInFormPoppedUp() {
        return formTitle.isElementPresent();
    }

    @Override
    public void typeUsername(String userName) {
        userNameTextField.type(userName);
    }

    @Override
    public void typePassword(String password) {
        passwordTextField.type(password);
    }

    @Override
    public void clickLogInBtn() {
        logInButton.click();
    }
}
