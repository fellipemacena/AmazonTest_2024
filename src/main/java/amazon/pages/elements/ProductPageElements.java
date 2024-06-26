package amazon.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageElements {
    private final WebDriver driver;

    public ProductPageElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-button"));
    }

}
