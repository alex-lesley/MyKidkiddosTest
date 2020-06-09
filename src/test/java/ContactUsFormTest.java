import constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.CartPage;
import pages.ContactUsPage;
import pages.LoginPage;
import utils.BaseCases;
import static org.junit.jupiter.api.Assertions.*;


public class ContactUsFormTest extends BaseCases {
    private static ContactUsPage contactUsPage;
    private final Logger logger = LogManager.getLogger(ContactUsFormTest.class);
    private static final String EMPTY_STRING = "";
    private static final String STRING_OF_SPACES = "      ";
    private static final String VALID_NAME = "qwerty";
    private static final String NUMBERS = "123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*+";
    private static final String INVALID_EMAIL = "qweqweqwe";
    private static final String VALID_EMAIL = "qwerty@qwerty.qw";
    private static final String LONG_TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed at odio vel risus aliquet malesuada. Pellentesque non sapien eu arcu aliquam condimentum sit amet et lorem. Nullam at volutpat nibh. Praesent rhoncus elit vel orci pretium commodo. Sed interdum libero mauris, sit amet volutpat lacus tincidunt et. In rhoncus molestie facilisis. Phasellus eget dapibus dolor.";

    @BeforeAll
    public static void classSetup() {
        contactUsPage = new ContactUsPage();
    }

    @BeforeEach
    public void testSetup() {
        contactUsPage.navigateToContactUsPage();
    }

    @ParameterizedTest
    @ValueSource(strings = {EMPTY_STRING, STRING_OF_SPACES})
    public void emptyNameFieldTest(String text) {
        logger.info("Empty Name field test");
        contactUsPage.sendTextToNameField(text);
        contactUsPage.sendTextToEmailField(VALID_EMAIL);
        contactUsPage.sendTextToMessageField(LONG_TEXT);
        contactUsPage.clickSendButton();
        assertTrue(contactUsPage.isErrorNameRequiredVisible(), "No This field is required message in Name field");
        contactUsPage.takeScreenshot("Name_field_required");
    }

    @ParameterizedTest
    @ValueSource(strings = {VALID_NAME, NUMBERS, SPECIAL_CHARACTERS, LONG_TEXT})
    public void nameFieldPopulaationTest(String text) {
        logger.info("Name field population test");
        contactUsPage.sendTextToNameField(text);
        contactUsPage.clickSendButton();
        assertEquals(text, contactUsPage.getTextFromNameField(), "Text in Name field does not match");
    }

    @ParameterizedTest
    @ValueSource(strings = {EMPTY_STRING, STRING_OF_SPACES})
    public void emptyEmailFieldTest(String text) {
        logger.info("Empty Email field test");
        contactUsPage.sendTextToNameField(VALID_NAME);
        contactUsPage.sendTextToEmailField(text);
        contactUsPage.sendTextToMessageField(LONG_TEXT);
        contactUsPage.clickSendButton();
        assertTrue(contactUsPage.isErrorEmailRequiredVisible(), "No This field is required message in Email field");
        contactUsPage.takeScreenshot("Email_field_required");
    }

    @ParameterizedTest
    @ValueSource(strings = {NUMBERS, SPECIAL_CHARACTERS, LONG_TEXT, INVALID_EMAIL})
    public void invalidEmailFieldTest(String text) {
        logger.info("Empty Email field test");
        contactUsPage.sendTextToNameField(VALID_NAME);
        contactUsPage.sendTextToEmailField(text);
        contactUsPage.sendTextToMessageField(LONG_TEXT);
        contactUsPage.clickSendButton();
        assertTrue(contactUsPage.isErrorEmailValidVisible(), "No Enter a valid email message");
        contactUsPage.takeScreenshot("Enter_valid_email");
    }
    @ParameterizedTest
    @ValueSource(strings = {EMPTY_STRING, STRING_OF_SPACES})
    public void emptyMessageFieldTest(String text) {
        logger.info("Empty Your message field test");
        contactUsPage.sendTextToNameField(VALID_NAME);
        contactUsPage.sendTextToEmailField(VALID_EMAIL);
        contactUsPage.sendTextToMessageField(text);
        contactUsPage.clickSendButton();
        assertTrue(contactUsPage.isErrorMessageRequiredVisible(), "No This field is required message in Your Message field");
        contactUsPage.takeScreenshot("Message_field_required");
    }

    @ParameterizedTest
    @ValueSource(strings = {VALID_NAME, NUMBERS, SPECIAL_CHARACTERS, LONG_TEXT})
    public void messageFieldPopulationTest(String text) {
        logger.info("Your message field population test");
        contactUsPage.sendTextToMessageField(text);
        contactUsPage.clickSendButton();
        assertEquals(text, contactUsPage.getTextFromMessageField(), "Text in Your message field does not match");
    }

    @Test
    public void openLoginPageTest() {
        logger.info("Login page open test");
        LoginPage loginPage = contactUsPage.openLoginPage();
        loginPage.takeScreenshot("Login_page");
        assertEquals(Constants.LOGIN_PAGE_URL, loginPage.getPageURL(), "Login page URL does not match");
        assertTrue(loginPage.isHeaderVisible(), "Login page header is not visible");
    }

    @Test
    public void openCartPageTest() {
        logger.info("Cart page open test");
        CartPage cartPage = contactUsPage.openCartPage();
        cartPage.takeScreenshot("Cart_page");
        assertEquals(Constants.CART_PAGE_URL, cartPage.getPageURL(), "Cart page URL does not match");
        assertTrue(cartPage.isHeaderVisible(), "Cart page header is not visible");
    }

    @ParameterizedTest
    @ValueSource(strings = {"AUD", "BRL", "CAD", "EUR", "GBP", "INR", "NZD", "SGD", "USD"})
    public void currencySelectTest(String currencyCode) {
        logger.info("Currency selection test");
        contactUsPage.selectCurrency(String.format(ContactUsPage.CURRENCY_LINK_XPATH, currencyCode));
        assertTrue(contactUsPage.isCurrencySelected(String.format(ContactUsPage.SELECTED_CURRENCY_XPATH, currencyCode)), "The selected currency is not shown");
    }

    @Test
    public void autoCurrencySelectTest() {
        logger.info("Auto currency selection test");
        assertTrue(contactUsPage.isCurrencySelected(String.format(ContactUsPage.SELECTED_CURRENCY_XPATH, ContactUsPage.LOCAL_CURRENCY)), "The local currency is not shown");
        contactUsPage.selectCurrency(String.format(ContactUsPage.CURRENCY_LINK_XPATH, ContactUsPage.AUTO_CURRENCY));
        assertTrue(contactUsPage.isCurrencySelected(String.format(ContactUsPage.SELECTED_CURRENCY_XPATH, ContactUsPage.LOCAL_CURRENCY)), "The auto selected currency is not shown");
    }

}
