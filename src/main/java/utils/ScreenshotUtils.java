package utils;

import org.openqa.selenium.*;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ScreenshotUtils {

    public static String takeScreenshot(WebDriver driver, String testName) {
        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy_HH-mm-ss"));
            String dir = "screenshots";
            Files.createDirectories(Path.of(dir));
            String path = dir + "/" + testName + "_" + time + ".png";
            Files.copy(src.toPath(), Path.of(path));
            return path;
        } catch (Exception e) {
            return "FAILED_TO_TAKE_SCREENSHOT";
        }
    }

}
