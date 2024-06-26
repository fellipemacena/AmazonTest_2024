package amazon.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPageElements {

    private final WebDriver driver;

    public SearchResultsPageElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstItem() {
       return driver.findElement(By.cssSelector(".s-main-slot .s-result-item h2 a"));
    }

}
