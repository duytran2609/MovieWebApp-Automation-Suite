package pages;

import base.BasePage;
import components.HeaderComponent;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    public HeaderComponent headerComponent;
    public MovieDetailsPage movieDetailsPage;
    public MoviePage moviePage;

    private By txtWelcomeHomePage = By.tagName("h1");
    private By txtExplore = By.linkText("Khám phá ngay");
    private By txtViewAll= By.linkText("Xem tất cả →");

    private By crdMovie = By.xpath("//*[@id=\"root\"]/div/section[3]/div/div[2]/a[1]");
    private By imgMoviePoster = By.cssSelector(".movie-poster");
    private By txtMovieTitle = By.cssSelector(".movie-title");
    private By txtMovieYear = By.cssSelector(".movie-meta");


    public HomePage(WebDriver driver) {
        super(driver);
        headerComponent = new HeaderComponent(driver);
        wait.until(ExpectedConditions.presenceOfElementLocated(crdMovie));
    }

    // ===== NAVIGATION =====
    public boolean isHomePageTitleDisplay() {
        return isDisplayed(txtWelcomeHomePage);
    }

    public boolean isExploreTextActive() {
        return isDisplayed(txtExplore) && isEnabled(txtExplore);
    }

    public MoviePage navigateToMoviePageByExploreText() {
        click(txtExplore);
        return new MoviePage(driver);
    }

    public boolean isNavigateToMoviePage() {
        moviePage = new MoviePage(driver);
        boolean isMoviePageUrl = driver.getCurrentUrl().toLowerCase().endsWith("movies");
        return isMoviePageUrl && moviePage.isMoviePageTitleDisplay();
    }

    public boolean isViewAllActive() {
        return isDisplayed(txtViewAll) && isEnabled(txtViewAll);
    }

    public MoviePage navigateToMoviePageByViewAllText() {
        click(txtViewAll);
        return new MoviePage(driver);
    }

    // ===== LIST MOVIE =====
    public List<WebElement> getMovies() {
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
