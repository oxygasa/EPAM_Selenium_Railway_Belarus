package pages.rw.header;

import commons.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class RwHeader extends BasePage {
    public RwHeader(WebDriver driver) {
        super(driver);
    }
    /**
     * Message to the mentor
     * Requirements: Double interpretation about “Timetable” section. The name has been changed to "Tickets".
     * "Timetable" section is presented only on the Main Page body.
     */
    public static final By SWITCH_TO_ENGLISH = By.xpath("//a[@href='/en/']");
    public static final By HEADER_BUTTON_LIST = By.xpath("//table[@class='menu-items']//b");
    public static final By HEADER_SEARCH_BOX = By.id("searchinp");
    public static final By HEADER_SEARCH_SUBMIT_BUTTON = By.xpath("//div[@class='top-search']//button[@type='submit']");
    public static final By RW_COMPANY_LOGO = By.className("logo-png");

}
