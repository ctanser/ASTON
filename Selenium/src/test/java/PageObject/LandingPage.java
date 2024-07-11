package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static testAston.Driver.driver;

public class LandingPage {

    public LandingPage(){
        PageFactory.initElements(driver, this);
    }

    private String url = "https://mts.by/";

    @FindBy (id = "cookie-agree")
    public WebElement agreeButton;

    @FindBy (xpath = "//iframe[@class='bepaid-iframe']")
    public WebElement frame;

    public void openMTSUrl(){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void clickAgreeButton(){
        agreeButton.click();
    }
    public void switchToFrame(int frame)
    {
        try
        {
            driver.switchTo().frame(frame);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void closeBrowser(){
        driver.quit();
    }

}
