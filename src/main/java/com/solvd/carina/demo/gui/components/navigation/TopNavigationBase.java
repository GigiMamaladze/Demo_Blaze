package com.solvd.carina.demo.gui.components.navigation;

import com.solvd.carina.demo.gui.components.forms.login.LogInFormBase;
import com.solvd.carina.demo.gui.components.forms.signup.SignUpFormBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class TopNavigationBase extends AbstractUIObject {

    protected TopNavigationBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract SignUpFormBase clickSignUpBtn();

    public abstract LogInFormBase clickLogInBtn();
}
