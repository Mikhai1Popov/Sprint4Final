package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StatusPage {
    private WebDriver driver;
    public StatusPage(WebDriver driver) {
        this.driver=driver;
    }

    private By status = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[text()='Самокат на складе']");

    public boolean checkStatusIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(3),Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(driver.findElement(status)));
        return driver.findElement(status).isDisplayed();
    }
}
