//package steps;
//
//import amazon.pages.page.CartPage;
//import amazon.pages.page.HomePage;
//import amazon.pages.page.ProductPage;
//import org.openqa.selenium.WebDriver;
//
////Repositório de métodos para agrupar ações comum a diversas classes
//public class AmazonSteps {
//
//    private WebDriver driver;
//    private HomePage amazonHomePage;
//    private ProductPage productPage;
//    private CartPage shoppingCartPage;
//
//    public AmazonSteps(WebDriver driver) {
//        this.driver = driver;
//        this.amazonHomePage = new HomePage(driver);
//        this.productPage = new ProductPage(driver);
//        this.shoppingCartPage = new CartPage(driver);
//    }
//
//    public void searchProduct(String productName) {
//        amazonHomePage.searchProduct(productName);
//    }
//
//    public void selectFirstProduct() {
//        productPage.selectFirstProduct();
//    }
//
//    public void addToCart() {
//        productPage.addToCart();
//    }
//
//    public void validateProductInCart(String productName) {
//        shoppingCartPage.validateProductInCart(productName);
//    }
//}