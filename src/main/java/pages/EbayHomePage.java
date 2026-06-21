package pages;

import locators.Locators;
import org.openqa.selenium.WebDriver;
import pages.EbayResultsPage;

public class EbayHomePage extends BasePage{
    public EbayHomePage(WebDriver driver) {
        super(driver);
    }

    public EbayHomePage enterSearchTerm(String term) {
        waitForVisible(Locators.EBAY_SEARCH_INPUT).sendKeys(term);
        return this;
    }
    public EbayResultsPage clickSearch() {
        waitForClickable(Locators.EBAY_SEARCH_BUTTON).click();
        return new EbayResultsPage(driver);
    }
    public EbayElectronicsPage clickElectronicsCategory() {
        waitForClickable(Locators.EBAY_MENU_ELECTRONICS_LINK).click();
        return new EbayElectronicsPage(driver);
    }
}
