package com.solvd.carina.demo;

import com.solvd.carina.demo.gui.components.forms.SignUpForm;
import com.solvd.carina.demo.gui.pages.common.HomePageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoBlazeTest implements IAbstractTest {

    @Test
    @MethodOwner(owner = "Gigi")
    public void testSignUp() {
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);
        homePageBase.open();
        Assert.assertTrue(homePageBase.isPageOpened(), "Demo blaze home page is not opened");
        SignUpForm signUpForm = (SignUpForm) homePageBase.getTopNavigation().clickSignUp();
        Assert.assertTrue(signUpForm.isSignUpFormPoppedUp(), "Sign up form is not popped up");
    }

}
