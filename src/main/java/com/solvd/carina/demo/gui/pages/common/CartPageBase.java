package com.solvd.carina.demo.gui.pages.common;

import com.solvd.carina.demo.gui.components.forms.order.PlaceOrderFormBase;
import org.openqa.selenium.WebDriver;

public abstract class CartPageBase extends AbstractDemoBlazePage {

    public CartPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPresentInCart(String product);

    public abstract void clickDeleteBtn();

    public abstract PlaceOrderFormBase clickPlaceOrderBtn();
}
