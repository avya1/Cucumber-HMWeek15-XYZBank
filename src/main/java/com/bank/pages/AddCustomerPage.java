package com.bank.pages;


import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());
    public AddCustomerPage()
    {
        PageFactory.initElements(driver,this);}
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement addCustomerButton;

    public void fillFirstName(String FName){
        sendTextToElement(firstName,FName);
        log.info("Enter name " +firstName.getText() + "<br>");
    }
    public void fillLastName(String LName){
        sendTextToElement(lastName,LName);
        log.info("Enter last name " +lastName.getText() + "<br>");
    }
    public void fillPostCode(String PCode){
        sendTextToElement(postCode,PCode);
        log.info("Enter  " +postCode.getText() + "<br>");

    }
    public void clickOnAddCustomerButton(){
        log.info("Click on " +addCustomerButton.getText() + "<br>");
        clickOnElement(addCustomerButton);

    }
    public void verifyMessageAndAcceptIt(String exp){
        alertPopUpWindowAndVerifyText(exp);
    }

}
