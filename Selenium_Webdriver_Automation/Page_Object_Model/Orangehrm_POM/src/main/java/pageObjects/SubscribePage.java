package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscribePage {
    public SubscribePage (WebDriver driver)
    {
        this.driver=driver;
    }
    private WebDriver driver;

    //using By as a locator to identify the subscribe fields
    private By subscriberName= By.id("subcriber_name");
    private By subscriberEmail= By.id("subcriber_email");
    private By subscribeButton = By.id("btnSubcribe");
    private By DashboardPage= By.linkText("Dashboard");
    private By welcome = By.id("welcome");
    private By logoutButton =By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");


    public void subscriberName (){
        //Find the company logo element verify
        driver.findElement (subscriberName).sendKeys();
    }
    public void setSubscriberEmail (){
        //Find the company logo element verify
        driver.findElement (subscriberEmail).sendKeys();
    }
    public void subcribeButton () {
        driver.findElement(subscribeButton).click();
    }
    public pageObjects.DashboardPage DashboardPage () {
        driver.findElement(DashboardPage).click();
        return new DashboardPage(driver);
    }
    public void setWelcome () {
        driver.findElement(welcome).click();
    }
    public void setLogoutButton () {
        driver.findElement(logoutButton).click();
    }

}
