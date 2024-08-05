package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends AbstractPage {

    public static String url = "https://mts.by/";

    @NameOfElement("Принять")
    @FindBy(id = "cookie-agree")
    public SelenideElement agreeButton;

    @FindBy(xpath = "//iframe[@class='bepaid-iframe']")
    public SelenideElement frame;
}