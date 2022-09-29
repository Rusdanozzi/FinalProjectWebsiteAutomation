package base;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlastFunction {
    public BlastFunction(WebDriver webDriver) {
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[@class='TeamPage_container__2m61r']/div[1]/div[2]")
    private WebElement blastPage;
    @FindBy(xpath = "//div[@class='BottomNavBar_bottomBar__globalActionSection__1JLBX indiana-scroll-container indiana-scroll-container--hide-scrollbars']")
    private WebElement buttonCreateBlast;
    @FindBy(xpath = "//textarea[@placeholder='Type a title...']")
    private WebElement inputTitleBlast;
    @FindBy(xpath = "//div[@class='fr-element fr-view']//p")
    private WebElement inputTextBlast;
    @FindBy(xpath = "//h1[.='Publish']")
    private WebElement buttonPublish;
    @FindBy(xpath = "//button[.='Cancel']")
    private WebElement buttonCancel;
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement buttonSwitchPrivate;
    @FindBy(xpath = "//body/div[@id='root']/div[@class='Main_container__39jS7']/div[@class='Main_mainCol__3MC7n']/div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 Main_container__211E3 css-aoeo82']/div[@class='BlastPage_container__2lwmP']/div[@class='bodyInfinityScroll']/div[@class='infinite-scroll-component__outerdiv']/div[contains(@class,'infinite-scroll-component')]/div[1]/div[2]/div[1]/div[1]")
    private WebElement textTitleAfterBlast;
    @FindBy(id = "notistack-snackbar")
    private WebElement textSuccessCreateBlast;

    public void setBlastPage(){blastPage.click();}
    public void setButtonCreateBlast(){buttonCreateBlast.click();}
    public void setInputTitleBlast(String Title){inputTitleBlast.sendKeys(Title);}
    public void setInputTextBlast(String Text){inputTextBlast.sendKeys(Text);}
    public void setButtonPublish(){buttonPublish.click();}
    public void setButtonCancel(){buttonCancel.click();}
    public void setButtonSwitchPrivate(){buttonSwitchPrivate.click();}
    public void verifySuccessCreateBlast(String Title) throws InterruptedException {

        Assert.assertEquals("Create post successful",textSuccessCreateBlast.getText());
        Thread.sleep(2000);
        Assert.assertEquals(Title,textTitleAfterBlast.getText());
    }
}
