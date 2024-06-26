package amazon.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageElements {
    private final WebDriver driver;

    public LoginPageElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTitleLogin() {
        return driver.findElement(By.cssSelector("h1.a-spacing-small"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("ap_email"));
    }

    public WebElement getWrongEmailMessage() {
        return driver.findElement(By.cssSelector("#auth-error-message-box > div > div > ul > li > span"));
    }


    public WebElement getButtonContinue() {
        return driver.findElement(By.id("continue"));
    }

    public WebElement getValidInputEmailSuccessfully() {
        return driver.findElement(By.id("auth-email-claim"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("ap_password"));
    }

    public WebElement getWrongPasswordMessage() {
        return driver.findElement(By.cssSelector("#auth-error-message-box > div > div > ul > li > span"));
    }

    public WebElement getButtonSignInSubmit() {
        return driver.findElement(By.id("signInSubmit"));
    }

    public WebElement getQuickAccessButtonLogin() {
        return driver.findElement(By.id("nav-link-accountList"));
    }
}
