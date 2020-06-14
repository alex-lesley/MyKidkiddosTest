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
    private static final String COLLECTION_1_URL = "english-only";
    private static final String COLLECTION_2_URL = "ebooks-in-english-only";
    private static final String COLLECTION_3_URL = "spanish";
    private static final String COLLECTION_4_URL = "french";

    @BeforeAll
    public static void classSetup() {
        collectionPage = new LanguageCollectionPage();
    }

    @AfterEach
    public void testTearDown() {
        collectionPage.clearCart();
    }


    @Test
    public void addingEnglishBookTest() {
        logger.info("Adding one english book to cart test");
        collectionPage.addBookFromCollection(BOOK1, COLLECTION_1_URL);
        assertEquals("1", collectionPage.getNumberFromCart());
        collectionPage.takeScreenshot("One_book_added");
    }

    @Test
    public void addingThreeEnglishBooksTest() {
        logger.info("Adding three printed english books to cart test");
        collectionPage.addBookFromCollection(BOOK1, COLLECTION_1_URL);
        collectionPage.addBookFromCollection(BOOK2, COLLECTION_1_URL);
        collectionPage.addBookFromCollection(BOOK3, COLLECTION_1_URL);
        assertEquals("3", collectionPage.getNumberFromCart());
        collectionPage.takeScreenshot("Three_books_added");
    }

    @Test
    public void addingEnglishPrintedAndEbookTest() {
        logger.info("Adding one printed and one electronic english books to cart test");
        collectionPage.addBookFromCollection(BOOK1, COLLECTION_1_URL);
        collectionPage.addBookFromCollection(BOOK4, COLLECTION_2_URL);
        assertEquals("2", collectionPage.getNumberFromCart());
        collectionPage.takeScreenshot("Printed_and_ebook_added");
    }

    @Test
    public void addingThreeLanguagesBooksEbookTest() {
        logger.info("Adding books in tree languages to cart test");
        collectionPage.addBookFromCollection(BOOK1, COLLECTION_1_URL);
        collectionPage.addBookFromCollection(BOOK5_1, BOOK5_2, COLLECTION_3_URL);
        collectionPage.addBookFromCollection(BOOK6, COLLECTION_4_URL);
        assertEquals("3", collectionPage.getNumberFromCart());
        collectionPage.takeScreenshot("Different_language_books_added");
    }

    @Test
    public void addingPaperbackAndHardcoverBookTest() {
        logger.info("Adding the same english book in paperback and hardcover to cart test");
        collectionPage.addBookFromCollection(BOOK1, COLLECTION_1_URL);
        collectionPage.addHardcoverBookFromCollection(BOOK1, COLLECTION_1_URL);
        assertEquals("2", collectionPage.getNumberFromCart());
        collectionPage.takeScreenshot("Paperback_and_hardcover_books_added");
    }
}
