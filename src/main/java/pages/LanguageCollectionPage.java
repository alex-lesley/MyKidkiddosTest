package pages;
import constants.Constants;

public class LanguageCollectionPage extends BasePage{
    private static final String BOOK_XPATH = "//div[contains(text(), '%s')]";
    private static final String BOOK_XPATH2 = "//div[contains(text(), '%s') and contains(text(), '%s')]";
    private static final String ADD_BUTTON_XPATH = "//button[@name='add']";
    private static final String FORMAT_LIST_XPATH = "//select[@id='SingleOptionSelector-0']";
    private static final String HARDCOVER_OPTION_XPATH = "//select[@id='SingleOptionSelector-0']/option[text()='Hardcover']";
    private static final String REMOVE_BUTTON_XPATH = "(//p/a[text()='Remove'])[1]";

    public static final String BOOKS_NUMBER_IN_CART = "//div[@id='CartCount']/span//preceding-sibling::span";

    public void navigateToCollectionPage(String collection) {
        webDriver.get(String.format(Constants.COLLECTION_PAGE_URL, collection));
    }

    public void chooseBook(String title) {
        clickElementByXpath(String.format(BOOK_XPATH, title));
    }

    public void chooseBook(String title1, String title2) {
        clickElementByXpath(String.format(BOOK_XPATH2, title1, title2));
    }

    public boolean isHeaderVisible(String header) {
        return isElementExistByXpath(header);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }

    public void clickAddButton() {
        clickElementByXpath(ADD_BUTTON_XPATH);
    }

    public void clickRemoveButton() {
        clickElementByXpath(REMOVE_BUTTON_XPATH);
    }

    public void choseHardcoverOption() {
        clickElementByXpath(FORMAT_LIST_XPATH);
        clickElementByXpath(HARDCOVER_OPTION_XPATH);
    }

    public String getNumberFromCart() {
        return getTextFromTextFieldByXpath(BOOKS_NUMBER_IN_CART);
    }

    public void addBookFromCollection(String book, String collection) {
        navigateToCollectionPage(collection);
        chooseBook(book);
        clickAddButton();
    }

    public void addHardcoverBookFromCollection(String book, String collection) {
        navigateToCollectionPage(collection);
        chooseBook(book);
        choseHardcoverOption();
        clickAddButton();
    }

    public void addBookFromCollection(String book1, String book2, String collection) {
        navigateToCollectionPage(collection);
        chooseBook(book1, book2);
        clickAddButton();
    }

    public void clearCart() {
        while(isElementExistByXpath(BOOKS_NUMBER_IN_CART)) {
            clickRemoveButton();
        }
    }



}
