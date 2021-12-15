package com.bank.pages;


import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerPage.class.getName());
    public CustomerPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement deposit;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amount;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement depositButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement depositSuccessfully;
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    WebElement withDrawl;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement withDrawlAmount;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement withDrawlButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement transactionSuccessful;

public void clickOnDeposit(){
    clickOnElement(deposit);
    log.info("Click on " +deposit.getText() + "<br>");
}
public void enterAmount100(String value){

   sendTextToElement(amount,value);
    log.info("Enter amount " +amount.getText() + "<br>");

}
public void clickOnDepositButtonLast(){
    clickOnElement(depositButton);
    log.info("click on " +depositButton.getText() + "<br>");
}
public void verifyDepositSuccessfully(String exp){
    verifyPage(exp,depositSuccessfully);
    log.info("Message is  " +depositSuccessfully.getText() + "<br>");

    }
    public void clickOnWithDraw(){
    clickOnElement(withDrawl);
        log.info("Click on " +withDrawl.getText() + "<br>");
    }
    public void enterWithDrawlAmount(String value){
    sendTextToElement(withDrawlAmount,"50");
        log.info("Enter amount "+withDrawlAmount.getText() + "<br>");
    }
    public void clickOnWithDrawlButton(){
    clickOnElement(withDrawlButton);
        log.info("Click on " +withDrawlButton.getText() + "<br>");
    }
    public void verifyTransactionSuccessful(String exp){
    verifyPage(exp,transactionSuccessful);
        log.info("Message is " +transactionSuccessful.getText() + "<br>");
    }
}
