package pages;

import constants.Constants;

public class LoginPage extends BasePage {
    public static final String FORGOT_PASSWORD_XPATH = "//a[@href='#recover']";
    public static final String CREATE_ACCOUNT_XPATH = "//a[@href='/account/register']";
    public static final String EMAIL_FIELD_XPATH = "//input[@id='CustomerEmail']";
    public static final String PASSWORD_FIELD_XPATH = "//input[@id='CustomerPassword']";
    public static final String SIGNIN_BUTTON_XPATH = "//input[@value='Sign In']";
    public static final String INCORRECT_EMAIL_XPATH = "//li[text()='Incorrect email or password.']";

    public void navigateToLoginPage() {
        webDriver.get(Constants.LOGIN_PAGE_URL);
    }

    public boolean isHeaderVisible() {
        return isElementExistByXpath(Constants.LOGIN_PAGE_HEADER);
    }

    public boolean isResetPasswordHeaderVisible() {
        return isElementExistByXpath(Constants.RESET_PASSWORD_HEADER);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }

    public void openResetPasswordAnchor() {
        clickElementByXpath(FORGOT_PASSWORD_XPATH);
    }

    public CreateAccountPage openCreateAccountPage() {
        clickElementByXpath(CREATE_ACCOUNT_XPATH);
        return new CreateAccountPage();
    }

    public void sendTextToEmailField(String text) {
        sendTextToElementByXpath(EMAIL_FIELD_XPATH, text);
    }

    public void sendTextToPasswordField(String text) {
        sendTextToElementByXpath(PASSWORD_FIELD_XPATH, text);
    }

    public void clickSigninButton() {
        clickElementByXpath(SIGNIN_BUTTON_XPATH);
    }

    public boolean isIncorrectEmailWarningVisible() {
        return isElementExistByXpath(INCORRECT_EMAIL_XPATH);
    }
}
