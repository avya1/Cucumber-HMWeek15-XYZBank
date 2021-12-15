package com.bank.pages;


import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLogInPage extends Utility {
    private static final Logger log = LogManager.getLogger(BankManagerLogInPage.class.getName());
    public BankManagerLogInPage(){
        PageFactory.initElements(driver,this);
    }
    By addCustomer=By.xpath("//button[@ng-class='btnClass1']");
    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomer);


    }

}
