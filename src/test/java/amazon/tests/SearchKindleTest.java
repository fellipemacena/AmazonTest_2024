package amazon.tests;

import amazon.driver.DriverFactory;
import amazon.pages.page.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class SearchKindleTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = DriverFactory.createDriver();
        driver.get("https://www.amazon.com.br");
    }

    @AfterEach
    public void tearDown() {
        DriverFactory.quitDriver();
    }


    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.clickQuickAccessButtonLogin();
        loginPage.validTitleLogin();
        loginPage.insertEmail("email");
        loginPage.clickButtonContinue();
        loginPage.validateInputEmailSuccessfully();
        loginPage.insertPassword("senha");
        loginPage.clickButtonSignInSubmit();

        
        homePage.searchForItem("kindle");
        searchResultsPage.clickFirstItem();
        productPage.clickAddToCartButton();
        cartPage.verifyStatusAddProductToCart();

    }


}
