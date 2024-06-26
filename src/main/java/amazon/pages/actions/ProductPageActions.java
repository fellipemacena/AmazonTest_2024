package amazon.pages.actions;

import amazon.pages.elements.ProductPageElements;
import org.openqa.selenium.WebDriver;

public class ProductPageActions {
    private final ProductPageElements productPageElements;

    public ProductPageActions(WebDriver driver) {
        productPageElements = new ProductPageElements(driver);
    }

    public void clickAddToCartButton() {
        productPageElements.getAddToCartButton().click();

    }
}