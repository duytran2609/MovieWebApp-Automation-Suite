package pages;

import base.BasePage;
import components.HeaderComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MoviePage extends BasePage {

    public HeaderComponent headerComponent;
    public HomePage homePage;
    public MovieDetailsPage movieDetailsPage;

    private By txtTitleMoviePage = By.tagName("h1");

    private By crdMovie = By.xpath("//*[@id=\"root\"]/div/div/div[2]/a[1]");
    private By imgMoviePoster = By.cssSelector(".movie-poster");
    private By txtMovieTitle = By.cssSelector(".movie-title");
    private By txtMovieYear = By.cssSelector(".movie-meta");

    public MoviePage(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
    }

    public boolean isMoviePageTitleDisplay() {
        return isDisplayed(txtTitleMoviePage);
    }

    private List<WebElement> getMovies() {
        wait.until(ExpectedConditions.presenceOfElementLocated(crdMovie));
        return driver.findElements(crdMovie);
    }

    public int getNumberOfMovies() {
        return getMovies().size();
    }

    private WebElement getFirstMovie() {
        return getMovies().get(0);
    }

    public boolean isMovieCardDisplay() {
        return getFirstMovie().isDisplayed();
    }

    public boolean isMoviePosterDisplay() {
        return getFirstMovie().findElement(imgMoviePoster).isDisplayed();
    }

    public boolean isMovieTitleDisplay() {
        return getFirstMovie().findElement(txtMovieTitle).isDisplayed();
    }

    public boolean isMovieYearDisplay() {
        return getFirstMovie().findElement(txtMovieYear).isDisplayed();
    }

    public MovieDetailsPage navigateToMovieDetailsPage() {
        click(crdMovie);
        return new MovieDetailsPage(driver);
    }

    public boolean isNavigateToMovieDetailsPage() {
        String hrefPart = driver.findElement(crdMovie).getAttribute("href");
        return wait.until(ExpectedConditions.urlContains(hrefPart));
    }
}
