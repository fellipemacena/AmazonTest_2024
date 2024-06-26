package amazon.pages.page;

import amazon.pages.actions.CartPageActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final CartPageActions cartPageActions;

    public CartPage(WebDriver driver) {
        cartPageActions = new CartPageActions(driver);
    }

    public void verifyStatusAddProductToCart(){
        cartPageActions.verifyStatusAddProductToCart();
    }
}
