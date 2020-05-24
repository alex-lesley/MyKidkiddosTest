package pages;

import constants.Constants;

public class VideoPage extends BasePage {
    public boolean isHeaderVisible() {
        return isElementExistByXpath(Constants.VIDEO_PAGE_HEADER);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }
}
