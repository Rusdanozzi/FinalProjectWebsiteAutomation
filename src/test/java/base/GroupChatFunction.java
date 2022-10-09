package base;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static stepDef.Hook.webDriver;

public class GroupChatFunction {
    public GroupChatFunction(WebDriver webDriver) {
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[@class='TeamPage_container__2m61r']/div[1]/div[1]/a[1]/div[1]")
    private WebElement groupChatPage;
    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement inputChat;
    @FindBy(xpath = "//div[@class='CreateMessage_send__2f1ZQ']")
    private WebElement buttonSend;
    @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[1]//div[@class='Message_content__21YIN']")
    private WebElement textChat;
    //DIV selisih 2//
    @FindBy(xpath = "//div[@class='infinite-scroll-component ']//div[1]//div[@class='Message_balloonMessage__3dmkS']")
    private WebElement messageHover;
    @FindBy(xpath = "//body/div[@id='root']/div[@class='GroupChatPage_container__2cpwQ']/" +
            "div[@class='MainGroupChatSection_container__3-P_S']/div[@class='MainGroupChatSection_dropzone__1nSfG']/" +
            "div[@class='MainGroupChatSection_box__1a2DO']/div[@class='MainGroupChatSection_messages__1wQ0n']/" +
            "div[@class='OverlayButton_container__3kxDV']/div[@class='OverlayButton_box__2jFLd']/" +
            "div[@id='list-groupChat-messages-section']/div[@class='infinite-scroll-component__outerdiv']/" +
            "div[contains(@class,'infinite-scroll-component')]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]")
    private WebElement messageOption;
    @FindBy(css = ".MessageMenuPopUp_bodySection__BxPUp")
    private WebElement messageDelete;
    @FindBy(xpath = "//div[@class='modal-footer']//button[@type='button']")
    private WebElement buttonConfirmDelete;
    @FindBy(xpath = "//input[@type='file']")
    private WebElement buttonAttach;
    @FindBy(xpath = "//p[.='Nickel.png']")
    private WebElement textNickel;

    public void clickGroupChat(){groupChatPage.click();}
    public void setInputChat(String Chat){inputChat.sendKeys(Chat);}
    public void clickSend(){buttonSend.click();}
    public void verifyTextChat(String Chat){
        Assert.assertEquals(Chat,textChat.getText());
    }
    public void deleteMessage() throws InterruptedException {
        Actions action=new Actions(webDriver);
        action.moveToElement(messageHover).perform();
        messageOption.click();
        messageDelete.click();
        buttonConfirmDelete.click();}
    public void attachFile(){
        buttonAttach.sendKeys("C:\\Nickel.png");}
    public void verifyFileUploaded(){
        Assert.assertEquals("Nickel.png",textNickel.getText());
    }
    public void verifyNothingHappened(){
        Assert.assertNotEquals("",textChat);
    }
}
