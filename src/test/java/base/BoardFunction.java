package base;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

import static com.oracle.jrockit.jfr.Transition.From;
import static com.oracle.jrockit.jfr.Transition.To;

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
    @FindBy(xpath = "//body/div[@id='root']/div[@class='BoardPage_container__3oHah']/div[@class='BoardPage_mainSection__1pqSc']" +
            "/div/div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[8]/div[1]/div[1]/div[last()]")
    private WebElement buttonCreateCard;
    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessCreateCard;
    @FindBy(css = "[placeholder='Card name']")
    private WebElement inputCardTitle;
    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement buttonAddCard;
    @FindBy(xpath = "//div[8]//div[@class='SmallCard_SmallCard__xuek9']")
    private WebElement dragCardFrom;
    @FindBy(xpath = "//div[9]//div[@class='SmallCard_SmallCard__xuek9']")
    private WebElement dropCardTo;


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

    public void moveCard(){


    }

}
