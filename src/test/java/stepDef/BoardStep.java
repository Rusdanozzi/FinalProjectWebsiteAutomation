package stepDef;

import base.BoardFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BoardStep {
    private WebDriver webDriver;

    public BoardStep() {
        super();
        this.webDriver=Hook.webDriver;
    }

    @Given("user in board page")
    public void userInBoardPage() throws InterruptedException {
        Thread.sleep(5000);
        BoardFunction boardFunction = new BoardFunction(webDriver);
        boardFunction.clickBoardPage();
        Thread.sleep(5000);
    }
    @When("create new list{string}")
    public void createNewList(String List) {
        BoardFunction boardFunction = new BoardFunction(webDriver);
        boardFunction.clickButtonAddList();
        boardFunction.setInputNewListName(List);
        boardFunction.clickCreateList();
    }
    @Then("new list will show")
    public void newListWillShow() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(webDriver);
        Thread.sleep(1000);
        boardFunction.verifySuccessCreateList();
    }


    @When("create new card{string}")
    public void createNewCard(String Card) {
        BoardFunction boardFunction = new BoardFunction(webDriver);
        boardFunction.clickCreateCard();
        boardFunction.setInputCardTitle(Card);
        boardFunction.clickAddCard();

    }

    @Then("new card will show")
    public void newCardWillShow() throws InterruptedException {
        BoardFunction boardFunction = new BoardFunction(webDriver);
        Thread.sleep(1000);
        boardFunction.verifySuccessCreateCard();
    }

    @When("move card to other list")
    public void moveCardToOtherList() throws InterruptedException {

    }

    @Then("card move success")
    public void cardMoveSuccess() {


    }
}
