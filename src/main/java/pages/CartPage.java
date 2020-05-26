package pages;

import constants.Constants;

public class CartPage extends BasePage {
    public boolean isHeaderVisible() {
        return isElementExistByXpath(Constants.CART_PAGE_HEADER);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }
}
