package com.bank.pages;


import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());
    public CustomerLoginPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//span[text()='james ore']")
    WebElement logOut;



public void searchCustomerFromDropDown(String value) throws InterruptedException {
    selectFromDropDown(searchCustomer,"6");
    Thread.sleep(3000);

}
public void clickOnLoginButton(){
    log.info("Click on " +loginButton.getText() + "<br>");
    clickOnElement(loginButton);

}
public void verifyLogOutTabAndClickOnLogOutTab(){
    Boolean isDisplay=driver.findElement(By.xpath("//button[@class='btn logout']")).isDisplayed();
    if(isDisplay){
        String exp="james ore";
        verifyPage(exp,logOut);
    }
    else{
        System.out.println("logOut tab is not display");
    }



}
}
