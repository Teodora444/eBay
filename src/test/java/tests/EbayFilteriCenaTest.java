package tests;

import base.BaseTest;
import constants.Constants;
import org.junit.jupiter.api.Test;
import pages.EbayHomePage;

public class EbayFilteriCenaTest extends BaseTest {
    @Test
    public void testPretragaSaFilterimaICenom() {
        new EbayHomePage(driver)
                .enterSearchTerm(Constants.SEARCH_TERM_PS5)
                .clickSearch()
                .selectCondition(Constants.EBAY_CONDITION_USED)
                .enterMinPrice(Constants.EBAY_PRICE_MIN)
                .enterMaxPrice(Constants.EBAY_PRICE_MAX)
                .clickSubmitPriceRange()
                .sortBy(Constants.EBAY_SORT_LOWEST_PRICE)
                .clickFirstResultCard()
                .verifyProductTitleContains(Constants.EBAY_DETAIL_EXPECTED_TITLE)
                .verifyProductCondition(Constants.EBAY_DETAIL_EXPECTED_CONDITION);
    }
}
