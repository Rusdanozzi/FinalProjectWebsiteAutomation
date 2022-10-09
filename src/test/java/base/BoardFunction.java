package base;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static stepDef.Hook.webDriver;

public class BoardFunction {
    public BoardFunction(WebDriver webDriver) {
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[@class='TeamPage_container__2m61r']/div[2]/div[1]/a[1]/div[1]")
    private WebElement boardPage;
    @FindBy(xpath = "//a[contains(text(),'Add List')]")
    private WebElement buttonAddList;
    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement inputNewListName;
    @FindBy(xpath = "//div[@class='CreateListButton_actionSection__1BBgC']//div//button[@type='button']")
    private WebElement buttonCreatelist;
    @FindBy(xpath = "//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium CreateListButton_icon__12EJS css-vubbuv']")
    private WebElement buttonCancelCreatelist;
    @FindBy(xpath = "//body/div[@id='root']/div[@class='BoardPage_container__3oHah']" +
            "/div[@class='BoardPage_mainSection__1pqSc']/div/div[@class='ListContainer_ListContainer__outerList__1PG0-']" +
            "/div[7]/div[1]/div[1]/div[1]/div[1]")
    private WebElement textTitleList;
    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessCreateList;
    @FindBy(xpath = "//body/div[@id='root']/div[@class='BoardPage_container__3oHah']/div" +
            "[@class='BoardPage_mainSection__1pqSc']/div/div[@class='ListContainer_ListContainer__outerList__1PG0-']" +
            "/div[4]/div[1]/div[1]/div[last()]")
    private WebElement buttonCreateCard;
    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessCreateCard;
    @FindBy(css = "[placeholder='Card name']")
    private WebElement inputCardTitle;
    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement buttonAddCard;
    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']" +
            "/div[1]//div[@class='ListCard_ListDroppable__1sdGc']/" +
            "div[1]//div[@id='editCardMenu']")
    private WebElement cardList1;
    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']" +
            "/div[4]//div[@class='ListCard_ListDroppable__1sdGc']" +
            "/div[1]//div[@id='editCardMenu']")
    private WebElement cardList2;
    @FindBy(xpath = "//div[.='Quick Comment']")
    private WebElement buttonQuickComment;
    @FindBy(css = "[placeholder='Add new comment...']")
    private WebElement buttonComment;
    @FindBy(xpath = "//div[@class='fr-element fr-view']//p")
    private WebElement inputComment;
    @FindBy(xpath = "//button[.='Post']")
    private WebElement buttonPostComment;
    @FindBy(xpath = "//div[@class='infinite-scroll-component ']//div[4]//div[@class='fr-view']")
    private WebElement textComment;

    @FindBy(xpath = "//div[.='Move Card']")
    private WebElement buttonMoveCard;
    @FindBy(css = ".ManageMoveCard_listSection__listName__TN7R2")
    private WebElement listTask;
    @FindBy(xpath = "//div[@class='ListNameOption_mainSection__3QQi6']//div[.='To Do']")
    private WebElement selectToDo;
    @FindBy(css = ".btn-success")
    private WebElement buttonMove;



    public void clickBoardPage(){boardPage.click();}
    public void clickButtonAddList(){buttonAddList.click();}
    public void setInputNewListName(String List){inputNewListName.sendKeys(List);}
    public void clickCreateList(){buttonCreatelist.click();}
    public void clickCancelList(){buttonCancelCreatelist.click();}
    public void getTextTitle(){
        System.out.println(textTitleList.getText());
    }
    public void verifySuccessCreateList(){
        Assert.assertEquals("Creating list is success",textSuccessCreateList.getText());}

    public void clickCreateCard(){buttonCreateCard.click();}
    public void setInputCardTitle(String Card){inputCardTitle.sendKeys(Card);}
    public void clickAddCard(){buttonAddCard.click();}
    public void verifySuccessCreateCard(){
        Assert.assertEquals("Creating card is success",textSuccessCreateCard.getText());}

    public void moveCard() throws InterruptedException {
        cardList2.click();
        Thread.sleep(5000);
        buttonMoveCard.click();
        listTask.click();
        Thread.sleep(5000);
        selectToDo.click();
        buttonMove.click();
    }
    public void clickCardList1(){cardList1.click();}
    public void setInputComment(String comment) throws InterruptedException {
        Thread.sleep(3000);
        buttonQuickComment.click();
        Thread.sleep(3000);
        buttonComment.click();
        Thread.sleep(3000);
        inputComment.sendKeys(comment);
        buttonPostComment.click();
        Thread.sleep(3000);
    }
    public void verifyComment(String comment){
        Assert.assertEquals(comment,textComment.getText());
    }

}
