package com.solvd.carina.demo.gui.components.menu;

import com.solvd.carina.demo.components.enums.Category;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class CategoryMenuBase extends AbstractUIObject {

    public CategoryMenuBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract void clickCategory(Category category);
}
