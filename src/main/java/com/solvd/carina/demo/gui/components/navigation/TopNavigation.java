package com.solvd.carina.demo.gui.components.navigation;

import com.solvd.carina.demo.gui.components.forms.login.LogInForm;
import com.solvd.carina.demo.gui.components.forms.login.LogInFormBase;
import com.solvd.carina.demo.gui.components.forms.signup.SignUpForm;
import com.solvd.carina.demo.gui.components.forms.signup.SignUpFormBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TopNavigation extends TopNavigationBase {

    @FindBy(css = "#signin2")
    public ExtendedWebElement signUpButton;

    @FindBy(css = "#login2")
    public ExtendedWebElement logInButton;

    public TopNavigation(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public SignUpFormBase clickSignUpBtn() {
        signUpButton.click();
        return new SignUpForm(getDriver());
    }

    @Override
    public LogInFormBase clickLogInBtn() {
        logInButton.click();
        return new LogInForm(getDriver());
    }
}
