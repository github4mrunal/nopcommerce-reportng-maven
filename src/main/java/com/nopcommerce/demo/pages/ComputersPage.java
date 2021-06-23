package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputersPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputersPage.class.getName());

    Homepage homepage = new Homepage();


    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement clickOnDesktop;

    @FindBy(xpath = "//div[@class='item-grid']/div/div/div[2]/child::h2")
    WebElement deskTop;

    public void clickOnComputersTab() {
        Reporter.log("Clicking on ComputerTab " + homepage.toString() + "<br>");
        homepage.selectMenu("Computers");
        log.info("Clicking on Computers Tab : " + homepage);


    }

    public void clickOnDesktopOption(){
        Reporter.log("Click on DeskTopOption" + clickOnDesktop.toString() + "<br>");
        clickOnElement(clickOnDesktop);
        log.info("Clicking on DeskTop Tab: " + clickOnDesktop.toString());

    }

    public void verifyproductsSortByGivenOrder() {
        Reporter.log("Get reverse order text" + deskTop.toString() + "<br>");
        List<WebElement> deskTopList = (List<WebElement>) driver.findElement((By) deskTop);  //verifying sort by products are in 'z to a'
        List<String> productName = new ArrayList<>();
        for (WebElement deskTop : deskTopList) {
            productName.add(deskTop.getText());
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(productName);

        Collections.sort(tempList, Collections.reverseOrder());
        Collections.sort(productName, Collections.reverseOrder());
        System.out.println(productName);
        System.out.println(tempList);
        Assert.assertEquals(productName, tempList);


    }
}



