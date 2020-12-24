package HomePageTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import testSetup.setupTests;

public class LoginTests extends setupTests {
    //My Tests

    @Test (priority = 1)
    public void successfullyLoadURL ()
    {
        loginPage.verifyLogo();
    }

    @Test(priority = 2)
    public void testAPageTitle () throws InterruptedException {

        //Check whether the Page title is correct
        String title = driver.getTitle();
        Assert.assertEquals("title", "title");
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void CheckURL(){
        String URL = driver.getCurrentUrl();
        String search = loginPage.getLoginPageURL();
        if (URL.equalsIgnoreCase(search)){
            System.out.println("This is the correct Load URL");
        }else{
            System.out.println("This is not the right Load page");
        }
    }

    @Test (priority = 4)
    public void Login() throws InterruptedException
    {
        loginPage.account$();
        String username = "gwinose@gmail.com";
        loginPage.enterUsername(username);
        loginPage.enterUserPassword("available1");

        //Handler for DashboardPage
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickWelcomeAdmin();
        if (driver.getCurrentUrl().contains("https://www.konga.com/")) {
            System.out.println("successful Login");

        }else {
            System.out.println("Not successful login");
        }
    }

}
