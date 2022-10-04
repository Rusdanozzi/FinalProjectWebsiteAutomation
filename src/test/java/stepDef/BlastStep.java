package stepDef;

import base.BlastFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class BlastStep {

    private WebDriver webDriver;
    public BlastStep() {
        super();
        this.webDriver=Hook.webDriver;
    }

    @Given("user in blast page")
    public void userInBlastPage() throws InterruptedException {
        Thread.sleep(3000);
        BlastFunction blastFunction=new BlastFunction(webDriver);
        blastFunction.setBlastPage();
        Thread.sleep(3000);
    }

    @When("create new blast message")
    public void createNewBlastMessage() throws InterruptedException {
        BlastFunction blastFunction=new BlastFunction(webDriver);
        blastFunction.setButtonCreateBlast();
        Thread.sleep(3000);
    }

    @And("input title{string}")
    public void inputTitle(String Title) {
        BlastFunction blastFunction=new BlastFunction(webDriver);
        blastFunction.setInputTitleBlast(Title);
    }

    @And("input body{string}")
    public void inputBody(String Text) throws InterruptedException {
        BlastFunction blastFunction=new BlastFunction(webDriver);
        blastFunction.setInputTextBlast(Text);
        blastFunction.setButtonPublish();
        Thread.sleep(2000);
    }

    @Then("new blast message will show{string}")
    public void newBlastMessageWillShow(String Title) throws InterruptedException {
        BlastFunction blastFunction=new BlastFunction(webDriver);
        blastFunction.verifySuccessCreateBlast(Title);
    }

    @And("input body set private{string}")
    public void inputBodySetPrivate(String Text) throws InterruptedException {
        BlastFunction blastFunction=new BlastFunction(webDriver);
        blastFunction.setInputTextBlast(Text);
        blastFunction.setButtonSwitchPrivate();
        blastFunction.setButtonPublish();
        Thread.sleep(2000);
    }

    @And("user cancel create blast")
    public void userCancelCreateBlast() {
        BlastFunction blastFunction=new BlastFunction(webDriver);
        blastFunction.setButtonCancel();
    }

    @Then("user direct to blast page")
    public void userDirectToBlastPage() throws InterruptedException {
        BlastFunction blastFunction=new BlastFunction(webDriver);
        Thread.sleep(5000);
        blastFunction.verifyBlastPage();
    }
}
