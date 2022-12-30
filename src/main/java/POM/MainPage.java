package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    public MainPage(WebDriver driver) {
        this.driver=driver;
        }

    private By closeCookieButton = By.className("App_CookieButton__3cvqF");
    private By firstQuestionHeader = By.id("accordion__heading-0");
    private By secondQuestionHeader = By.id("accordion__heading-1");
    private By thirdQuestionHeader = By.id("accordion__heading-2");
    private By fourthQuestionHeader = By.id("accordion__heading-3");
    private By fifthQuestionHeader = By.id("accordion__heading-4");
    private By sixthQuestionHeader = By.id("accordion__heading-5");
    private By seventhQuestionHeader = By.id("accordion__heading-6");
    private By eigthQuestionHeader = By.id("accordion__heading-7");

    private By firstAnswer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[2]/p");
    private By secondAnswer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]/div[2]/p");
    private By thirdAnswer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[3]/div[2]/p");
    private By fourthAnswer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[4]/div[2]/p");
    private By fifthAnswer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[5]/div[2]/p");
    private By sixthAnswer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[6]/div[2]/p");
    private By seventhAnswer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[7]/div[2]/p");
    private By eightAnswer = By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[8]/div[2]/p");

    public void clickCloseCookieButton() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOf(driver.findElement(closeCookieButton)));
        driver.findElement(closeCookieButton).click();
    }

    public void scrollToFAQ() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(firstQuestionHeader));
    }

    public void clickFirstQuestionHeader() {
        driver.findElement(firstQuestionHeader).click();
    }
    public void clickSecondQuestionHeader() {
        driver.findElement(secondQuestionHeader).click();
    }
    public void clickThirdQuestionHeader() {
        driver.findElement(thirdQuestionHeader).click();
    }
    public void clickFourthQuestionHeader() {
        driver.findElement(fourthQuestionHeader).click();
    }
    public void clickFifthQuestionHeader() {
        driver.findElement(fifthQuestionHeader).click();
    }
    public void clickSixthQuestionHeader() {
        driver.findElement(sixthQuestionHeader).click();
    }
    public void clickSeventhQuestionHeader() {
        driver.findElement(seventhQuestionHeader).click();
    }
    public void clickEigthQuestionHeader() {
        driver.findElement(eigthQuestionHeader).click();
    }

    public String getFirstAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(firstAnswer));
        return driver.findElement(firstAnswer).getText();
    }
    public String getSecondAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(secondAnswer));
        return driver.findElement(secondAnswer).getText();
    }
    public String getThirdAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(thirdAnswer));
        return driver.findElement(thirdAnswer).getText();
    }
    public String getFourthAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(fourthAnswer));
        return driver.findElement(fourthAnswer).getText();
    }
    public String getFifthAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(fifthAnswer));
        return driver.findElement(fifthAnswer).getText();
    }
    public String getSixthAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(sixthAnswer));
        return driver.findElement(sixthAnswer).getText();
    }
    public String getSeventhAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(seventhAnswer));
        return driver.findElement(seventhAnswer).getText();
    }
    public String getEigthAnswerText() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(eightAnswer));
        return driver.findElement(eightAnswer).getText();
    }

    private By upperOrderButton = By.className("Button_Button__ra12g");
    private By lowerOrderButton = By.xpath("/html/body/div/div/div/div[4]/div[2]/div[@class='Home_FinishButton__1_cWm']/button");

    public void clickUpperOrderButton() {
        driver.findElement(upperOrderButton).click();
    }
    public void scrollToLowerOrderButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(lowerOrderButton));
    }
    public void clickLowerOrderButton() {
        driver.findElement(lowerOrderButton).click();
    }
}