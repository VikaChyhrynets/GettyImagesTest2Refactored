package gettyimages2.refactored;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettyImagesWebDriver {
    private WebDriver driver;

    public GettyImagesWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.gettyimages.com/");
        driver.manage().window().setSize(new Dimension(748, 824));
    }

    public WebDriver getDriver() {
        return driver;
    }

}
