package tests;

import base.BaseTest;
import constants.Constants;
import org.junit.jupiter.api.Test;
import pages.EbayHomePage;

public class EbayWatchlistTest extends BaseTest {

    @Test
    public void testWatchlistBezPrijave() {
        new EbayHomePage(driver)
                .enterSearchTerm(Constants.SEARCH_TERM_PS5)
                .clickSearch()
                .clickWatchlistHeartOnFirstResult()
                .verifyLoginWindowDisplayed()
                .verifyEmailFieldDisplayed();
    }
}
