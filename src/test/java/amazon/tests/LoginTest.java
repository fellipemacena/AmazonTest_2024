package amazon.tests;

import amazon.driver.DriverFactory;
import amazon.pages.page.LoginPage;
import amazon.pages.page.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest {
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
    public void testWrongEmailLogin() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickQuickAccessButtonLogin();
        loginPage.insertWrongEmail("testfafn@gmail.com");
        loginPage.insertWrongEmail("email");
        loginPage.clickButtonContinue();
        loginPage.readWrongEmailMessage();
    }

    @Test
    public void testWrongPasswordLogin() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickQuickAccessButtonLogin();
        loginPage.insertEmail("testfafm@gmail.com");
        loginPage.clickButtonContinue();
        loginPage.insertWrongPassword("wrongpassword");
        loginPage.insertEmail("email");
        loginPage.clickButtonContinue();
        loginPage.insertWrongPassword("wrongpasswod");
        loginPage.clickButtonSignInSubmit();
        loginPage.readWrongPasswordMessage();
    }

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickQuickAccessButtonLogin();
        loginPage.validTitleLogin();
        loginPage.insertEmail("testfafm@gmail.com");
        loginPage.clickButtonContinue();
        loginPage.validateInputEmailSuccessfully();
        loginPage.insertPassword("qazzaqqweewq1234!");
        loginPage.insertEmail("email");
        loginPage.clickButtonContinue();
        loginPage.validateInputEmailSuccessfully();
        loginPage.insertPassword("password");
        loginPage.clickButtonSignInSubmit();
    }


}
