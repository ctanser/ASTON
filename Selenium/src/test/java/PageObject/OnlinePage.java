package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testAston.Driver;


public class OnlinePage extends Driver {

    public OnlinePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@class='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@class='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@class='total_rub']")
    public WebElement sum;

    @FindBy(xpath = "//button[text()='Продолжить']")
    public WebElement nextButton;

    public void enterEmail(String argEmail) {
        email.sendKeys(argEmail);
    }

    public void enterPhone(String argPhone) {
        phone.sendKeys(argPhone);
    }

    public void enterSum(String argSum) {
        sum.sendKeys(argSum);
    }

    public void clickNextButton() {
        nextButton.click();
    }

}
