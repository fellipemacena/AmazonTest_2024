package amazon.pages.page;

import org.openqa.selenium.WebDriver;
import amazon.pages.actions.HomePageActions;

public class HomePage {
    private final HomePageActions homePageActions;

    public HomePage(WebDriver driver) {
        homePageActions = new HomePageActions(driver);
    }

    public void searchForItem(String item) {
        homePageActions.searchForItem(item);
    }

    public void clickQuickAccessButtonLogin() {
        homePageActions.clickQuickAccessButtonLogin();
    }
}
