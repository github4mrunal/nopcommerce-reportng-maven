package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class DesktopPage extends Utility {

    By clickonDesktop = By.xpath("//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']");//desktop
    By selectAToZ = By.xpath("//select[@id='products-orderby']");
    By addTocart = By.xpath("//div[@class='add-info']/child::div[1]/child::" +
            "span[text()='$1,200.00']/following::div[1]/child::button[text()='Add to cart']");

    public void ClickonDesktop() throws InterruptedException {
        Reporter.log("Clicking on Desktop " + clickonDesktop.toString() + "<br>");
        Thread.sleep(3000);
        clickOnElement(clickonDesktop);

    }

    public void selectFromDropdown(String sortBy) throws InterruptedException {
        Reporter.log("Select from Dropdown " + selectAToZ.toString() + "<br>");
        Thread.sleep(3000);
        selectByVisibleTextFromDropDown( selectAToZ, sortBy);
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(3000);
        Reporter.log("Clicking on Add to Cart" + addTocart.toString() + "<br>");
        clickOnElement(addTocart);
    }

    ////ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops '] xpath axes for desktop
    ////div[@class='add-info']/child::div[1]/child::span[text()='$1,200.00']/following::div[1]/child::button[text()='Add to cart']
}
