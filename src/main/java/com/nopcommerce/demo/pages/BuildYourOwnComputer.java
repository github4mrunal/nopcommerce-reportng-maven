package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.basepage.BasePage;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputer extends Utility {

    private static final Logger log = LogManager.getLogger(BasePage.class.getName());


    @FindBy(xpath = "//div[@class='overview']/div/child::h1")
    WebElement buildYourPage;
    @FindBy(id = "product_attribute_1")
    WebElement dropDown1;
    @FindBy(id = "product_attribute_2")
    WebElement dropDown2;
    @FindBy(id = "product_attribute_3_7")
    WebElement radioButton1;
    @FindBy(id = "product_attribute_4_9")
    WebElement radioButton2;
    @FindBy(id = "product_attribute_5_12")
    WebElement radioButton3;
    @FindBy(xpath = "//span[text()='$1,475.00']")
    WebElement totalAmt;
    @FindBy(id = "add-to-cart-button-1")
    WebElement clickAddCart;
    @FindBy(xpath = "//p[text()='The product has been added to your ']")
    WebElement topBarMsg;

    public String getBuildYourOwnText() {
        Reporter.log("Build your own Computers" + buildYourPage.toString() + "<br>");
        return getTextFromElement(buildYourPage);
    }

    public void selectProcessorFromDropDownOne(String processor) {
        Reporter.log("Select processor " + dropDown1.toString() + "<br>");
        selectByVisibleTextFromDropDown((WebElement) dropDown1, processor);
        log.info("Select processor from options below: " + dropDown1);

    }

    public void selectRamFromDropDownTwo(String ram) {
        Reporter.log("Select RAM" + dropDown2.toString() + "<br>");
        selectByVisibleTextFromDropDown((WebElement) dropDown2, ram);
        log.info("Select RAM from DropDown" + dropDown2);
    }

    public void clickOnHDDRadioButton() {
        Reporter.log("Select HDD " + radioButton1.toString() + "<br>");
        clickOnElement(radioButton1);
        log.info("Select HDD from DropDown" + radioButton1.toString());
    }

    public void clickOSOnRadioButton() {
        Reporter.log("Select OS " + radioButton2.toString() + "<br>");
        clickOnElement(radioButton2);
        log.info("Selecting OS from DropDown" + radioButton2.toString());
    }

    public void clickOnSoftwareCheckBox() {
        Reporter.log("Select Software " + radioButton3.toString() + "<br>");
        clickOnElement(radioButton3);
        log.info("Selecting  Software from DropDown" + radioButton3.toString());
    }

    public String getTotalAmt() {
        Reporter.log("Total Amount " + totalAmt.toString() + "<br>");
        return getTextFromElement(totalAmt);

    }

    public void clickOnAddToCart() {
        Reporter.log("Click Add to cart" + clickAddCart.toString() + "<br>");
        clickOnElement(clickAddCart);
        log.info("Clicking Add to Cart" + clickAddCart.toString());
    }

    public String getTopBarMessage() {
        Reporter.log("Product added to cart " + topBarMsg.toString() + "<br>");
        return getTextFromElement(topBarMsg);
    }
}



