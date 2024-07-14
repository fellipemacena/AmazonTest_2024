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
<<<<<<< HEAD
        loginPage.insertWrongEmail("wrongEmail");
=======
        loginPage.insertWrongEmail("email");
>>>>>>> e9c50a720046f16ffba3c8028a060d406d3cdb54
        loginPage.clickButtonContinue();
        loginPage.readWrongEmailMessage();
    }

    @Test
    public void testWrongPasswordLogin() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickQuickAccessButtonLogin();
<<<<<<< HEAD
        loginPage.insertEmail("email");
        loginPage.clickButtonContinue();
        loginPage.insertWrongPassword("wrongpassword");
=======
        loginPage.insertEmail("email");
        loginPage.clickButtonContinue();
        loginPage.insertWrongPassword("wrongpasswod");
>>>>>>> e9c50a720046f16ffba3c8028a060d406d3cdb54
        loginPage.clickButtonSignInSubmit();
        loginPage.readWrongPasswordMessage();
    }

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickQuickAccessButtonLogin();
        loginPage.validTitleLogin();
<<<<<<< HEAD
        loginPage.insertEmail("rightEmail");
        loginPage.clickButtonContinue();
        loginPage.validateInputEmailSuccessfully();
        loginPage.insertPassword("rightPassword!");
=======
        loginPage.insertEmail("email");
        loginPage.clickButtonContinue();
        loginPage.validateInputEmailSuccessfully();
        loginPage.insertPassword("password");
>>>>>>> e9c50a720046f16ffba3c8028a060d406d3cdb54
        loginPage.clickButtonSignInSubmit();
    }


}
