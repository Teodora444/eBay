package tests;

import base.BaseTest;
import constants.Constants;
import org.junit.jupiter.api.Test;
import pages.EbayHomePage;

public class EbayNavigacijaTest extends BaseTest {
    @Test
    public void testNavigacijaKrozKategorije() {
        new EbayHomePage(driver)
                .clickElectronicsCategory()
                .clickVideoGamesAndConsoles()
                .verifyUrlContainsCategoryId(Constants.EBAY_CATEGORY_ID)
                .verifyPageTitle(Constants.EBAY_CATEGORY_TITLE)
                .verifyProductListIsNotEmpty();
    }
}
