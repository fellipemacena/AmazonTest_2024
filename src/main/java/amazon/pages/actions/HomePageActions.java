package amazon.pages.actions;

import amazon.pages.elements.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageActions {
    private final HomePageElements homePageElements;
    private final WebDriver driver;

    public HomePageActions(WebDriver driver) {
        homePageElements = new HomePageElements(driver);
        this.driver = driver;
    }

    public void searchForItem(String item) {
        WebElement searchBox = homePageElements.getSearchBox();
        searchBox.sendKeys(item);
        assertEquals(item, searchBox.getAttribute("value"), "Item do campo de busca não corresponde ao texto esperado");
//        homePageElements.getSearchBox().sendKeys(item);
        homePageElements.getSearchButton().click();
    }

    public void clickQuickAccessButtonLogin() {
        homePageElements.getQuickAccessButtonLogin().click();
        // Espera explícita para garantir que a nova página carregue
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#authportal-main-section > div:nth-child(2) > div.a-section.a-spacing-base > div.a-section > form > div > div > div > h1")));

        // Encontre o elemento e extraia o texto
        WebElement fazerLoginElement = driver.findElement(By.cssSelector("#authportal-main-section > div:nth-child(2) > div.a-section.a-spacing-base > div.a-section > form > div > div > div > h1"));
        String fazerLoginText = fazerLoginElement.getText();

        // Verifique se o texto está correto
        assertEquals("Fazer login", fazerLoginText);
    }
}
