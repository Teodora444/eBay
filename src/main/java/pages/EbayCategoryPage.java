package pages;

import locators.Locators;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EbayCategoryPage extends BasePage {

    public EbayCategoryPage(WebDriver driver) {
        super(driver);
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    private boolean isProductListNotEmpty() {
        return waitForVisible(Locators.PRODUCT_LIST_ITEMS).isDisplayed();
    }
    public EbayCategoryPage verifyUrlContainsCategoryId(String categoryId) {
        assertTrue(getCurrentPageUrl().contains(categoryId),
                "Greška: URL ne sadrži ID kategorije! Trenutni URL: " + getCurrentPageUrl());
        return this;
    }
    public EbayCategoryPage verifyPageTitle(String expectedTitle) {
        assertEquals(expectedTitle, getPageTitle(), "Greška: Naslov stranice se ne poklapa!");
        return this;
    }
    public EbayCategoryPage verifyProductListIsNotEmpty() {
        assertTrue(isProductListNotEmpty(), "Greška: Lista proizvoda na stranici je prazna!");
        return this;
    }
}