package pages;

import locators.Locators;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class EbayLoginPage extends BasePage {

    public EbayLoginPage(WebDriver driver) {
        super(driver);
    }

    public EbayLoginPage verifyLoginWindowDisplayed() {
        assertTrue(isLoginWindowVisible(), "Greška: Prozor za prijavu se nije prikazao!");
        return this;
    }
    private boolean isLoginWindowVisible() {
        return waitForVisible(Locators.EBAY_LOGIN_WINDOW).isDisplayed();
    }


    public EbayLoginPage verifyEmailFieldDisplayed() {
        assertTrue(isEmailFieldVisible(), "Greška: Polje za Email ne postoji na formi!");
        return this;
    }
    private boolean isEmailFieldVisible() {
        return waitForVisible(Locators.EBAY_LOGIN_EMAIL_FIELD).isDisplayed();
    }
}