package pages;

import base.BasePage;
import components.HeaderComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MovieDetailsPage extends BasePage {

    public HeaderComponent headerComponent;
    public MovieDetailsPage movieDetailsPage;
    public MoviePage moviePage;

    public MovieDetailsPage(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
    }

}
