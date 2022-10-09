package stepDef;

import base.GroupChatFunction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class GroupChatStep {
    private WebDriver webDriver;
    public GroupChatStep() {
        super();
        this.webDriver=Hook.webDriver;
    }
    @Given("user in chat page")
    public void userInChatPage() throws InterruptedException {
        Thread.sleep(3000);
    GroupChatFunction groupChatFunction=new GroupChatFunction(webDriver);
    groupChatFunction.clickGroupChat();
    Thread.sleep(5000);
    }

    @When("send chat message{string}")
    public void sendChatMessage(String Chat) {
        GroupChatFunction groupChatFunction=new GroupChatFunction(webDriver);
        groupChatFunction.setInputChat(Chat);
        groupChatFunction.clickSend();

    }

    @Then("chat message will be sended")
    public void chatMessageWillBeSended() throws InterruptedException {

    }


    @Then("chat message will show{string}")
    public void chatMessageWillShow(String Chat) throws InterruptedException {
        GroupChatFunction groupChatFunction=new GroupChatFunction(webDriver);
        Thread.sleep(5000);
        groupChatFunction.verifyTextChat(Chat);
    }

    @And("user delete chat")
    public void userDeleteChat() throws InterruptedException {
        Thread.sleep(3000);
        GroupChatFunction groupChatFunction=new GroupChatFunction(webDriver);
        groupChatFunction.deleteMessage();
    }

    @When("user attach file")
    public void userAttachFile() {
        GroupChatFunction groupChatFunction=new GroupChatFunction(webDriver);
        groupChatFunction.attachFile();
    }

    @Then("chat will not send")
    public void chatWillNotSend() {
        GroupChatFunction groupChatFunction=new GroupChatFunction(webDriver);
        groupChatFunction.verifyNothingHappened();
    }

    @Then("user success send file")
    public void userSuccessSendFile() {
        GroupChatFunction groupChatFunction=new GroupChatFunction(webDriver);
        groupChatFunction.verifyFileUploaded();
    }
}
