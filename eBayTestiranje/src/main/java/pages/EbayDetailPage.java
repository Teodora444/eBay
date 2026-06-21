package pages;

import locators.Locators;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EbayDetailPage extends BasePage {

    public EbayDetailPage(WebDriver driver) {
        super(driver);
    }

    public String getProductTitle() {
        return getTextOf(Locators.EBAY_DETAIL_PRODUCT_TITLE);
    }

    public EbayDetailPage verifyProductTitleContains(String expectedText) {
        assertTrue(isTitleValid(expectedText),
                "Greška: Naslov na stranici detalja ne sadrži traženi tekst! Dobijeno: " + getProductTitle());
        return this;
    }

    private boolean isTitleValid(String expectedText) {
        return getProductTitle().contains(expectedText);
    }

    public String getProductCondition() {
        return getTextOf(Locators.EBAY_DETAIL_PRODUCT_CONDITION);
    }

    public EbayDetailPage verifyProductCondition(String expectedCondition) {
        assertTrue(isConditionValid(expectedCondition),
                "Greška: Stanje proizvoda nije tačno! Dobijeno: " + getProductCondition());
        return this;
    }

    private boolean isConditionValid(String expectedCondition) {
        return getProductCondition().contains(expectedCondition);
    }
}