package stepDef;

import base.NavigationFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class NavigationStep {
    private WebDriver webDriver;

    public NavigationStep() {
        super();
        this.webDriver = Hook.webDriver;
    }

    @Given("user in home page")
    public void userInHomePage() {

    }

    @When("user click option button")
    public void userClickOptionButton() throws InterruptedException {
        Thread.sleep(5000);
        NavigationFunction navigationFunction=new NavigationFunction(webDriver);
        navigationFunction.clickMenuOption();
    }

    @And("user click overview button")
    public void userClickOverviewButton() {
        NavigationFunction navigationFunction=new NavigationFunction(webDriver);
        navigationFunction.clickOverview();
    }
    @Then("home will be showed{string}")
    public void homeWillBeShowed(String Title) throws InterruptedException {
        Thread.sleep(5000);
        NavigationFunction navigationFunction=new NavigationFunction(webDriver);
        navigationFunction.verifyTitle(Title);
    }


    @And("user click blast button")
    public void userClickBlastButton() {
        NavigationFunction navigationFunction=new NavigationFunction(webDriver);
        navigationFunction.clickBlast();
    }

    @And("user click board button")
    public void userClickBoardButton() {
        NavigationFunction navigationFunction=new NavigationFunction(webDriver);
        navigationFunction.clickBoard();
    }

    @And("user click check in button")
    public void userClickCheckInButton() {
        NavigationFunction navigationFunction=new NavigationFunction(webDriver);
        navigationFunction.clickCheckIn();
    }

    @And("user click schedule button")
    public void userClickScheduleButton() {
        NavigationFunction navigationFunction=new NavigationFunction(webDriver);
        navigationFunction.clickSchedule();

    }

    @And("user click group chat button")
    public void userClickGroupChatButton() {
        NavigationFunction navigationFunction=new NavigationFunction(webDriver);
        navigationFunction.clickGroupChat();

    }

    @And("user click doc & file button")
    public void userClickDocFileButton() {
        NavigationFunction navigationFunction=new NavigationFunction(webDriver);
        navigationFunction.clickDocsFiles();
    }
}
