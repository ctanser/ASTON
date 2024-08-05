package testAston;

import PageObject.IframePage;
import PageObject.LandingPage;
import PageObject.OnlinePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.*;

public class MTS_run {

    LandingPage landingPage = page(LandingPage.class);
    OnlinePage onlinePage = page(OnlinePage.class);
    IframePage iframePage = page(IframePage.class);

    @Given("^open mts\\.by$")
    public void openMtsBy() {
        open(LandingPage.url);
    }

    @And("^press button \"([^\"]*)\" on \"([^\"]*)\"$")
    public void press(String button, String page) {
        if ("Первая страница".equals(page)) landingPage.get(button).click();
        else if ("Вторая страница".equals(page)) onlinePage.get(button).click();

    }

    @And("^type to input \"([^\"]*)\" text: \"([^\"]*)\"$")
    public void typeToInputText(String nameOfElement, String text) {
        onlinePage.get(nameOfElement).sendKeys(text);
    }

    @Then("Switch To Frame {int}")
    public void switch_to_frame(int frame) {
        sleep(3000);
        switchTo().frame(frame);
    }

    @And("check {string} text: {string}{string}")
    public void checkWithXpathText(String nameOfElement, String text, String text2) {

        Assert.assertEquals(iframePage.get(nameOfElement).getText(), text + text2);
    }

    @And("check {string} text: {string}{string}{string}")
    public void checkWithXpathTextSum(String nameOfElement, String text, String text2, String text3) {
        Assert.assertEquals(iframePage.get(nameOfElement).getText(), text + text2 + text3);
    }
}



