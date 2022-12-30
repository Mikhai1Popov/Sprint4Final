package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderPage {
    private WebDriver driver;
    public OrderPage(WebDriver driver) {
        this.driver=driver;
    }

    private By orderPageHeader = By.className("Order_Header__BZXOb");
    private By nameInput = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/input");
    private By lastNameInput = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/input");
    private By adressInput = By.xpath("/html/body/div/div/div[2]/div[2]/div[3]/input");
    private By metroDropDown = By.xpath("/html/body/div/div/div[2]/div[2]/div[4]/div/div/input");
    private By phoneInput = By.xpath("/html/body/div/div/div[2]/div[2]/div[5]/input");
    private By proceedButton = By.xpath("//button[text()='Далее']");

    public void inputName(String name) {
        driver.findElement(nameInput).clear();
        driver.findElement(nameInput).sendKeys(name);
    }
    public void inputLastName(String lastName) {
        driver.findElement(lastNameInput).clear();
        driver.findElement(lastNameInput).sendKeys(lastName);
    }
    public void inputAdress(String adress) {
        driver.findElement(adressInput).clear();
        driver.findElement(adressInput).sendKeys(adress);
    }
    public void chooseMetro() {
        driver.findElement(metroDropDown).clear();
        driver.findElement(metroDropDown).sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
    }
    public void inputPhone(String phone) {
        driver.findElement(phoneInput).clear();
        driver.findElement(phoneInput).sendKeys(phone);
    }

    public void fillOrderPage(String name, String lastName, String adress, String phone) {
        inputName(name);
        inputLastName(lastName);
        inputAdress(adress);
        chooseMetro();
        inputPhone(phone);
        driver.findElement(proceedButton).click();
    }

    private By orderSecondPageHeader = By.xpath("//div[text()='Про аренду']");
    private By deliveryTime = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/div/div/input");
    private By timeDate = By.xpath(".//div[@aria-label = 'Choose воскресенье, 1-е января 2023 г.']");
    private By rentTerm = By.xpath("//div[@class='Dropdown-root']/div");
    private By termOption =By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[2]/div[text()='трое суток']");
    private By color = By.id("grey");
    private By commentForCourier =By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private By orderButton = By.xpath(".//div[@class = 'Order_Buttons__1xGrp']/button[text()='Заказать']");

    public void waitForOrderSecondPageAppears() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(orderSecondPageHeader));
    }

    public void setDeliveryTime() {
        driver.findElement(deliveryTime).clear();
        driver.findElement(deliveryTime).click();
        new WebDriverWait(driver, Duration.ofSeconds(1)).until(ExpectedConditions.visibilityOfElementLocated(timeDate));
        driver.findElement(timeDate).click();
    }

    public void setRentTerm() {
        driver.findElement(rentTerm).click();
        driver.findElement(termOption).click();
    }

    public void setColor() {
        driver.findElement(color).click();
    }

    public void setCommentForCourier(String comment) {
        driver.findElement(commentForCourier).clear();
        driver.findElement(commentForCourier).sendKeys(comment);
    }

    public void fillOrderSecondPage(String comment) {
        setDeliveryTime();
        setRentTerm();
        setColor();
        setCommentForCourier(comment);
        driver.findElement(orderButton).click();
    }
}