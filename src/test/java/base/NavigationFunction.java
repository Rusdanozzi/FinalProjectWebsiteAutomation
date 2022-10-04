package base;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationFunction {
    public NavigationFunction(WebDriver webDriver) {
        PageFactory.initElements(webDriver,this);}

    @FindBy(css = ".BottomNavBar_bottomBar__leftSection__TSccS > div:nth-of-type(1)")
    private WebElement buttonMenuOption;
    @FindBy(xpath = "//a[.='Overview']")
    private WebElement buttonOverview;
    @FindBy(xpath = "//a[.='Blast']")
    private WebElement buttonBlast;
    @FindBy(xpath = "//a[.='Board']")
    private WebElement buttonBoard;
    @FindBy(xpath = "//a[.='Check In']")
    private WebElement buttonCheckIn;
    @FindBy(xpath = "//a[.='Schedule']")
    private WebElement buttonSchedule;
    @FindBy(xpath = "//a[.='Group Chat']")
    private WebElement buttonGroupChat;
    @FindBy(xpath = "//a[.='Docs & Files']")
    private WebElement buttonDocsFiles;

    @FindBy(css = ".GeneralSubNavBar_title__text__3UFWr > h1")
    private WebElement textSubNavigationBar;

    public void clickMenuOption(){buttonMenuOption.click();}
    public void clickOverview(){buttonOverview.click();}
    public void clickBlast(){buttonBlast.click();}
    public void clickBoard(){buttonBoard.click();}
    public void clickCheckIn(){buttonCheckIn.click();}
    public void clickSchedule(){buttonSchedule.click();}
    public void clickGroupChat(){buttonGroupChat.click();}
    public void clickDocsFiles(){buttonDocsFiles.click();}
    public void verifyTitle(String Title){
        Assert.assertEquals(Title,textSubNavigationBar.getText());
    }


}
