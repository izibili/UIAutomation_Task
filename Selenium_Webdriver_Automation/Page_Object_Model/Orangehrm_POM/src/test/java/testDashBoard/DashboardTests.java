package testDashBoard;




import org.testng.Assert;
import org.testng.annotations.Test;
import testLogin.LoginTests;

public class DashboardTests extends LoginTests{

    @Test
    public void testLeaveRequest () throws InterruptedException {
       String AD = dashboardPage.getLeaveRequest();
        if (AD.equalsIgnoreCase("01.Kevin Mathews 03-08-2020")) {
            System.out.println("Text is present");
        }else{
            System.out.println("Text is absent");
        }
    }

    @Test(priority = 1)

    //This class entends to the SetupTests class contains all the setup requirements to run our test
    public void testLogout () throws InterruptedException {
        //Handler for dashboard page
        dashboardPage.clickWelcome();
        dashboardPage.clickLogout();
        Thread.sleep(100);
        String loginPageURL = "https://opensource-demo.orangehrmlive/";
        Assert.assertEquals(loginPage.getLoginPageURL(), loginPageURL, "You are not on user dashboard");
    }

    @Test(priority = 1)
    public void CheckingLogout () throws InterruptedException
    {
        Thread.sleep(1000);
    }
}


