package amazon.pages.page;

import amazon.pages.actions.LoginPageActions;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final LoginPageActions loginPageActions;

    public LoginPage(WebDriver driver) {
        loginPageActions = new LoginPageActions(driver);
    }

    public void validTitleLogin() {
        loginPageActions.validTitleLogin();
    }

    public void insertEmail(String email) {
        loginPageActions.insertEmail(email);
    }

    public void clickButtonContinue() {
        loginPageActions.clickButtonContinue();
    }

    public void validateInputEmailSuccessfully() {
        loginPageActions.validateInputEmailSuccessfully();
    }

    public void insertPassword(String password) {
        loginPageActions.insertPassword(password);
    }

    public void clickButtonSignInSubmit() {
        loginPageActions.clickButtonSignInSubmit();
    }

    public void insertWrongEmail(String email) {
        loginPageActions.insertWrongEmail(email);
    }

    public void readWrongEmailMessage() {
        loginPageActions.readWrongEmailMessage();
    }

    public void insertWrongPassword(String password) {
        loginPageActions.insertWrongPassword(password);
    }

    public void readWrongPasswordMessage() {
        loginPageActions.readWrongPasswordMessage();
    }
}
