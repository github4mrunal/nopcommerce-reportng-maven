package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopPage extends Utility {


    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());


    @FindBy(xpath = "//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']")
    WebElement clickOnDeskTop;

    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement selectAtoZ;

    @FindBy(xpath = "//div[@class='add-info']/child::div[1]/child::" +
            "span[text()='$1,200.00']/following::div[1]/child::button[text()='Add to cart']")
    WebElement addToCart;


    public void clickonDesktop() {
        Reporter.log("Clicking on Desktop " + clickOnDeskTop.toString() + "<br>");
        clickOnElement(clickOnDeskTop);
        log.info("Clicking on DeskTop " + clickOnDeskTop.toString());

    }

    public void selectValueFromDropdown(String sortBy) {
        Reporter.log("Select from Dropdown " + selectAtoZ.toString() + "<br>");
        selectByVisibleTextFromDropDown(selectAtoZ, sortBy);
        log.info("Selecting A to Z from dropDown" + selectAtoZ.toString());
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Clicking on Add to Cart" + addToCart.toString() + "<br>");
        clickOnElement(addToCart);
        log.info("Clicking on Add To Cart" + addToCart.toString());
    }

    ////ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops '] xpath axes for desktop
    ////div[@class='add-info']/child::div[1]/child::span[text()='$1,200.00']/following::div[1]/child::button[text()='Add to cart']
}
