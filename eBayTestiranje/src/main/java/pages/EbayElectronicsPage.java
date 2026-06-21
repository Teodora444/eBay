package pages;

import locators.Locators;
import org.openqa.selenium.WebDriver;

public class EbayElectronicsPage extends BasePage{
    public EbayElectronicsPage(WebDriver driver) {
        super(driver);
    }
    public EbayCategoryPage clickVideoGamesAndConsoles() {
        waitForClickable(Locators.EBAY_SIDE_VIDEO_GAMES_LINK).click();
        return new EbayCategoryPage(driver);
    }
}
