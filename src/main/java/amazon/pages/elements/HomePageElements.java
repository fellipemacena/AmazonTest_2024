package amazon.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements {
    private final WebDriver driver;

    public HomePageElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSearchBox() {
        return driver.findElement(By.id("twotabsearchtextbox"));
    }

    public WebElement getSearchButton() {
        return driver.findElement(By.id("nav-search-submit-button"));
    }

    //Interagir com LoginPage
    public WebElement getQuickAccessButtonLogin() {
        return driver.findElement(By.id("nav-link-accountList"));

    }
}
