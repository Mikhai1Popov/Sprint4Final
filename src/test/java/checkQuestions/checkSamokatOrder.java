package checkQuestions;

import POM.FinishOrderModal;
import POM.MainPage;
import POM.OrderPage;
import POM.StatusPage;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.AssertionError;
import java.time.Duration;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.notNullValue;

@RunWith(Parameterized.class)
public class checkSamokatOrder {
    private final String name;
    private final String lastName;
    private final String adress;
    private final String phone;
    private final String comment;

    public checkSamokatOrder(String name, String lastName, String adress, String phone, String comment) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.phone = phone;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getFieldsData() {
        return new Object[][] {
                { "Вася", "Васин", "Ленина", "89998887766", "Абырвалг"},
                { "Коля", "Колин", "Малышева", "89998887755", "Йохохо"},
        };
    }


    public WebDriver driver;

    @Test
    public void checkOrderFlowUpperButton() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainpage = new MainPage(driver);
        mainpage.clickCloseCookieButton();
        mainpage.clickUpperOrderButton();
        OrderPage orderpage = new OrderPage(driver);
        orderpage.fillOrderPage(name, lastName, adress, phone);
        orderpage.waitForOrderSecondPageAppears();
        orderpage.fillOrderSecondPage(comment);
        FinishOrderModal finishmodal = new FinishOrderModal(driver);
        finishmodal.waitForOrderFinishModalHeaderAppears();
        finishmodal.confirmOrder();
        finishmodal.waitForOrderConfirmationHeaderAppears();
        finishmodal.checkStatus();
        StatusPage status = new StatusPage(driver);
        Assert.assertEquals("Заказ не создан",true, status.checkStatusIsDisplayed());
    }

    @Test
    public void checkOrderFlowLowerButton() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainpage = new MainPage(driver);
        mainpage.clickCloseCookieButton();
        mainpage.scrollToLowerOrderButton();
        mainpage.clickLowerOrderButton();
        OrderPage orderpage = new OrderPage(driver);
        orderpage.fillOrderPage(name, lastName, adress, phone);
        orderpage.waitForOrderSecondPageAppears();
        orderpage.fillOrderSecondPage(comment);
        FinishOrderModal finishmodal = new FinishOrderModal(driver);
        finishmodal.waitForOrderFinishModalHeaderAppears();
        finishmodal.confirmOrder();
        finishmodal.waitForOrderConfirmationHeaderAppears();
        finishmodal.checkStatus();
        StatusPage status = new StatusPage(driver);
        Assert.assertEquals("Заказ не создан",true, status.checkStatusIsDisplayed());
    }
}