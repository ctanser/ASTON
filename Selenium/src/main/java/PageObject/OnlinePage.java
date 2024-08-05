package PageObject;

import org.openqa.selenium.support.FindBy;
import com.codeborne.selenide.SelenideElement;

public class OnlinePage extends AbstractPage {

    @NameOfElement("Email")
    @FindBy(id = "connection-email")
    public SelenideElement email;

    @NameOfElement("Phone")
    @FindBy(id = "connection-phone")
    public SelenideElement phone;

    @NameOfElement("Sum")
    @FindBy(id = "connection-sum")
    public SelenideElement sum;

    @NameOfElement("Продолжить")
    @FindBy(xpath = "//button[text()='Продолжить']")
    public SelenideElement nextButton;

}