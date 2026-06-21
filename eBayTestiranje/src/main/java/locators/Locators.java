package locators;

import org.openqa.selenium.By;

public class Locators {

    // ==========================================
    // EBAY HOME PAGE
    // ==========================================
    public static final By EBAY_SEARCH_INPUT = By.xpath("//input[contains(@class,'gh-search-input')]");
    public static final By EBAY_SEARCH_BUTTON = By.xpath("//button[contains(@class,'gh-search-button')]");
    public static final By EBAY_MENU_ELECTRONICS_LINK = By.xpath("//span[text()='Electronics']");

    // ==========================================
    // EBAY ELECTRONICS PAGE
    // ==========================================
    public static final By EBAY_SIDE_VIDEO_GAMES_LINK = By.xpath("//li[contains(@class,'brwel__item')]//a[text()='Video Games & Consoles']");

    // ==========================================
    // EBAY CATEGORY PAGE
    // ==========================================
    public static final By PRODUCT_LIST_ITEMS = By.xpath("//div[contains(@class,'product-card')]");

    // ==========================================
    // EBAY RESULTS PAGE
    // ==========================================
    public static final By EBAY_CONDITION_MENU_BUTTON = By.xpath("//button[contains(@class,'fake-menu-button__button')]//span[text()='Condition']");

    public static By ebayConditionOption(String conditionText) {
        return By.xpath(String.format("//a[contains(@class,'fake-menu-button__item')]//span[text()='%s']", conditionText));
    }

    public static final By EBAY_SORT_MENU_BUTTON = By.xpath("//button[contains(@class,'fake-menu-button__button')]//span[contains(text(),'Sort')]");

    public static By ebaySortOption(String optionText) {
        return By.xpath(String.format("//a[contains(@class,'fake-menu-button__item')]//span[text()='%s']", optionText));
    }

    public static final By EBAY_PRICE_MIN_INPUT = By.xpath("//span[contains(@class,'x-textrange__input--from')]//input");
    public static final By EBAY_PRICE_MAX_INPUT = By.xpath("//span[contains(@class,'x-textrange__input--to')]//input");
    public static final By EBAY_PRICE_SUBMIT_BUTTON = By.xpath("//button[contains(@class,'x-refine__block-button')]");

    public static final By EBAY_FIRST_RESULT_CARD_LINK = By.xpath("(//div[contains(@class,'srp-river-results')]//a[contains(@class,'s-card__link')])[1]");
    public static final By EBAY_FIRST_RESULT_WATCHLIST_HEART = By.xpath("(//li[contains(@class,'s-card')]//a[contains(@class,'s-card__watchheart-click')])[1]");
    public static final By EBAY_NO_RESULTS_TEXT = By.xpath("//div[contains(@class,'srp-controls__count')]//h1");

    // ==========================================
    // EBAY DETAIL PAGE
    // ==========================================
    public static final By EBAY_DETAIL_PRODUCT_TITLE = By.xpath("//h1");
    public static final By EBAY_DETAIL_PRODUCT_CONDITION = By.xpath("//span[contains(text(),'Used')]");

    // ==========================================
    // EBAY LOGIN PAGE
    // ==========================================
    public static final By EBAY_LOGIN_WINDOW = By.xpath("//form[contains(@class,'signin-form')]");
    public static final By EBAY_LOGIN_EMAIL_FIELD = By.xpath("//input[contains(@class,'textbox__control')]");
}