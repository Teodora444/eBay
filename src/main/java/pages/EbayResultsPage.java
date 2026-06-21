package pages;

import locators.Locators;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EbayResultsPage extends BasePage{
    public EbayResultsPage(WebDriver driver) {
        super(driver);
    }

    public EbayResultsPage selectCondition(String conditionText) {
        waitForClickable(Locators.EBAY_CONDITION_MENU_BUTTON).click();
        clickByJs(Locators.ebayConditionOption(conditionText));
        return this;
    }

    public EbayResultsPage enterMinPrice(String minPrice) {
        waitForVisible(Locators.EBAY_PRICE_MIN_INPUT).sendKeys(minPrice);
        return this;
    }

    public EbayResultsPage enterMaxPrice(String maxPrice) {
        waitForVisible(Locators.EBAY_PRICE_MAX_INPUT).sendKeys(maxPrice);
        return this;
    }

    public EbayResultsPage clickSubmitPriceRange() {
        waitForClickable(Locators.EBAY_PRICE_SUBMIT_BUTTON).click();
        return this;
    }

    public EbayResultsPage sortBy(String sortOption) {
        waitForClickable(Locators.EBAY_SORT_MENU_BUTTON).click();
        clickByJs(Locators.ebaySortOption(sortOption));
        return this;
    }


    public String getNoResultsMessage() {
        return getTextOf(Locators.EBAY_NO_RESULTS_TEXT);
    }

    public EbayResultsPage verifyNoResultsMessage(String expectedText) {
        assertEquals(expectedText, getNoResultsMessage(), "Greška: Poruka o praznim rezultatima se ne poklapa!");
        return this;
    }

    public EbayLoginPage clickWatchlistHeartOnFirstResult() {
        clickByJs(Locators.EBAY_FIRST_RESULT_WATCHLIST_HEART);
        return new EbayLoginPage(driver);
    }

    public EbayDetailPage clickFirstResultCard() {
        clickByJs(Locators.EBAY_FIRST_RESULT_CARD_LINK);
        return new EbayDetailPage(driver);
    }

}
