package com.bank.pages;


import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='openAccount()']")
    WebElement openAccount;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerSearch;//6
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currency;//Pound
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement process;

    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
        log.info("Click on " +openAccount.getText() + "<br>");
    }
    public void selectCustomerSearch(String value)  {

        selectFromDropDown(customerSearch,"6");
        log.info("Select customer " +customerSearch.getText() + "<br>");

    }
    public void selectCurrency(String value){

        selectFromDropDown(currency,"Pound");
        log.info("Select  " +currency.getText() + "<br>");
    }
    public void clickOnProcessButton(){
        log.info("Click on " +process.getText() + "<br>");
        clickOnElement(process);

    }
    public void verifyPopWindowTextAndAccept(String exp){

        alertPopUpWindowAndVerifyText(exp);
    }


}
