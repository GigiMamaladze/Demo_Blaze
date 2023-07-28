package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.components.forms.login.LogInForm;
import com.solvd.carina.demo.gui.components.forms.signup.SignUpForm;
import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.utils.R;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoBlazeTest extends AbstractDemoBlazeTest {

    @Test
    @MethodOwner(owner = "Gigi")
    public void testSignUp() {
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);
        homePageBase.open();
        Assert.assertTrue(homePageBase.isPageOpened(), "Demo blaze home page is not opened");
        SignUpForm signUpForm = (SignUpForm) homePageBase.getTopNavigation().clickSignUpBtn();
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
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);
        homePageBase.open();
        Assert.assertTrue(homePageBase.isPageOpened(), "Demo blaze home page is not opened");
        LogInForm logInForm = (LogInForm) homePageBase.getTopNavigation().clickLogInBtn();
        Assert.assertTrue(logInForm.isLogInFormPoppedUp(), "Log in form is not popped up");
        logInForm.typeUsername(R.TESTDATA.get("user_name"));
        logInForm.typePassword(R.TESTDATA.get("user_password"));
        logInForm.clickLogInBtn();
        Assert.assertTrue(homePageBase.isUserLoggedIn(), "User is not logged in");
    }
}
