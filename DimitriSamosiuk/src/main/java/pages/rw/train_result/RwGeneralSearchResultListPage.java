package pages.rw.train_result;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RwGeneralSearchResultListPage extends BasePage {
    public RwGeneralSearchResultListPage(WebDriver driver) {
        super(driver);
    }
    public static final String[] RANDOM_SYMBOLS_LIST = {"!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", ">", "{", "}", "\"", ":", ";"};
    public static String CITY_TEXT_VALUE = "Санкт-Петербург";
    private final By GENERAL_SEARCH_RESULT_PREVIEW_TITLE_LIST = By.xpath("//li//div[@class='search-preview']/preceding-sibling::h3/a");

    public By getGeneralSearchResultPreviewTitleList() {
        return GENERAL_SEARCH_RESULT_PREVIEW_TITLE_LIST;
    }
}
