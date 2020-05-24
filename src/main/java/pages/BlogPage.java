package pages;

import constants.Constants;

public class BlogPage extends BasePage{

    public boolean isHeaderVisible() {
        return isElementExistByXpath(Constants.BLOG_PAGE_HEADER);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }
}
