package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hook {
    public static WebDriver webDriver;
    @Before
    public static void openBrowser() throws InterruptedException {


        ChromeOptions chrome_options = new ChromeOptions();


        chrome_options.addArguments("--disable-extensions");

        chrome_options.addArguments("--disable-popup-blocking");

        chrome_options.addArguments("--profile-directory=Default");

        chrome_options.addArguments("--ignore-certificate-errors");

        chrome_options.addArguments("--disable-plugins-discovery");

//        chrome_options.addArguments("--incognito");

        chrome_options.addArguments("user_agent=DN");

        chrome_options.addArguments("user-data-dir=C:\\Users\\PC\\AppData\\Local\\Google\\Chrome\\User Data\\");
/*        chrome_options.addArguments("user-data-dir=C:\\Users\\DELL 2021\\AppData\\Local\\Google\\Chrome\\User Data\\");*/

        chrome_options.addArguments("--profile-directory=default");

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");

        webDriver = new ChromeDriver(chrome_options);
        webDriver.manage().window().maximize();
        webDriver.get("https://staging.cicle.app/signin");
        Thread.sleep(5000);
        webDriver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/div[3]/div/div")).click();
        webDriver.findElement(By.xpath("//a[.='QA-14-BP-A24']")).click();
    }

/*    @After
    public static void closeBrowser(){
        webDriver.quit();
    }*/
}
