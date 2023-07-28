package com.solvd.carina.demo.gui.pages.common;

import com.solvd.carina.demo.gui.components.navigation.TopNavigationBase;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract TopNavigationBase getTopNavigation();

    public abstract boolean isUserLoggedIn();
}
