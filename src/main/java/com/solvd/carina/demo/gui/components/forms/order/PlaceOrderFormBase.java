package com.solvd.carina.demo.gui.components.forms.order;

import com.solvd.carina.demo.gui.components.modal.SuccessfulPurchaseModalBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;

public abstract class PlaceOrderFormBase extends AbstractUIObject {

    public PlaceOrderFormBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPlaceOrderFormPoppedUp();

    public abstract void typeName(String name);

    public abstract void typeCreditCardNumber(String creditCard);

    public abstract SuccessfulPurchaseModalBase clickPurchaseBtn();
}