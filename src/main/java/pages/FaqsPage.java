package pages;

import constants.Constants;

public class FaqsPage extends BasePage{

    public boolean isHeaderVisible() {
        return isElementExistByXpath(Constants.FAQS_PAGE_HEADER);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }
}
