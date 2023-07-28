package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.components.TopNavigation;
import com.solvd.carina.demo.gui.components.TopNavigationBase;
import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//*[@id = 'navbarExample']")
    public TopNavigation topNavigation;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public TopNavigation getTopNavigation() {
        return topNavigation;
    }
}
