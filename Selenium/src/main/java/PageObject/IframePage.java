package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;


public class IframePage extends AbstractPage {

    @NameOfElement("Number iframe")
    @FindBy(xpath = "//div[@class='pay-description__text']/span")
    public SelenideElement numberIframe;

    @NameOfElement("Sum iframe")
    @FindBy(xpath = "//div[@class='pay-description__cost']/span")
    public SelenideElement sumTextIframe;

    @NameOfElement("Sum button iframe")
    @FindBy(xpath = "//div[@class='card-page__card']/button")
    public SelenideElement payButtonIframe;
}