package com.solvd.carina.demo.gui.components.forms.login;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

public abstract class LogInFormBase extends AbstractUIObject {

    protected LogInFormBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isLogInFormPoppedUp();

    public abstract void typeUsername(String userName);

    public abstract void typePassword(String password);

    public abstract void clickLogInBtn();
}
