package com.solvd.carina.demo;

import com.solvd.carina.demo.components.utils.AuthUtil;
import com.solvd.carina.demo.components.utils.PurchaseUtil;
import com.solvd.carina.demo.components.utils.RandomUtil;
import com.zebrunner.carina.core.IAbstractTest;
import org.openqa.selenium.WebDriver;

public abstract class AbstractDemoBlazeTest implements IAbstractTest {

    public RandomUtil randomUtil = new RandomUtil();

    public AuthUtil authUtil = new AuthUtil();

    public PurchaseUtil purchaseUtil = new PurchaseUtil();
}
