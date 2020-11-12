package com.amazon.pages;

import com.amazon.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonRegisterPage {
  public AmazonRegisterPage(){
      PageFactory.initElements(Driver.getDriver(),this);
  }

    @FindBy(id = "nav-link-accountList")
    public WebElement navLinkAccountList;

    @FindBy(linkText = "Start here.")
    public WebElement startherelink;

    @FindBy(id = "ap_customer_name")
    public WebElement nameBox;

    @FindBy(id = "ap_email")
    public WebElement emailBox;

    @FindBy(id = "ap_password")
    public WebElement passwordBox;

    @FindBy(id = "ap_password_check")
    public WebElement passwordCheck;

    @FindBy(id = "continue")
    public WebElement createButton;


}
