package com.solvd.carina.demo.gui.pages.desktop;

import com.solvd.carina.demo.gui.components.forms.order.PlaceOrderForm;
import com.solvd.carina.demo.gui.components.forms.order.PlaceOrderFormBase;
import com.solvd.carina.demo.gui.pages.common.CartPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CartPageBase.class)
public class CartPage extends CartPageBase {

    @FindBy(xpath = "//*[text() = 'Products']")
    private ExtendedWebElement pageTitle;

    @FindBy(xpath = "//*[@id = 'tbodyid']//*[text() = '%s']")
    private ExtendedWebElement productName;

    @FindBy(xpath = "//*[text() = 'Delete']")
    private ExtendedWebElement deleteButton;

    @FindBy(xpath = "//button[text() = 'Place Order']")
    private ExtendedWebElement placeOrderButton;

    public CartPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(pageTitle);
    }

    @Override
    public boolean isProductPresentInCart(String product) {
        return productName.format(product).isElementPresent();
    }

    @Override
    public void clickDeleteBtn() {
        deleteButton.click();
    }

    @Override
    public PlaceOrderFormBase clickPlaceOrderBtn() {
        placeOrderButton.click();
        return new PlaceOrderForm(getDriver());
    }
}
