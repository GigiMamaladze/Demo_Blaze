package com.solvd.carina.demo;

import com.solvd.carina.demo.components.enums.Category;
import com.solvd.carina.demo.gui.components.forms.login.LogInFormBase;
import com.solvd.carina.demo.gui.components.forms.order.PlaceOrderFormBase;
import com.solvd.carina.demo.gui.components.forms.signup.SignUpFormBase;
import com.solvd.carina.demo.gui.components.modal.SuccessfulPurchaseModalBase;
import com.solvd.carina.demo.gui.pages.common.CartPageBase;
import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.solvd.carina.demo.gui.pages.common.ProductPageBase;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoBlazeTest extends AbstractDemoBlazeTest {

    @Test
    @MethodOwner(owner = "Gigi")
    public void testSignUp() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Demo blaze home page is not opened");
        SignUpFormBase signUpForm = homePage.getTopNavigation().clickSignUpBtn();
        Assert.assertTrue(signUpForm.isSignUpFormPoppedUp(), "Sign up form is not popped up");
        String userName = randomUtil.getRandomString(6);
        String password = randomUtil.getRandomString(8);
        signUpForm.typeUsername(userName);
        signUpForm.typePassword(password);
        signUpForm.clickSignUpBtn();
        pause(2);
        Alert alert = getDriver().switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "Sign up successful.", "Sign up failed");
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testLogIn() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Demo blaze home page is not opened");
        LogInFormBase logInForm = homePage.getTopNavigation().clickLogInBtn();
        Assert.assertTrue(logInForm.isLogInFormPoppedUp(), "Log in form is not popped up");
        logInForm.typeUsername(R.TESTDATA.get("user_name"));
        logInForm.typePassword(R.TESTDATA.get("user_password"));
        logInForm.clickLogInBtn();
        Assert.assertTrue(homePage.isUserLoggedIn(), "User is not logged in");
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testAddToCart() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Demo blaze home page is not opened");
        homePage.getCategoryMenu().clickCategory(Category.MONITORS);
        String product = "Apple monitor 24";
        Assert.assertTrue(homePage.isProductPresent(product), "Product is not present on page");
        ProductPageBase productPage = homePage.clickProductName(product);
        Assert.assertTrue(productPage.isProductPageOpened(product), "Product page is not opened");
        productPage.clickAddToCartBtn();
        pause(2);
        Alert alert = getDriver().switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals(alertText, "Product added", "Adding to cart failure");
        alert.accept();
        CartPageBase cartPage = homePage.getTopNavigation().clickCartBtn();
        Assert.assertTrue(cartPage.isPageOpened(), "Cart Page is not opened");
        Assert.assertTrue(cartPage.isProductPresentInCart(product), "Product is not present in cart");
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testRemoveFromCart() {
        String product = "Apple monitor 24";
        CartPageBase cartPageBase = purchaseUtil.addToCartMonitorsProduct(product);
        cartPageBase.clickDeleteBtn();
        Assert.assertFalse(cartPageBase.isProductPresentInCart(product), "Product is not deleted from cart");
    }

    @Test
    @MethodOwner(owner = "Gigi")
    public void testProductOrder() {
        authUtil.logInDefaultUser();
        String product = "Apple monitor 24";
        CartPageBase cartPageBase = purchaseUtil.addToCartMonitorsProduct(product);
        PlaceOrderFormBase placeOrderForm = cartPageBase.clickPlaceOrderBtn();
        Assert.assertTrue(placeOrderForm.isPlaceOrderFormPoppedUp(), "Place Order form is not popped up");
        placeOrderForm.typeName(randomUtil.getRandomString(4));
        placeOrderForm.typeCreditCardNumber(randomUtil.getRandomNumber(8));
        SuccessfulPurchaseModalBase successfulPurchaseModal = placeOrderForm.clickPurchaseBtn();
        Assert.assertTrue(successfulPurchaseModal.isModalPoppedUp(), "Purchase failed");
    }
}
