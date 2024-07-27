package testAston;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class MTS_run {

    @Given("^open mts\\.by$")
    public void openMtsBy()
    {
        open("http://mts.by");
    }
    @And("^press button with text \"([^\"]*)\"$")
    public void press(String button)
    {
        $(byText(button)).click();
    }

    @And("^type to input with id \"([^\"]*)\" text: \"([^\"]*)\"$")
    public void typeToInputWithNameText(String input, String text)
    {
       $(byId(input)).sendKeys(text);
    }

    @Then("Switch To Frame {int}")
    public void switch_to_frame(int frame)  {
        sleep(3000);
        switchTo().frame(frame);
    }

    @And("^check with xpath \"([^\"]*)\" text: \"([^\"]*)\"$\"([^\"]*)\"$")
    public void checkText(String xpath, String text, String text2)
    {
        Assert.assertEquals($(byXpath(xpath)).getText(), text);
    }

    @And("check with xpath {string} text: {string}{string}")
    public void checkWithXpathText(String xpath, String text, String text2) {
        Assert.assertEquals($(byXpath(xpath)).getText(), text+text2);
    }

    @And("check with xpath {string} text: {string}{string}{string}")
    public void checkWithXpathTextSum(String xpath, String text, String text2, String text3) {
    }
}



