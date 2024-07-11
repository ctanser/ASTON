package testAston;

import PageObject.IframePage;
import PageObject.LandingPage;
import PageObject.OnlinePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static testAston.Driver.wait;

public class MTS_run {
    LandingPage landingPage;
    OnlinePage onlinePage;
    IframePage iframePage;

    @Given("^Open site$")
    public void open_site() throws Throwable {
        landingPage = new LandingPage();
        landingPage.openMTSUrl();
    }

    @And("Agree cockle")
    public void agree_cockle() {
        landingPage.clickAgreeButton();
    }

    @And("^Enter phone \"([^\"]*)\"$")
    public void enter_phone(String number) throws Throwable {
        onlinePage = new OnlinePage();
        onlinePage.enterPhone(number);
    }

    @And("^Enter summ \"([^\"]*)\"$")
    public void enter_summ(String sum) throws Throwable {
        onlinePage.enterSum(sum);
    }

    @And("^Enter email \"([^\"]*)\"$")
    public void enter_email(String email) throws Throwable {
        onlinePage.enterEmail(email);
    }

    @When("^Click button next$")
    public void click_button_next() throws Throwable {
        onlinePage.clickNextButton();
    }

    @Then("Switch To Frame")
    public void switch_to_frame() {
        wait.until(ExpectedConditions.visibilityOf(landingPage.frame));
        landingPage.switchToFrame(1);
    }

    @And("Check number {string}")
    public void check_number(String number) {
        iframePage = new IframePage();
        Assert.assertEquals(iframePage.numberIframe.getText(), "Оплата: Услуги связи Номер:375" + number);
    }

    @And("Check amount text {string}")
    public void check_amount_text(String sum) {
        Assert.assertEquals(iframePage.sumTextIframe.getText(), sum + " BYN");
    }

    @And("Check amount button {string}")
    public void check_amount_button(String sum) {
        Assert.assertEquals(iframePage.payButtonIframe.getText(), "Оплатить " + sum + " BYN");
    }

}



