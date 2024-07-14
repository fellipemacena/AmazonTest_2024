package amazon.pages.actions;

import amazon.pages.elements.HomePageElements;
import amazon.pages.elements.LoginPageElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPageActions {
    private final LoginPageElements loginPageElements;
    private final HomePageElements homePageElements;

    public LoginPageActions(WebDriver driver) {
        loginPageElements = new LoginPageElements(driver);
        homePageElements = new HomePageElements(driver);
    }

    public void validTitleLogin() {
        WebElement titleLogin = loginPageElements.getTitleLogin();
        String actualTitle = titleLogin.getText();
        String expectedTitle = "Fazer login";
        assertEquals(expectedTitle, actualTitle, "O título da página de login não corresponde ao esperado.");
    }

    public void insertWrongEmail(String email) {
        WebElement emailField = loginPageElements.getEmailField();
        emailField.sendKeys(email);
        assertEquals(email, emailField.getAttribute("value"), "O campo de email não contém o valor esperado.");
    }

    public void readWrongEmailMessage() {
        WebElement wrongMessage = loginPageElements.getWrongEmailMessage();
        String actualMessage = wrongMessage.getText();
        String expectedMessage = "Não encontramos uma conta associada a este endereço de e-mail";
        assertEquals(expectedMessage, actualMessage, "A mensagem de email inválido não corresponde ao esperado.");
    }

    public void insertEmail(String email) {
        WebElement emailField = loginPageElements.getEmailField();
        emailField.sendKeys(email);
        assertEquals(email, emailField.getAttribute("value"), "O campo de email não contém o valor esperado.");
    }

    public void clickButtonContinue() {
        loginPageElements.getButtonContinue().click();
    }

    public void validateInputEmailSuccessfully() {
        WebElement validInputEmailSuccessfully = loginPageElements.getValidInputEmailSuccessfully();
        String validEmailSuccessfully = validInputEmailSuccessfully.getText();
        String expectedEmailSuccessfully = "senha";
        assertEquals(expectedEmailSuccessfully, validEmailSuccessfully, "O email exibido não corresponde ao esperado.");
    }

    public void insertPassword(String password) {
        WebElement passwordField = loginPageElements.getPasswordField();
        passwordField.sendKeys(password);
        assertEquals(password, passwordField.getAttribute("value"), "O campo de senha não contém o valor esperado.");
    }

    public void clickButtonSignInSubmit() {
        loginPageElements.getButtonSignInSubmit().click();
    }

    public void insertWrongPassword(String password) {
        WebElement passwordField = loginPageElements.getPasswordField();
        passwordField.sendKeys(password);
        assertEquals(password, passwordField.getAttribute("value"), "O campo de senha não contém o valor esperado.");
    }

    public void readWrongPasswordMessage() {
        WebElement wrongPasswordMessage = loginPageElements.getWrongPasswordMessage();
        String actualMessage = wrongPasswordMessage.getText();
        String expectedMessage = "Sua senha está incorreta";
        assertEquals(expectedMessage, actualMessage, "A mensagem de senha incorreta não corresponde ao esperado.");
    }
}
