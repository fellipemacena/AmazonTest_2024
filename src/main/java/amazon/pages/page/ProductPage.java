package amazon.pages.page;

import amazon.pages.actions.ProductPageActions;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private final ProductPageActions productPageActions;

    public ProductPage(WebDriver driver) {
        productPageActions = new ProductPageActions(driver);
    }

    public void clickAddToCartButton() {
        productPageActions.clickAddToCartButton();
    }
}
