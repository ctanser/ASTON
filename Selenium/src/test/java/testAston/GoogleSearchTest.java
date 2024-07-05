package testAston;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    @Test
    void test()
    {
        // Создаем экземпляр драйвера
        WebDriver driver = new ChromeDriver();

        // Открываем страницу Google
        driver.get("https://www.google.com");

        // Находим поле ввода поиска по его id и вводим текст Selenium testing
        driver.findElement(By.name("q")).sendKeys("Selenium testing");

        // Нажимаем Enter для выполнения поиска
        driver.findElement(By.name("q")).submit();

        // Ожидаем несколько секунд для загрузки результатов поиска
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Закрываем браузер
        driver.quit();
    }
}
