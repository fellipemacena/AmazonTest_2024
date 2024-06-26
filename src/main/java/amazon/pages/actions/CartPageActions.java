package amazon.pages.actions;

import amazon.pages.elements.CartPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartPageActions {
    private final CartPageElements cartPageElements;

    public CartPageActions(WebDriver driver) {
        cartPageElements = new CartPageElements(driver);
    }

    public void verifyStatusAddProductToCart() {
        WebElement statusElement = cartPageElements.getStatusAddProductToCart();
        String actualText = statusElement.getText();
        String expectedText = "Adicionado ao carrinho";

        assertEquals(expectedText, actualText,"Texto esperado não corresponde ao texto atual.");
    }
}
