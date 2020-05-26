package pages;

import constants.Constants;

public class CreateAccountPage extends BasePage {

    public boolean isHeaderVisible() {
        return isElementExistByXpath(Constants.CREATE_ACCOUNT_PAGE_HEADER);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }
}
