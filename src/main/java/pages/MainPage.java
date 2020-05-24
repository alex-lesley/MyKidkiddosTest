package pages;

import constants.Constants;

public class MainPage extends BasePage {


    public void navigateToMainPage() {
        webDriver.get(Constants.MAIN_URL);
    }

    public boolean isHeaderVisible() {
        return isElementExistByXpath(Constants.MAIN_PAGE_HEADER);
    }

    public String getPageURL() {
        return getCurrentPageURL();
    }

    public ContactUsPage openContactUsPage() {
        clickElementByXpath(Constants.CONTACT_US_PAGE_LINK);
        return new ContactUsPage();
    }

    public BlogPage openBlogPage() {
        clickElementByXpath(Constants.BLOG_PAGE_LINK);
        return new BlogPage();
    }

    public BlogPage openBlogPageResources() {
        clickElementByXpath(Constants.RESOURCES_MENU_LINK);
        clickElementByXpath(Constants.BLOG_PAGE_LINK);
        return new BlogPage();
    }

    public VideoPage openVideoPage() {
        clickElementByXpath(Constants.RESOURCES_MENU_LINK);
        clickElementByXpath(Constants.VIDEO_PAGE_LINK);
        return new VideoPage();
    }

    public FaqsPage openFaqsPage() {
        clickElementByXpath(Constants.FAQS_PAGE_LINK);
        return new FaqsPage();
    }

    public LanguageCollectionPage openLanguageCollectionPage(String link) {
        clickElementByXpath(link);
        return new LanguageCollectionPage();
    }

    public LanguageCollectionPage openLanguageCollectionPageByLanguages(String menuLink, String collectionLink) {
        clickElementByXpath(menuLink);
        clickElementByXpath(collectionLink);
        return new LanguageCollectionPage();
    }

    public FindYourLanguagePage openFindYourLanguagePage(String menuLink) {
        clickElementByXpath(menuLink);
        clickElementByXpath(menuLink);
        return new FindYourLanguagePage();
    }

    public EbooksPage openEbooksPage() {
        clickElementByXpath(Constants.EBOOKS_MENU_LINK);
        clickElementByXpath(Constants.EBOOKS_MENU_LINK);
        return new EbooksPage();
    }

    public LanguageCollectionPage openEbooksCollectionPage(String collectionLink) {
        clickElementByXpath(Constants.EBOOKS_MENU_LINK);
        clickElementByXpath(collectionLink);
        return new LanguageCollectionPage();
    }
}
