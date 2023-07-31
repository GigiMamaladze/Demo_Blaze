package com.solvd.carina.demo.gui.components.modal;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SuccessfulPurchaseModal extends SuccessfulPurchaseModalBase {

    @FindBy(xpath = "//h2[text() = 'Thank you for your purchase!']")
    private ExtendedWebElement modalTitle;

    public SuccessfulPurchaseModal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isModalPoppedUp() {
        return modalTitle.isElementPresent();
    }
}
