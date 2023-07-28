package com.solvd.carina.demo.gui.components.forms.signup;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SignUpForm extends SignUpFormBase {

    @FindBy(xpath = "//*[@class = 'modal-header']/h5[contains(text(), 'Sign up')]")
    public ExtendedWebElement formTitle;

    @FindBy(xpath = "//*[@id = 'sign-username']")
    public ExtendedWebElement usernameTextField;

    @FindBy(xpath = "//*[@id = 'sign-password']")
    public ExtendedWebElement passwordTextField;

    @FindBy(xpath = "//*[@onclick='register()']")
    public ExtendedWebElement signUpButton;

    public SignUpForm(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeUsername(String userName) {
        usernameTextField.type(userName);
    }

    @Override
    public void typePassword(String password) {
        passwordTextField.type(password);
    }

    @Override
    public boolean isSignUpFormPoppedUp() {
        return formTitle.isElementPresent();
    }

    @Override
    public void clickSignUpBtn() {
        signUpButton.click();
    }
}
