package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ForgetPasswordPage extends BasePage {

    private LoginPage loginPage;

    By inputEmail = By.id("email");
    By btnSubmit = By.className("forgot-password-btn");
    By txtBackLogin = By.xpath("//*[@id=\"root\"]/div/div/div/div/p");


    public ForgetPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void inputEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputEmail)).clear();
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void clickSendButton() {
        driver.findElement(btnSubmit).click();
    }

    public boolean isSendSuccess() {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(btnSubmit));
    }


}
