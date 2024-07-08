package testAston;

import graphql.Assert;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


public class Test_Mts {

    private String summ = "300.00";
    private String phone = "297777777";

    @org.junit.jupiter.api.Test
    @DisplayName("МТС")
    void test() throws IOException {

        // Создаем экземпляр драйвера
        WebDriver driver = new ChromeDriver();

        // Открываем страницу
        driver.get("https://mts.by");

        //принимаем куки
        driver.findElement(By.id("cookie-agree")).click();

        //проверяем наличие элементов
        Assert.assertTrue(driver.findElement(By.xpath("/html[@class='bx-core bx-win bx-no-touch bx-no-retina bx-chrome ya-page_js_yes websockets audio cssgradients contenteditable']/body/div[@class='layout layout--default']/main[@class='main']/div[@class='wrapper']/div[@class='homepage']/div[@id='pay-section']/div[@class='container-fluid']/div[@class='row']/div[@class='col-12 col-xl-8']/section[@class='pay']/div[@class='pay__wrapper']/h2")).getText().equals("Онлайн пополнение\nбез комиссии"));
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='select__now']")).getText().equals("Услуги связи"));
        Assert.assertTrue(driver.findElement(By.xpath("//input[@class='phone']")).getAttribute("placeholder").equals("Номер телефона"));
        Assert.assertTrue(driver.findElement(By.xpath("//input[@class='total_rub']")).getAttribute("placeholder").equals("Сумма"));
        Assert.assertTrue(driver.findElement(By.xpath("//input[@class='email']")).getAttribute("placeholder").equals("E-mail для отправки чека"));

        //тест выпадающего меню
        String[] expectedTexts = {"Услуги связи", "Домашний интернет", "Рассрочка", "Задолженность"};
        List<WebElement> pElements = driver.findElements(By.xpath("//p[@class='select__option']"));

        for (int i = 0; i < pElements.size(); i++) {
            Assert.assertTrue(expectedTexts[i].equals(getInnerText(driver, pElements.get(i))));
        }

        // Проверка ссылки
        WebElement link = driver.findElement(By.linkText("Подробнее о сервисе"));
        String url = link.getAttribute("href");
        URL link1 = new URL(url);
        HttpURLConnection httpConn = (HttpURLConnection) link1.openConnection();
        httpConn.connect();
        int code = httpConn.getResponseCode();
        Assert.assertTrue(code <= 400);

        //картинки
        WebElement visa_img = driver.findElement(By.xpath("//img[@alt='Visa']"));
        Assert.assertTrue(visa_img.isDisplayed());
        WebElement vbv_img = driver.findElement(By.xpath("//img[@alt='Verified By Visa']"));
        Assert.assertTrue(vbv_img.isDisplayed());
        WebElement masterCard_img = driver.findElement(By.xpath("//img[@alt='MasterCard']"));
        Assert.assertTrue(masterCard_img.isDisplayed());
        WebElement mcsc_img = driver.findElement(By.xpath("//img[@alt='MasterCard Secure Code']"));
        Assert.assertTrue(mcsc_img.isDisplayed());
        WebElement bel_img = driver.findElement(By.xpath("//img[@alt='Белкарт']"));
        Assert.assertTrue(bel_img.isDisplayed());

        //заполнение данными
        driver.findElement(By.id("connection-phone")).sendKeys(phone);
        driver.findElement(By.id("connection-sum")).sendKeys(summ);
        driver.findElement(By.id("connection-email")).sendKeys("a@a.ru");
        driver.findElement(By.xpath("//button[text()='Продолжить']")).click();

        // Ожидаем несколько секунд
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //фрейм
        driver.switchTo().frame(1);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='pay-description__cost']/span")).getText().equals(summ + " BYN"));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='card-page__card']/button")).getText().equals("Оплатить " + summ + " BYN"));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='pay-description__text']/span")).getText().equals("Оплата: Услуги связи Номер:375" + phone));
        Assert.assertTrue(driver.findElement(By.xpath("//label[@class='ng-tns-c46-1 ng-star-inserted']")).getText().equals("Номер карты"));
        Assert.assertTrue(driver.findElement(By.xpath("//label[@class='ng-tns-c46-4 ng-star-inserted']")).getText().equals("Срок действия"));
        Assert.assertTrue(driver.findElement(By.xpath("//label[@class='ng-tns-c46-5 ng-star-inserted']")).getText().equals("CVC"));
        Assert.assertTrue(driver.findElement(By.xpath("//label[@class='ng-tns-c46-3 ng-star-inserted']")).getText().equals("Имя держателя (как на карте)"));

        //картинки в поле номер карты
        WebElement masterCard_img_numbercard = driver.findElement(By.xpath("//img[@class='ng-tns-c61-0 ng-star-inserted'][1]"));
        Assert.assertTrue(masterCard_img_numbercard.isDisplayed());
        WebElement vbv_img_numbercard = driver.findElement(By.xpath("//img[@class='ng-tns-c61-0 ng-star-inserted'][2]"));
        Assert.assertTrue(vbv_img_numbercard.isDisplayed());
        WebElement visa_img_numbercard = driver.findElement(By.xpath("//img[@class='ng-tns-c61-0 ng-star-inserted'][3]"));
        Assert.assertTrue(visa_img_numbercard.isDisplayed());
        WebElement mir_img_numbercard = driver.findElement(By.xpath("//img[@class='ng-tns-c61-0 ng-trigger ng-trigger-randomCardState ng-star-inserted'][1]"));
        Assert.assertTrue(mir_img_numbercard.isDisplayed());

        // Закрываем браузер
        driver.quit();
    }

    //метод для вытаскивания innerText
    public static String getInnerText(WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        return (String) executor.executeScript("return arguments[0].innerText", element);
    }
}

