package pages;

import constants.Constants;

public class ContactUsPage extends BasePage{
    public static final String NAME_FIELD_XPATH = "//input[@name='field[3]']";
    public static final String EMAIL_FIELD_XPATH = "//input[@name='email']";
    public static final String YOUR_MESSAGE_FIELD_XPATH = "//textarea[@name='field[7]']";
    public static final String ERROR_MESSAGE_NAME_REQUIRED_XPATH = "//div[contains(@class, '_field3')]/div/div/div[text()='This field is required.']";
    public static final String ERROR_MESSAGE_EMAIL_REQUIRED_XPATH = "//div[contains(@class, '_x69676162)']/div/div/div[text()='This field is required.']";
    public static final String ERROR_MESSAGE_EMAIL_VALID_XPATH = "//div[contains(@class='_x69676162')]/div/div/div[text()='Enter a valid email address.']";
    public static final String ERROR_MESSAGE_MESSAGE_REQUIRED_XPATH = "//div[contains(@class, '_field7')]/div/div/div[text()='This field is required.']";
    public static final String SEND_BUTTON_XPATH = "//button[text()=' Send your message ']";
    public static final String CHANGE_CURRENCY_LIST_XPATH = "//span[contains(@class, 'currency-converter-currency-button[')]";
    public static final String SELECTED_CURRENCY_XPATH = "//span[contains(@class, 'currency-converter-currency-button')]/span[text()=' %s']";
    public static final String CURRENCY_LINK_XPATH = "//ul[contains(@class, 'currency-converter-chooser')][not(contains(@style, 'display: none'))]/li[contains(@class, '%s')]";
    public static final String LOCAL_CURRENCY = "ILS"; // for Israel
    public static final String AUTO_CURRENCY = "refresh";


    public void navigateToContactUsPage() {
        webDriver.get(Constants.CONTACT_US_PAGE_URL);
    }

    public boolean isHeaderVisible() {
        return isElementExistByXpath(Constants.CONTACT_US_PAGE_HEADER);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }

    public void sendTextToNameField(String text) {
        sendTextToElementByXpath(NAME_FIELD_XPATH, text);
    }

    public String getTextFromNameField() {
        return getTextFromElementByXpath(NAME_FIELD_XPATH);
    }

    public void sendTextToEmailField(String text) {
        sendTextToElementByXpath(EMAIL_FIELD_XPATH, text);
    }

    public void sendTextToMessageField(String text) {
        sendTextToElementByXpath(YOUR_MESSAGE_FIELD_XPATH, text);
    }

    public String getTextFromMessageField() {
        return getTextFromElementByXpath(YOUR_MESSAGE_FIELD_XPATH);
    }

    public void clickSendButton() {
        clickElementByXpath(SEND_BUTTON_XPATH);
    }

    public boolean isErrorNameRequiredVisible() {
        return isElementExistByXpath(ERROR_MESSAGE_NAME_REQUIRED_XPATH);
    }

    public boolean isErrorEmailRequiredVisible() {
        return isElementExistByXpath(ERROR_MESSAGE_EMAIL_REQUIRED_XPATH);
    }

    public boolean isErrorEmailValidVisible() {
        return isElementExistByXpath(ERROR_MESSAGE_EMAIL_VALID_XPATH);
    }

    public boolean isErrorMessageRequiredVisible() {
        return isElementExistByXpath(ERROR_MESSAGE_MESSAGE_REQUIRED_XPATH);
    }

    public LoginPage openLoginPage() {
        clickElementByXpath(Constants.LOGIN_PAGE_LINK);
        return new LoginPage();
    }

    public CartPage openCartPage() {
        clickElementByXpath(Constants.CART_PAGE_LINK);
        return new CartPage();
    }

    public void selectCurrency(String currencyLink) {
        clickElementByXpath(CHANGE_CURRENCY_LIST_XPATH);
        clickElementByXpath(currencyLink);
    }

    public boolean isCurrencySelected(String currencySelected) {
        return isElementExistByXpath(currencySelected);
    }

}
