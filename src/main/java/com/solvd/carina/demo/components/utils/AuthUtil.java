package com.solvd.carina.demo.components.utils;

import com.solvd.carina.demo.gui.components.forms.login.LogInFormBase;
import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;

public class AuthUtil implements IAbstractTest {

    public HomePageBase logInDefaultUser() {
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);
        homePageBase.open();
        Assert.assertTrue(homePageBase.isPageOpened(), "Demo blaze home page is not opened");
        LogInFormBase logInForm = homePageBase.getTopNavigation().clickLogInBtn();
        Assert.assertTrue(logInForm.isLogInFormPoppedUp(), "Log in form is not popped up");
        logInForm.typeUsername(R.TESTDATA.get("user_name"));
        logInForm.typePassword(R.TESTDATA.get("user_password"));
        logInForm.clickLogInBtn();
        Assert.assertTrue(homePageBase.isUserLoggedIn(), "User is not logged in");
        return homePageBase;
    }
}
