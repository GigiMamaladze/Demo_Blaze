package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.components.navigation.TopNavigation;
import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//*[@id = 'navbarExample']")
    public TopNavigation topNavigation;

    @FindBy(css = "#nameofuser")
    public ExtendedWebElement userNameLabel;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public TopNavigation getTopNavigation() {
        return topNavigation;
    }

    public boolean isUserLoggedIn() {
        return userNameLabel.isElementPresent();
    }

}
