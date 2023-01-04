package Reusables;


import org.testng.Assert;

public class VerificationReusables {
    public void verifyPageTitle(String actual, String expected, String failedMessage){
        Assert.assertEquals(actual,expected,failedMessage);
    }

    public void verifyText(String actual, String expected, String failedMessage){
        Assert.assertEquals(actual,expected,failedMessage);
    }
}
