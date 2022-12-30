package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FinishOrderModal {
    private WebDriver driver;
    public FinishOrderModal(WebDriver driver) {
        this.driver=driver;
    }

    private By finishOrderModalHeader = By.xpath("/html/body/div/div/div[2]/div[5]/div[text()='Хотите оформить заказ?']");
    private By confirmButton = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[text()='Да']");
    private By orderConfirmedHeader = By.xpath("/html/body/div/div/div[2]/div[5]/div[text()='Заказ оформлен']");
    private By orderNumber = By.xpath("/html/body/div/div/div[2]/div[5]/div[1]/div[contains(text(),'Номер заказа:')]");
    private By seeOrderStatusButton = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[text()='Посмотреть статус']");

    public void confirmOrder() {
        driver.findElement(confirmButton).click();
    }

    public void checkStatus() {
        driver.findElement(seeOrderStatusButton).click();
    }

    public void waitForOrderFinishModalHeaderAppears() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(finishOrderModalHeader));
    }

    public void waitForOrderConfirmationHeaderAppears() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(orderConfirmedHeader));
    }
}