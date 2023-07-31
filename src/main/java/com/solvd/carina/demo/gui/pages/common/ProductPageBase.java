package com.solvd.carina.demo.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class ProductPageBase extends AbstractDemoBlazePage {

    public ProductPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isProductPageOpened(String product);

    public abstract void clickAddToCartBtn();
}
