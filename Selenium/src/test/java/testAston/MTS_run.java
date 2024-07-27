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

    @Then("Switch To Frame")
    public void switch_to_frame()  {
        sleep(3000);
        switchTo().frame(1);
    }

    @And("^check with xpath \"([^\"]*)\" text: \"([^\"]*)\"$")
    public void checkText(String xpath, String text)
    {
        Assert.assertEquals($(byXpath(xpath)).getText(), text);
    }

}



