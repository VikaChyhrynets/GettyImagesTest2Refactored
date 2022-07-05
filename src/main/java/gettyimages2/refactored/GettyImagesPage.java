package gettyimages2.refactored;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GettyImagesPage {

    private WebDriver driver;

    private int timeOutMillis = 1000;

    // Test1 - authorization
    @FindBy(how = How.XPATH, using = "//*[@id=\"onetrust-close-btn-container\"]/button")
    private WebElement closeCookiesButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[6]/div[4]/a")
    private WebElement authorizationPanelButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-top-header-wrapper\"]" +
            "/header-side-panels/div[3]/div[2]/div[4]/div/a[1]")
    private WebElement newSessionButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"new_session_username\"]")
    private WebElement userNameField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"new_session_password\"]")
    private WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"new_new_session\"]/div[1]")
    private WebElement finalSignInButton;

    // Test2 - add to cart
    @FindBy(how = How.XPATH, using = "//*[@id=\"customer_notifications_application\"]/div/div/div[2]")
    private WebElement visualGPSInsightsButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/section/div/ul/li[1]/a")
    private WebElement creativeButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/section/div/div[2]/div[1]/a")
    private WebElement picture1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"XS\"]")
    private WebElement priceButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"react_buy_card\"]/div/div/div[3]/div[1]/button")
    private WebElement addToCartButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"react_buy_card\"]/div/div/div[3]/div[2]/div/button")
    private WebElement addToCartButtonWindow;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[4]/div[1]")
    private WebElement menuButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[2]/ul/li[1]/a")
    private WebElement backToSelectionButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/section/div/div[2]/div[2]")
    private WebElement picture2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[6]/div[2]")
    private WebElement viewCartButton;

    // Test 3 - remove from cart

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart-item-list\"]/div[2]/div/div/figure/ul/li[2]/a")
    private WebElement deletePicture1Button;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart-item-list\"]/div/div/div/figure/ul/li[2]/a")
    private WebElement deletePicturesButton;

    // Test 4 - cats search

    @FindBy(how = How.XPATH, using = "//*[@id=\"gix-search-phrase\"]")
    private WebElement searchField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-wrapper\"]/header-search-bar/div[2]/div/form/div[1]/button")
    private WebElement searchButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/section/div/main/div/div/div[3]/div/div/div[2]/ul/li[1]")
    private WebElement allButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/section/div/main/div/div/div[4]/div[2]/div[2]/div[1]/article")
    private WebElement picture3;

    // Test 5 - sign out

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[6]/div[3]/button")
    private WebElement accountPannelButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"site-top-header-wrapper\"]/header-side-panels/div[3]/div[2]/div[1]/div[3]/a[5]")
    private WebElement signOutButton;

    public GettyImagesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public GettyImagesPage closeCookies() throws InterruptedException {
        Thread.sleep(timeOutMillis);
        closeCookiesButton.click();
        return this;
    }

    public GettyImagesPage openAuthorizationPanel() {
        authorizationPanelButton.click();
        return this;
    }

    public GettyImagesPage signIn() throws InterruptedException {
        Thread.sleep(timeOutMillis);
        newSessionButton.click();
        return this;
    }

    public GettyImagesPage userNameFill(String usernameOrEmail) {
        userNameField.click();
        userNameField.sendKeys(usernameOrEmail);
        return this;
    }

    public GettyImagesPage passwordFill(String password) {
        passwordField.click();
        passwordField.sendKeys(password);
        return this;
    }

    public String signInButtonGetText(){
        return finalSignInButton.getText();
    }

    public GettyImagesPage signInButtonClick() {
        finalSignInButton.click();
        return this;
    }


    public GettyImagesPage closeVisualGPSInsightsButton() throws InterruptedException {
        Thread.sleep(timeOutMillis);
        visualGPSInsightsButton.click();
        return this;
    }

    public String creativePhotosSelectionGetText() {
        return creativeButton.getText();
    }

    public GettyImagesPage creativePhotosSelectionClick() throws InterruptedException {
        Thread.sleep(timeOutMillis);
        creativeButton.click();
        return this;
    }


    public GettyImagesPage selectPicture1() {
        picture1.click();
        return this;
    }

    public GettyImagesPage selectPrice() throws InterruptedException {
        Thread.sleep(timeOutMillis);
        priceButton.click();
        return this;
    }

    public String addToCartGetText() {
        return addToCartButton.getText();
    }

    public GettyImagesPage addToCartClick() {
        addToCartButton.click();
        return this;
    }

    public GettyImagesPage backToMenuClick() {
        menuButton.click();
        return this;
    }

    public GettyImagesPage backToCreativeButtonClick() throws InterruptedException {
        Thread.sleep(timeOutMillis);
        backToSelectionButton.click();
        return this;
    }

    public GettyImagesPage selectPicture2() {
        picture2.click();
        return this;
    }

    public GettyImagesPage viewCartClick() throws InterruptedException {
        Thread.sleep(timeOutMillis);
        viewCartButton.click();
        return this;
    }

    public GettyImagesPage clearCartClick() throws InterruptedException {
        Thread.sleep(timeOutMillis);
        deletePicture1Button.click();
        deletePicturesButton.click();
        return this;
    }

    public GettyImagesPage searchFill(String cats) {
        searchField.click();
        searchField.sendKeys(cats);
        return this;
    }

    public GettyImagesPage searchClick() {
        searchButton.click();
        return this;
    }

    public String allButtonGetText() {
        return allButton.getText();
    }

    public GettyImagesPage picture3NewWindow() throws InterruptedException {
        String originalWindow = driver.getWindowHandle();
        picture3.click();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        Thread.sleep(timeOutMillis*5);
        addToCartButtonWindow.click();
        driver.switchTo().window(originalWindow);
        return this;
    }

    public GettyImagesPage removePicture3() throws InterruptedException {
        Thread.sleep(timeOutMillis);
        deletePicturesButton.click();
        return this;
    }

    public GettyImagesPage goToAuthorizationPanel() {
        accountPannelButton.click();
        return this;
    }

    public String signOutButtonGetText() {
        return signOutButton.getAttribute("innerText");
    }

    public GettyImagesPage signOutButtonClick() {
        signOutButton.click();
        return this;
    }

}
