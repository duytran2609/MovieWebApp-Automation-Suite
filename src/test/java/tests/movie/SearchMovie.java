package tests.movie;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MoviePage;

import java.util.List;

public class SearchMovie extends BaseTest {

    private LoginPage loginPage;
    private HomePage homePage;
    private MoviePage moviePage;

    @BeforeMethod
    public void setUpSeeMovieDetailsTest() {
        driver.get("https://movie-project-front-end.vercel.app/login");
        loginPage = new LoginPage(driver);
        homePage = loginPage.login("trandangduy13@gmail.com", "xanhlacay1");
        moviePage = homePage.headerComponent.navigateToMoviePage();
    }

    @Test
    public void shouldSearchWithValidResult() {
        String keyword = "lego";
        moviePage.searchMovie(keyword);
        List<String> titles = moviePage.getAllMovieTitles();
        Assert.assertTrue(titles.stream().anyMatch(t -> t.contains(keyword))
                , "Không có movie nào chứa keyword"
        );
    }

    @Test
    public void shouldSearchWithInvalidResult() {
        String keyword = "dsbdbjsajdkjdbsj";
        moviePage.searchMovie(keyword);
        Assert.assertEquals(moviePage.getNoMovieFoundMessage(), "Không tìm thấy phim nào"
        );
    }

    @Test
    public void shouldSearchWithLeadingWhiteSpace() {
        String keyword = " leg";
        moviePage.searchMovie(keyword);
        Assert.assertTrue(moviePage.getAllMovieTitles().size() > 0
                , "Search với space đầu không ra kết quả"
        );
    }


}
