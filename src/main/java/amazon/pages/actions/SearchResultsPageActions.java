package amazon.pages.actions;

import amazon.pages.elements.SearchResultsPageElements;
import org.openqa.selenium.WebDriver;

public class SearchResultsPageActions {
    private final SearchResultsPageElements searchResultsPageElements;

    public SearchResultsPageActions(WebDriver driver) {
        searchResultsPageElements = new SearchResultsPageElements(driver);
    }

    public void clickFirstItem() {
        searchResultsPageElements.getFirstItem().click();
    }
}
