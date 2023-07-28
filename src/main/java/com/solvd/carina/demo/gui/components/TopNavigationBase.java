package com.solvd.carina.demo.gui.components;

import com.solvd.carina.demo.gui.components.forms.SignUpForm;
import com.solvd.carina.demo.gui.components.forms.SignUpFormBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class TopNavigationBase extends AbstractUIObject {
    protected TopNavigationBase(WebDriver driver) {
        super(driver);
    }

    protected TopNavigationBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract SignUpFormBase clickSignUp();
}
