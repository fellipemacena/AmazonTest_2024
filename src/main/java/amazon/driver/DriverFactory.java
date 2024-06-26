package amazon.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
//        options.setHeadless(false);
//        options.addArguments("headless");
        driver = new ChromeDriver(options);
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
