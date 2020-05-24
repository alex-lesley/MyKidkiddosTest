package pages;

import constants.Constants;

public class LanguageCollectionPage extends BasePage{

    public boolean isHeaderVisible(String header) {
        return isElementExistByXpath(header);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }
}
