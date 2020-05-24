package pages;

import constants.Constants;

public class EbooksPage extends BasePage{
    public boolean isHeaderVisible() {
        return isElementExistByXpath(Constants.EBOOKS_PAGE_HEADER);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }
}
