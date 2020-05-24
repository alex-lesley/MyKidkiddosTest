package pages;

import constants.Constants;

public class ContactUsPage extends BasePage{
    public static final String NAME_FIELD_XPATH = "//input[@name='field[3]']";
    public static final String EMAIL_FIELD_XPATH = "//input[@name='email']";
    public static final String YOUR_MESSAGE_FIELD_XPATH = "//textarea[@name='field[7]']";
    public static final String ERROR_MESSAGE_NAME_REQUIRED_XPATH = "//div[@class='_form_element _field3 _full_width ']/div/div/div[text()='This field is required.']";
    public static final String ERROR_MESSAGE_EMAIL_REQUIRED_XPATH = "//div[@class='_form_element _x69676162 _full_width ']/div/div/div[text()='This field is required.']";
    public static final String ERROR_MESSAGE_EMAIL_VALID_XPATH = "//div[@class='_form_element _x69676162 _full_width ']/div/div/div[text()='Enter a valid email address.']";
    public static final String ERROR_MESSAGE_MESSAGE_REQUIRED_XPATH = "//div[@class='_form_element _field7 _full_width ']/div/div/div[text()='This field is required.']";
    public static final String SEND_BUTTON_XPATH = "//button[text()=' Send your message ']";

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

}
