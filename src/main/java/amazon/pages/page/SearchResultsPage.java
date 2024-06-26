package amazon.pages.page;

import amazon.pages.actions.SearchResultsPageActions;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {

    private final SearchResultsPageActions searchResultsPageActions;

    public SearchResultsPage(WebDriver driver) {
        searchResultsPageActions = new SearchResultsPageActions(driver);
    }

    public void clickFirstItem(){
        searchResultsPageActions.clickFirstItem();
    }
}
