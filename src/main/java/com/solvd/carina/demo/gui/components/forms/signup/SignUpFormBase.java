package com.solvd.carina.demo.gui.components.forms.signup;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

public abstract class SignUpFormBase extends AbstractUIObject {

    public SignUpFormBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUsername(String userName);

    public abstract void typePassword(String password);

    public abstract boolean isSignUpFormPoppedUp();

    public abstract void clickSignUpBtn();
}
