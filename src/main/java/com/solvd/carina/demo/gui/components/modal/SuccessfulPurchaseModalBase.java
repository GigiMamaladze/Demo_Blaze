package com.solvd.carina.demo.gui.components.modal;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

public abstract class SuccessfulPurchaseModalBase extends AbstractUIObject {

    public SuccessfulPurchaseModalBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isModalPoppedUp();
}
