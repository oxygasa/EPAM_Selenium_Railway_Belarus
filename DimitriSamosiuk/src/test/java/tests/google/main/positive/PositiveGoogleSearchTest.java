package tests.google.main.positive;

import constants.Constant;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import pages.google.GoogleMainPage;
import pages.google.GoogleResultListPage;
import pages.rw.main.RwMainPage;
import tests.base.BaseTest;


public class PositiveGoogleSearchTest extends BaseTest {

    @Test(priority = 3)
    @Description("Requirements: https://clck.ru/ZXihb")
    @Epic("RW001")
    @Feature("3rd party web search service")
    @Story("As user I want to search by a request \"белорусская железная дорога\" " +
            "in a google.com and open the rw.by main page by clicking a search service redirect link." +
            "So I want to do it via 3rd party web search service - Google.")
    @Severity(SeverityLevel.TRIVIAL)

    public void searchTheRwByMainPageUsingGoogleSearchTest() {
        GoogleMainPage.goToUrl(Constant.Urls.GOOGLE_MAIN_PAGE_URL);
        GoogleMainPage.typeText(GoogleMainPage.GOOGLE_SEARCH_BOX_INPUT, GoogleMainPage.SEARCH_BOX_TEXT_FOR_INPUT);
        GoogleMainPage.clickTheElement(GoogleMainPage.SEARCH_IN_GOOGLE_SUBMIT_BUTTON);
        GoogleResultListPage.clickTheElement(GoogleResultListPage.SEARCH_RESULT_TITLE_LINK_LIST);
        RwMainPage.assertElementIsDisplayed(RwMainPage.TRAIN_SEARCH_TEXT_FIELD_FROM);
    }
}