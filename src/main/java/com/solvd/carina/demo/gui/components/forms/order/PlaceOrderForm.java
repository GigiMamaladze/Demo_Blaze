package com.solvd.carina.demo.gui.components.forms.order;

import com.solvd.carina.demo.gui.components.modal.SuccessfulPurchaseModal;
import com.solvd.carina.demo.gui.components.modal.SuccessfulPurchaseModalBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class PlaceOrderForm extends PlaceOrderFormBase {

    @FindBy(css = "#orderModalLabel")
    private ExtendedWebElement formTitle;

    @FindBy(css = "#name")
    private ExtendedWebElement nameTextField;

    @FindBy(css = "#card")
    private ExtendedWebElement creditCardTextField;

    @FindBy(xpath = "//button[text() = 'Purchase']")
    private ExtendedWebElement purchaseButton;

    public PlaceOrderForm(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPlaceOrderFormPoppedUp() {
        return formTitle.isElementPresent();
    }

    @Override
    public void typeName(String name) {
        nameTextField.type(name);
    }

    @Override
    public void typeCreditCardNumber(String creditCard) {
        creditCardTextField.type(creditCard);
    }

    @Override
    public SuccessfulPurchaseModalBase clickPurchaseBtn() {
        purchaseButton.click();
        return new SuccessfulPurchaseModal(getDriver());
    }
}
