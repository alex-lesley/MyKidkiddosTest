import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LanguageCollectionPage;
import utils.BaseCases;

import static org.junit.jupiter.api.Assertions.*;


public class AddingBooksTest extends BaseCases {
    private static LanguageCollectionPage collectionPage;
    private final Logger logger = LogManager.getLogger(ContactUsFormTest.class);
    private static final String BOOK1 = "Amanda";
    private static final String BOOK2 = "I Love to Eat Fruits";
    private static final String BOOK3 = "I Love to Brush My Teeth";
    private static final String BOOK4 = "Goodnight, My Love";
    private static final String BOOK5_1 = "I Love Autumn";
    private static final String BOOK5_2 = "Book in Spanish";
    private static final String BOOK6 = "I Love to Sleep";

    @BeforeEach
    public void testSetup() {
        collectionPage = new LanguageCollectionPage();
        collectionPage.navigateToCollectionPage("english-only");
    }

    @AfterEach
    public void testTearDown() {
        collectionPage.clickRemoveButton();
    }


    @Test
    public void addingEnglishBookTest() {
        logger.info("Adding one english book to cart test");
        collectionPage.chooseBook(BOOK1);
        collectionPage.clickAddButton();
        assertEquals("1", collectionPage.getNumberFromCart());
        collectionPage.takeScreenshot("One_book_added");
    }

    @Test
    public void addingThreeEnglishBooksTest() {
        logger.info("Adding three printed english books to cart test");
        collectionPage.chooseBook("Amanda");
        collectionPage.clickAddButton();
        collectionPage.navigateBack();
        collectionPage.navigateBack();
        collectionPage.chooseBook(BOOK2);
        collectionPage.clickAddButton();
        collectionPage.navigateBack();
        collectionPage.navigateBack();
        collectionPage.chooseBook(BOOK3);
        collectionPage.clickAddButton();
        assertEquals("3", collectionPage.getNumberFromCart());
        collectionPage.takeScreenshot("Three_books_added");
        collectionPage.clickRemoveButton();
        collectionPage.clickRemoveButton();
    }

    @Test
    public void addingEnglishPrintedAndEbookTest() {
        logger.info("Adding one printed and one electronic english books to cart test");
        collectionPage.chooseBook(BOOK1);
        collectionPage.clickAddButton();
        collectionPage.navigateToCollectionPage("ebooks-in-english-only");
        collectionPage.chooseBook(BOOK4);
        collectionPage.clickAddButton();
        assertEquals("2", collectionPage.getNumberFromCart());
        collectionPage.takeScreenshot("Printed_and_ebook_added");
        collectionPage.clickRemoveButton();
    }

    @Test
    public void addingThreeLanguagesBooksEbookTest() {
        logger.info("Adding books in tree languages to cart test");
        collectionPage.chooseBook(BOOK1);
        collectionPage.clickAddButton();
        collectionPage.navigateToCollectionPage("spanish");
        collectionPage.chooseBook(BOOK5_1, BOOK5_2);
        collectionPage.clickAddButton();
        collectionPage.navigateToCollectionPage("french");
        collectionPage.chooseBook(BOOK6);
        collectionPage.clickAddButton();
        assertEquals("3", collectionPage.getNumberFromCart());
        collectionPage.takeScreenshot("Different_language_books_added");
        collectionPage.clickRemoveButton();
        collectionPage.clickRemoveButton();
    }

    @Test
    public void addingPaperbackAndHardcoverBookTest() {
        logger.info("Adding the same english book in paperback and hardcover to cart test");
        collectionPage.chooseBook(BOOK1);
        collectionPage.clickAddButton();
        collectionPage.navigateBack();
        collectionPage.choseHardcoverOption();
        collectionPage.clickAddButton();
        assertEquals("2", collectionPage.getNumberFromCart());
        collectionPage.takeScreenshot("Paperback_and_hardcover_books_added");
    }
}
