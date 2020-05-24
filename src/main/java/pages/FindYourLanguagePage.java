package pages;

import constants.Constants;

public class FindYourLanguagePage extends BasePage {
    public boolean isHeaderVisible() {
        return isElementExistByXpath(Constants.FIND_YOUR_LANGUAGE_PAGE_HEADER);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }
}
