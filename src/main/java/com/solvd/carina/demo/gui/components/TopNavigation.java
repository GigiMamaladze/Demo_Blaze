package com.solvd.carina.demo.gui.components;

import com.solvd.carina.demo.gui.components.forms.SignUpForm;
import com.solvd.carina.demo.gui.components.forms.SignUpFormBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TopNavigation extends TopNavigationBase{

    @FindBy(xpath = "//*[@id = 'signin2']")
    public ExtendedWebElement signUpButton;


    public TopNavigation(WebDriver driver) {
        super(driver);
    }

    public TopNavigation(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public SignUpFormBase clickSignUp() {
        signUpButton.click();
        return new SignUpForm(getDriver());
    }
}
