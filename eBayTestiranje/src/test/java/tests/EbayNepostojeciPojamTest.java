package tests;

import base.BaseTest;
import constants.Constants;
import org.junit.jupiter.api.Test;
import pages.EbayHomePage;

public class EbayNepostojeciPojamTest extends BaseTest {
    @Test
    public void testPretragaNepostojecegPojma() {
        new EbayHomePage(driver)
                .enterSearchTerm(Constants.SEARCH_TERM_INVALID)
                .clickSearch()
                .verifyNoResultsMessage(Constants.EBAY_EXPECTED_NO_RESULTS);
    }
}
