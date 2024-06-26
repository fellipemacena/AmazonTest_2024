package amazon.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CartPageElements {
    private final WebDriver driver;

    public CartPageElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getStatusAddProductToCart() {
        return driver.findElement(By.cssSelector("#NATC_SMART_WAGON_CONF_MSG_SUCCESS > h1"));
    }

}