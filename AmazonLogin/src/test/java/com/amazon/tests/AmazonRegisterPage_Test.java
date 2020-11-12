package com.amazon.tests;

import com.amazon.pages.AmazonRegisterPage;
import com.amazon.utilities.ConfigReader;
import com.amazon.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonRegisterPage_Test {
    AmazonRegisterPage amazonregisterPage = new AmazonRegisterPage();

    @Test(priority = 0)
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        Actions actions = new  Actions(Driver.getDriver());
        actions.moveToElement(amazonregisterPage.navLinkAccountList).build().perform();
        amazonregisterPage.startherelink.click();

        Assert.assertEquals(Driver.getDriver().getTitle(),"Amazon Registration");
    }

    @Test(priority = 1)
    public void resgistrationsPage(){
        amazonregisterPage.nameBox.sendKeys(ConfigReader.getProperty("name"));
        amazonregisterPage.emailBox.sendKeys(ConfigReader.getProperty("email"));
        amazonregisterPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
        amazonregisterPage.passwordCheck.sendKeys(ConfigReader.getProperty("password"));
        amazonregisterPage.createButton.click();

        Assert.assertEquals(Driver.getDriver().getTitle(), "Authentication required");


    }

}
