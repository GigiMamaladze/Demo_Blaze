package com.solvd.carina.demo.gui.pages.common;

import com.solvd.carina.demo.gui.components.menu.CategoryMenuBase;
import com.solvd.carina.demo.gui.components.navigation.TopNavigationBase;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractDemoBlazePage {

    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract TopNavigationBase getTopNavigation();

    public abstract CategoryMenuBase getCategoryMenu();

    public abstract ProductPageBase clickProductName(String product);

    public abstract boolean isProductPresent(String product);

    public abstract boolean isUserLoggedIn();
}
