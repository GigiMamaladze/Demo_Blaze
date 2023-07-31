package com.solvd.carina.demo.gui.components.menu;

import com.solvd.carina.demo.components.enums.Category;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CategoryMenu extends CategoryMenuBase {

    @FindBy(xpath = "//*[@class = 'list-group']/a[text()='%s']")
    private ExtendedWebElement categoryItem;

    public CategoryMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public void clickCategory(Category category) {
        categoryItem.format(category.getCategory()).click();
    }
}
