import constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CreateAccountPage;
import pages.LoginPage;
import utils.BaseCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends BaseCases {
    private static LoginPage loginPage;
    private final Logger logger = LogManager.getLogger(LoginPageTest.class);

    @BeforeAll
    public static void classSetup() {
        loginPage = new LoginPage();
    }

    @BeforeEach
    public void testSetup() {
        loginPage.navigateToLoginPage();
    }

    @Test
    public void loginPageLoadTest() {
        logger.info("Login page load test");
        loginPage.takeScreenshot("Login_page");
        assertEquals(Constants.LOGIN_PAGE_URL, loginPage.getPageURL(), "Login page URL does not match");
        assertTrue(loginPage.isHeaderVisible(), "Login page header is not visible");
    }

    @Test
    public void resetPasswordLoadTest() {
        logger.info("Login page load test");
        loginPage.openResetPasswordAnchor();
        loginPage.takeScreenshot("Login_page");
        assertEquals(Constants.LOGIN_PAGE_URL, loginPage.getPageURL(), "Login page URL does not match");
        assertTrue(loginPage.isResetPasswordHeaderVisible(), "Reset Password header is not visible");
    }

    @Test
    public void openCreateAccountPageTest() {
        logger.info("Create Account page load test");
        CreateAccountPage createAccountPage = loginPage.openCreateAccountPage();
        createAccountPage.takeScreenshot("Create_Account_page");
        assertEquals(Constants.CREATE_ACCOUNT_PAGE_URL, createAccountPage.getPageURL(), "Create Account URL does not match");
        assertTrue(createAccountPage.isHeaderVisible(), "Create Account header is not visible");
    }

    @Test
    public void emptyEmailAndPasswordTest() {
        logger.info("Empty Email and Password fields test");
        loginPage.sendTextToEmailField("");
        loginPage.sendTextToPasswordField("");
        loginPage.clickSigninButton();
        loginPage.takeScreenshot("Incorrect_Email_Warning");
        assertTrue(loginPage.isIncorrectEmailWarningVisible(), "Incorrect email warning is not visible");
    }

}
