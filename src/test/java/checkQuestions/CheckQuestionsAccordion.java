package checkQuestions;

import POM.MainPage;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.AssertionError;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.notNullValue;

public class CheckQuestionsAccordion {
    private WebDriver driver;

    @Test
    public void questionOneAccordionShowsText() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainpage = new MainPage(driver);
        mainpage.clickCloseCookieButton();
        mainpage.scrollToFAQ();
        mainpage.clickFirstQuestionHeader();
        String textFirstAnswer = mainpage.getFirstAnswerText();
        String expectedFirstAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        Assert.assertEquals("Текст первого ответа неверен", expectedFirstAnswer, textFirstAnswer);
        driver.quit();
    }

    @Test
    public void questionTwoAccordionShowsText() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainpage = new MainPage(driver);
        mainpage.clickCloseCookieButton();
        mainpage.scrollToFAQ();
        mainpage.clickSecondQuestionHeader();
        String textSecondAnswer = mainpage.getSecondAnswerText();
        String expectedSecondAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        Assert.assertEquals("Текст второго ответа неверен", expectedSecondAnswer, textSecondAnswer);
        driver.quit();
    }

    @Test
    public void questionThreeAccordionShowsText() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainpage = new MainPage(driver);
        mainpage.clickCloseCookieButton();
        mainpage.scrollToFAQ();
        mainpage.clickThirdQuestionHeader();
        String textThirdAnswer = mainpage.getThirdAnswerText();
        String expectedThirdAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        Assert.assertEquals("Текст третьего ответа неверен", expectedThirdAnswer, textThirdAnswer);
        driver.quit();
    }

    @Test
    public void questionFourAccordionShowsText() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainpage = new MainPage(driver);
        mainpage.clickCloseCookieButton();
        mainpage.scrollToFAQ();
        mainpage.clickFourthQuestionHeader();
        String textFourthAnswer = mainpage.getFourthAnswerText();
        String expectedFourthAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        Assert.assertEquals("Текст четветрого ответа неверен", expectedFourthAnswer, textFourthAnswer);
        driver.quit();
    }

    @Test
    public void questionFiveAccordionShowsText() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainpage = new MainPage(driver);
        mainpage.clickCloseCookieButton();
        mainpage.scrollToFAQ();
        mainpage.clickFifthQuestionHeader();
        String textFifthAnswer = mainpage.getFifthAnswerText();
        String expectedFifthAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        Assert.assertEquals("Текст пятого ответа неверен", expectedFifthAnswer, textFifthAnswer);
        driver.quit();
    }

    @Test
    public void questionSixAccordionShowsText() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainpage = new MainPage(driver);
        mainpage.clickCloseCookieButton();
        mainpage.scrollToFAQ();
        mainpage.clickSixthQuestionHeader();
        String textSixthAnswer = mainpage.getSixthAnswerText();
        String expectedSixthAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        Assert.assertEquals("Текст шестого ответа неверен", expectedSixthAnswer, textSixthAnswer);
        driver.quit();
    }

    @Test
    public void questionSevenAccordionShowsText() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainpage = new MainPage(driver);
        mainpage.clickCloseCookieButton();
        mainpage.scrollToFAQ();
        mainpage.clickSeventhQuestionHeader();
        String textSeventhAnswer = mainpage.getSeventhAnswerText();
        String expectedSeventhAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        Assert.assertEquals("Текст седьмого ответа неверен", expectedSeventhAnswer, textSeventhAnswer);
        driver.quit();
    }

    @Test
    public void questionEigthAccordionShowsText() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        MainPage mainpage = new MainPage(driver);
        mainpage.clickCloseCookieButton();
        mainpage.scrollToFAQ();
        mainpage.clickEigthQuestionHeader();
        String textEigthAnswer = mainpage.getEigthAnswerText();
        String expectedEigthAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        Assert.assertEquals("Текст восьмого ответа неверен", expectedEigthAnswer, textEigthAnswer);
        driver.quit();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}