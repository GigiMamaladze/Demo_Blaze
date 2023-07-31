package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.components.menu.CategoryMenu;
import com.solvd.carina.demo.gui.components.menu.CategoryMenuBase;
import com.solvd.carina.demo.gui.components.navigation.TopNavigation;
import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.solvd.carina.demo.gui.pages.common.ProductPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//*[@id = 'navbarExample']")
    private TopNavigation topNavigation;

    @FindBy(css = ".list-group")
    private CategoryMenu categoryMenu;

    @FindBy(css = "#nameofuser")
    private ExtendedWebElement userNameLabel;

    @FindBy(xpath = "//*[@class = 'card-title']/a[text() = '%s']")
    private ExtendedWebElement productName;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public TopNavigation getTopNavigation() {
        return topNavigation;
    }

    @Override
    public CategoryMenuBase getCategoryMenu() {
        return categoryMenu;
    }

    @Override
    public ProductPageBase clickProductName(String product) {
        productName.format(product).click();
        return new ProductPage(getDriver());
    }

    @Override
    public boolean isProductPresent(String product) {
        return productName.format(product).isElementPresent();
    }

    public boolean isUserLoggedIn() {
        return userNameLabel.isElementPresent();
    }

}
