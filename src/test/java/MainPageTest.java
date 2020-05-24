import constants.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.BaseCases;

import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends BaseCases {
    private static MainPage mainPage;
    public final Logger logger = LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetup() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void testSetup() {
        mainPage.navigateToMainPage();
    }

    @Test
    public void mainPageLoadTest() {
        logger.info("Main page load test");
        mainPage.takeScreenshot("Main_page");
        assertEquals(Constants.MAIN_URL, mainPage.getPageURL(), "Main page URL does not match");
        assertTrue(mainPage.isHeaderVisible(), "Main page header is not visible");
    }

    @Test
    public void openContactUsPageTest() {
        logger.info("Contact us page open test");
        ContactUsPage contactUsPage = mainPage.openContactUsPage();
        contactUsPage.takeScreenshot("Contact_us_page");
        assertEquals(Constants.CONTACT_US_PAGE_URL, contactUsPage.getPageURL(), "Contact us page URL does not match");
        assertTrue(contactUsPage.isHeaderVisible(), "Contact us page header is not visible");
    }

    @Test
    public void openBlogPageTest() {
        logger.info("Blog page open test");
        BlogPage blogPage = mainPage.openBlogPage();
        blogPage.takeScreenshot("Blog_page");
        assertEquals(Constants.BLOG_PAGE_URL, blogPage.getPageURL(), "Blog page URL does not match");
        assertTrue(blogPage.isHeaderVisible(), "Blog page header is not visible");
    }

    @Test
    public void openBlogPageResourcesTest() {
        logger.info("Blog page from menu Resources open test");
        BlogPage blogPage = mainPage.openBlogPageResources();
        blogPage.takeScreenshot("Blog_page_resources");
        assertEquals(Constants.BLOG_PAGE_URL, blogPage.getPageURL(), "Blog page URL does not match");
        assertTrue(blogPage.isHeaderVisible(), "Blog page header is not visible");
    }

    @Test
    public void openVideoPageTest() {
        logger.info("Video page open test");
        VideoPage videoPage = mainPage.openVideoPage();
        videoPage.takeScreenshot("Video_page");
        assertEquals(Constants.VIDEO_PAGE_URL, videoPage.getPageURL(), "Video page URL does not match");
        assertTrue(videoPage.isHeaderVisible(), "Video page header is not visible");
    }

    @Test
    public void openFaqsPageTest() {
        logger.info("FAQs page open test");
        FaqsPage faqsPage = mainPage.openFaqsPage();
        faqsPage.takeScreenshot("FAQs_page");
        assertEquals(Constants.FAQS_PAGE_URL, faqsPage.getPageURL(), "FAQs page URL does not match");
        assertTrue(faqsPage.isHeaderVisible(), "FAQs page header is not visible");
    }

    @Test
    public void openSpanishCollectionPageTest() {
        logger.info("Spanish Collection page open test");
        LanguageCollectionPage languageCollectionPage = mainPage.openLanguageCollectionPage(Constants.SPANISH_COLLECTION_PAGE_LINK);
        languageCollectionPage.takeScreenshot("Spanish_collection_page");
        assertEquals(Constants.SPANISH_COLLECTION_PAGE_URL, languageCollectionPage.getPageURL(), "Spanish Collection page URL does not match");
        assertTrue(languageCollectionPage.isHeaderVisible(Constants.SPANISH_COLLECTION_PAGE_HEADER), "Spanish Collection page header is not visible");
    }

    @Test
    public void openFrenchCollectionPageTest() {
        logger.info("French Collection page open test");
        LanguageCollectionPage languageCollectionPage = mainPage.openLanguageCollectionPage(Constants.FRENCH_COLLECTION_PAGE_LINK);
        languageCollectionPage.takeScreenshot("French_collection_page");
        assertEquals(Constants.FRENCH_COLLECTION_PAGE_URL, languageCollectionPage.getPageURL(), "French Collection page URL does not match");
        assertTrue(languageCollectionPage.isHeaderVisible(Constants.FRENCH_COLLECTION_PAGE_HEADER), "French Collection page header is not visible");
    }

    @Test
    public void openChineseCollectionPageTest() {
        logger.info("Chinese Collection page open test");
        LanguageCollectionPage languageCollectionPage = mainPage.openLanguageCollectionPage(Constants.CHINESE_COLLECTION_PAGE_LINK);
        languageCollectionPage.takeScreenshot("Chinese_collection_page");
        assertEquals(Constants.CHINESE_COLLECTION_PAGE_URL, languageCollectionPage.getPageURL(), "Chinese Collection page URL do not match");
        assertTrue(languageCollectionPage.isHeaderVisible(Constants.CHINESE_COLLECTION_PAGE_HEADER), "Chinese Collection page header is not visible");
    }

    @Test
    public void openFindYourLanguageByLanguageTest() {
        logger.info("Find Your Language page open from Books by language menu test");
        FindYourLanguagePage findYourLanguagePage = mainPage.openFindYourLanguagePage(Constants.BOOKS_BY_LANGUAGE_MENU_LINK);
        findYourLanguagePage.takeScreenshot("Find_your_language_page_by_language");
        assertEquals(Constants.FIND_YOUR_LANGUAGE_PAGE_URL, findYourLanguagePage.getPageURL(), "Find Your Language page URL does not match");
        assertTrue(findYourLanguagePage.isHeaderVisible(), "Find Your Language page header is not visible");
    }

    @Test
    public void openArabicCollectionPageByLanguageTest() {
        logger.info("Arabic Collection page open from Books by languages menu test");
        LanguageCollectionPage languageCollectionPage = mainPage.openLanguageCollectionPageByLanguages(Constants.BOOKS_BY_LANGUAGE_MENU_LINK, Constants.ARABIC_COLLECTION_PAGE_BY_LANGUAGE_LINK);
        languageCollectionPage.takeScreenshot("Arabic_collection_page_by_language");
        assertEquals(Constants.ARABIC_COLLECTION_PAGE_URL, languageCollectionPage.getPageURL(), "Arabic Collection page URL does not match");
        assertTrue(languageCollectionPage.isHeaderVisible(Constants.ARABIC_COLLECTION_PAGE_HEADER), "Arabic Collection page header is not visible");
    }

    @Test
    public void openBulgarianCollectionPageByLanguageTest() {
        logger.info("Bulgarian Collection page open from Books by language menu test");
        LanguageCollectionPage languageCollectionPage = mainPage.openLanguageCollectionPageByLanguages(Constants.BOOKS_BY_LANGUAGE_MENU_LINK, Constants.BULGARIAN_COLLECTION_PAGE_BY_LANGUAGE_LINK);
        languageCollectionPage.takeScreenshot("Bulgarian_collection_page_by_language");
        assertEquals(Constants.BULGARIAN_COLLECTION_PAGE_URL, languageCollectionPage.getPageURL(), "Bulgarian Collection page URL does not match");
        assertTrue(languageCollectionPage.isHeaderVisible(Constants.BULGARIAN_COLLECTION_PAGE_HEADER), "Bulgarian Collection page header is not visible");
    }

    @Test
    public void openFindYourLanguageAllLanguagesTest() {
        logger.info("Find Your Language page open from All languages menu test");
        FindYourLanguagePage findYourLanguagePage = mainPage.openFindYourLanguagePage(Constants.ALL_LANGUAGES_MENU_LINK);
//        findYourLanguagePage.takeScreenshot("Find_your_language_page_all_languages");
        assertEquals(Constants.FIND_YOUR_LANGUAGE_PAGE_URL, findYourLanguagePage.getPageURL(), "Find Your Language page URL does not match");
        assertTrue(findYourLanguagePage.isHeaderVisible(), "Find Your Language page header is not visible");
    }

    @Test
    public void openArabicCollectionPageAllLanguagesTest() {
        logger.info("Arabic Collection page open from All languages menu test");
        LanguageCollectionPage languageCollectionPage = mainPage.openLanguageCollectionPageByLanguages(Constants.ALL_LANGUAGES_MENU_LINK, Constants.ARABIC_COLLECTION_PAGE_ALL_LANGUAGES_LINK);
        languageCollectionPage.takeScreenshot("Arabic_collection_page_all_languages");
        assertEquals(Constants.ARABIC_COLLECTION_PAGE_URL, languageCollectionPage.getPageURL(), "Arabic Collection page URL does not match");
        assertTrue(languageCollectionPage.isHeaderVisible(Constants.ARABIC_COLLECTION_PAGE_HEADER), "Arabic Collection page header is not visible");
    }

    @Test
    public void openBulgarianCollectionPageAllLanguagesTest() {
        logger.info("Bulgarian Collection page open from All languages menu test");
        LanguageCollectionPage languageCollectionPage = mainPage.openLanguageCollectionPageByLanguages(Constants.ALL_LANGUAGES_MENU_LINK, Constants.BULGARIAN_COLLECTION_PAGE_ALL_LANGUAGES_LINK);
        languageCollectionPage.takeScreenshot("Bulgarian_collection_page_all_languages");
        assertEquals(Constants.BULGARIAN_COLLECTION_PAGE_URL, languageCollectionPage.getPageURL(), "Bulgarian Collection page URL does not match");
        assertTrue(languageCollectionPage.isHeaderVisible(Constants.BULGARIAN_COLLECTION_PAGE_HEADER), "Bulgarian Collection page header is not visible");
    }

    @Test
    public void openEbooksPageTest() {
        logger.info("E-books page open test");
        EbooksPage ebooksPage = mainPage.openEbooksPage();
        ebooksPage.takeScreenshot("Ebooks_page_all_languages");
        assertEquals(Constants.EBOOKS_PAGE_URL, ebooksPage.getPageURL(), "E-books page URL does not match");
        assertTrue(ebooksPage.isHeaderVisible(), "E-books page header is not visible");
    }

    @Test
    public void openArabicEbooksCollectionPageTest() {
        logger.info("Arabic E-books Collection page open test");
        LanguageCollectionPage languageCollectionPage = mainPage.openEbooksCollectionPage(Constants.ARABIC_EBOOKS_COLLECTION_PAGE_LINK);
        languageCollectionPage.takeScreenshot("Arabic_collection_page_all_languages");
        assertEquals(Constants.ARABIC_EBOOKS_PAGE_URL, languageCollectionPage.getPageURL(), "Arabic E-books Collection page URL does not match");
        assertTrue(languageCollectionPage.isHeaderVisible(Constants.ARABIC_EBOOKS_COLLECTION_PAGE_HEADER), "Arabic E-books Collection page header is not visible");
    }

    @Test
    public void openChineseEbooksCollectionPageTest() {
        logger.info("Chinese E-books Collection page open test");
        LanguageCollectionPage languageCollectionPage = mainPage.openEbooksCollectionPage(Constants.CHINESE_EBOOKS_COLLECTION_PAGE_LINK);
        languageCollectionPage.takeScreenshot("Chinese_collection_page_all_languages");
        assertEquals(Constants.CHINESE_EBOOKS_PAGE_URL, languageCollectionPage.getPageURL(), "Chinese E-books Collection page URL does not match");
        assertTrue(languageCollectionPage.isHeaderVisible(Constants.CHINESE_EBOOKS_COLLECTION_PAGE_HEADER), "Chinese E-books Collection page header is not visible");
    }


}
