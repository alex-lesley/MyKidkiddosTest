package constants;

public class Constants {
    public static final String MAIN_URL = "https://kidkiddos.com/";
    public static final String CONTACT_US_PAGE_URL = "https://kidkiddos.com/pages/contact-us";
    public static final String FAQS_PAGE_URL = "https://kidkiddos.com/pages/faq";
    public static final String BLOG_PAGE_URL = "https://kidkiddos.com/blogs/all-blog-posts";
    public static final String COLLECTION_PAGE_URL = "https://kidkiddos.com/collections/%s";
    public static final String VIDEO_PAGE_URL = "https://kidkiddos.com/pages/videos-for-kids";
    public static final String FIND_YOUR_LANGUAGE_PAGE_URL = "https://kidkiddos.com/collections";
    public static final String EBOOKS_PAGE_URL = "https://kidkiddos.com/collections/ebooks";
    public static final String LOGIN_PAGE_URL = "https://kidkiddos.com/account/login";
    public static final String CART_PAGE_URL = "https://kidkiddos.com/cart";
    public static final String CREATE_ACCOUNT_PAGE_URL = "https://kidkiddos.com/account/register";

    public static final String MAIN_PAGE_HEADER = "//strong[text()='ONE BOOK']";
    public static final String CONTACT_US_PAGE_HEADER = "//h1[text()='Contact us']";
    public static final String FAQS_PAGE_HEADER = "//h1[text()='FAQ/addition info']";
    public static final String BLOG_PAGE_HEADER = "//h1[text()='Blog']";
    public static final String VIDEO_PAGE_HEADER = "//h1[text()='Fun and Educational Videos for Kids']";
    public static final String COLLECTION_PAGE_HEADER = "//h1[contains(text(), '%s')]";
    public static final String FIND_YOUR_LANGUAGE_PAGE_HEADER = "//h1[text()='Find your language']";
    public static final String EBOOKS_PAGE_HEADER = "//h1[text()='ebooks']";
    public static final String LOGIN_PAGE_HEADER = "//h1[text()='Login']";
    public static final String CART_PAGE_HEADER = "//h1[text()='Your cart']";
    public static final String CREATE_ACCOUNT_PAGE_HEADER = "//h1[text()='Create Account']";
    public static final String RESET_PASSWORD_HEADER = "//h2[text()='Reset your password']";

    public static final String CONTACT_US_PAGE_LINK = "//a[text()='Contact us']";
    public static final String FAQS_PAGE_LINK = "//a[text()='FAQs']";
    public static final String RESOURCES_MENU_LINK = "//a[@href='/pages/videos-for-kids'][@class='site-nav__link site-nav__link--main']";
    public static final String VIDEO_PAGE_LINK = "//a[@href='/pages/videos-for-kids'][@class='site-nav__link site-nav__child-link']";
    public static final String BLOG_PAGE_LINK = "//a[text()='Blog'][@class='site-nav__link site-nav__link--main']";
    public static final String BLOG_PAGE_RESOURCES_LINK = "//a[text()='Blog'][@class='site-nav__link site-nav__child-link site-nav__link--last']//parent::li";
    public static final String COLLECTION_PAGE_LINK = "//a[@href='/collections/%s'][@class='site-nav__link site-nav__link--main']";
    public static final String BOOKS_BY_LANGUAGE_MENU_LINK = "//a[@href='/collections'][contains(text(), 'Books by language')][@class='site-nav__link site-nav__link--main']";
    public static final String EBOOKS_MENU_LINK = "//a[contains(text(), 'eBooks by language')][@class='site-nav__link site-nav__link--main']";
    public static final String ALL_LANGUAGES_MENU_LINK = "//a[contains(text(), 'All Languages')][@class='site-nav__link site-nav__link--main']";
    public static final String ARABIC_COLLECTION_PAGE_BY_LANGUAGE_LINK = "//div[@id='SiteNavLabel-books-by-language']//a[contains(text(), 'Arabic')]";
    public static final String BULGARIAN_COLLECTION_PAGE_BY_LANGUAGE_LINK = "//div[@id='SiteNavLabel-books-by-language']//a[contains(text(), 'Bulgarian')]";
    public static final String ARABIC_COLLECTION_PAGE_ALL_LANGUAGES_LINK = "//div[@id='SiteNavLabel-all-languages']//a[contains(text(), 'Arabic')]";
    public static final String BULGARIAN_COLLECTION_PAGE_ALL_LANGUAGES_LINK = "//div[@id='SiteNavLabel-all-languages']//a[contains(text(), 'Bulgarian')]";
    public static final String ARABIC_EBOOKS_COLLECTION_PAGE_LINK = "//div[@id='SiteNavLabel-ebooks-by-language']//a[@href='/collections/ebooks-in-arabic']";
    public static final String CHINESE_EBOOKS_COLLECTION_PAGE_LINK = "//div[@id='SiteNavLabel-ebooks-by-language']//a[@href='/collections/ebooks-in-chinese-mandarin']";
    public static final String LOGIN_PAGE_LINK = "//a[@href='/account/login']";
    public static final String CART_PAGE_LINK = "//a[@href='/cart']";

}
