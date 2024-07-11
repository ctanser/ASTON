package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testAston.Driver;

public class IframePage extends Driver{
    public IframePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath="//div[@class='pay-description__text']/span")
    public WebElement numberIframe;

    @FindBy (xpath="//div[@class='pay-description__cost']/span")
    public WebElement sumTextIframe;

    @FindBy (xpath="//div[@class='card-page__card']/button")
    public WebElement payButtonIframe;
}
