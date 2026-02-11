package pages;

import base.BasePage;
import components.HeaderComponent;
import org.openqa.selenium.WebDriver;

public class MovieDetailsPage extends BasePage {

    // ===== LOCATORS =====
    // (chưa có)

    // ===== COMPONENTS =====
    public HeaderComponent headerComponent;

    // ===== CONSTRUCTOR =====
    public MovieDetailsPage(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
    }

    // ===== ACTIONS =====
    // (chưa có)

    // ===== GETTERS =====
    // (chưa có)

    // ===== HIGH-LEVEL =====
    // (chưa có)
}
