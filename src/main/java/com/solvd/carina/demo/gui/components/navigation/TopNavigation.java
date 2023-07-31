package com.solvd.carina.demo.gui.components.navigation;

import com.solvd.carina.demo.gui.components.forms.login.LogInForm;
import com.solvd.carina.demo.gui.components.forms.login.LogInFormBase;
import com.solvd.carina.demo.gui.components.forms.signup.SignUpForm;
import com.solvd.carina.demo.gui.components.forms.signup.SignUpFormBase;
import com.solvd.carina.demo.gui.pages.common.CartPageBase;
import com.solvd.carina.demo.gui.pages.desktop.CartPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TopNavigation extends TopNavigationBase {

    @FindBy(css = "#signin2")
    private ExtendedWebElement signUpButton;

    @FindBy(css = "#login2")
    private ExtendedWebElement logInButton;

    @FindBy(css = "#cartur")
    private ExtendedWebElement cartButton;

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

    @Override
    public CartPageBase clickCartBtn() {
        cartButton.click();
        return new CartPage(getDriver());
    }
}
