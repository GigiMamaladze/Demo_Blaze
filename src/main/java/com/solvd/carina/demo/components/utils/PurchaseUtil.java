package com.solvd.carina.demo.components.utils;

import com.solvd.carina.demo.components.enums.Category;
import com.solvd.carina.demo.gui.pages.common.CartPageBase;
import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.solvd.carina.demo.gui.pages.common.ProductPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.Alert;
import org.testng.Assert;

public class PurchaseUtil implements IAbstractTest {

    public CartPageBase addToCartMonitorsProduct(String product) {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Demo blaze home page is not opened");
        homePage.getCategoryMenu().clickCategory(Category.MONITORS);
        Assert.assertTrue(homePage.isProductPresent(product), "Product is not present on page");
        ProductPageBase productPage = homePage.clickProductName(product);
        Assert.assertTrue(productPage.isProductPageOpened(product), "Product page is not opened");
        productPage.clickAddToCartBtn();
        pause(3);
        Alert alert = getDriver().switchTo().alert();
        alert.accept();
        CartPageBase cartPage = homePage.getTopNavigation().clickCartBtn();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart Page is not opened");
        Assert.assertTrue(cartPage.isProductPresentInCart(product), "Product is not present in cart");
        return cartPage;
    }
}
