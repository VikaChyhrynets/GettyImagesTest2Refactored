package gettyimages2.refactored;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class GettyImagesWebDriverTest {

    private GettyImagesWebDriver gettyImagesWebDriver;
    private GettyImagesPage gettyImagesPage;

    @BeforeAll
    public void setUp() {
        gettyImagesWebDriver = new GettyImagesWebDriver();
        gettyImagesPage = new GettyImagesPage(gettyImagesWebDriver.getDriver());
    }

    @DisplayName("Authorization to the https://www.gettyimages.com/")
    @Test
    @Order(1)
    public void authorizationTest() throws InterruptedException {
        log.info("Authorization test has been started...");
        String result = gettyImagesPage.closeCookies()
                .openAuthorizationPanel()
                .signIn()
                .userNameFill("vika.dolgikh@mail.ru")
                .passwordFill("19072014Vika")
                .signInButtonGetText();
        assertEquals("SIGN IN", result);
        gettyImagesPage.signInButtonClick();
        log.info("Authorization test is successfully completed.");
    }

    @DisplayName("Test 2: Add photos to the cart")
    @Test
    @Order(2)
    public void addPhotosToCart() throws InterruptedException {
        log.info("Add photos to cart test has been started...");
        String creativeButton = gettyImagesPage.closeVisualGPSInsightsButton()
                .creativePhotosSelectionGetText();
        assertEquals("CREATIVE", creativeButton);
        String addToCartButton1 = gettyImagesPage.creativePhotosSelectionClick()
                .selectPicture1()
                .selectPrice()
                .addToCartGetText();
        assertEquals("ADD TO CART", addToCartButton1);
        String addToCartButton2 = gettyImagesPage.addToCartClick()
                .backToMenuClick()
                .backToCreativeButtonClick()
                .selectPicture2()
                .selectPrice()
                .addToCartGetText();
        assertEquals("ADD TO CART", addToCartButton2);
        gettyImagesPage.addToCartClick()
                .viewCartClick();
        log.info("Add photos to cart test is successfully completed.");
    }

    @DisplayName("Test 3: Remove photos from the cart")
    @Test
    @Order(3)
    public void removePhotos() throws InterruptedException {
        log.info("Remove photos from the cart test has been started...");
        gettyImagesPage.clearCartClick();
        log.info("Remove photos from the cart test is successfully completed.");
    }

    @DisplayName("Test 4: Find pictures with cats and then add to cart/remove")
    @Test
    @Order(4)
    public void catsSearch() throws InterruptedException {
        log.info("Cats search test has been started...");
        String allButton = gettyImagesPage.searchFill("Cats")
                .searchClick()
                .allButtonGetText();
        assertEquals("All", allButton);
        gettyImagesPage.picture3NewWindow()
                .viewCartClick()
                .removePicture3();
        log.info("Cats search test is successfully completed.");
    }

    @DisplayName("Test 5: Sign out")
    @Test
    @Order(5)
    public void signOut() {
    log.info("Sign out test has been started...");
    String singOutButton = gettyImagesPage.goToAuthorizationPanel()
                    .signOutButtonGetText();
    assertEquals("SIGN OUT", singOutButton);
    gettyImagesPage.signOutButtonClick();
    log.info("Sign out test is completed.");
    }

    @AfterAll
    public void closeChromeTab() {
        gettyImagesWebDriver.getDriver().quit();
    }
}
