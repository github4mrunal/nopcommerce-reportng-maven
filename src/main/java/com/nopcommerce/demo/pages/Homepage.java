package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


public class Homepage extends Utility {
//    By computers = By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]");
//    By electronics = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
//    By apparel =  By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]");
//    By digidown = By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]");
//    By books = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");
//    By jewlery = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");
//    By giftcards = By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");

    public void selectMenu(String menu) {

        if (menu.equalsIgnoreCase("Computers")) {
            clickOnElement(By.xpath("//body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        } else if (menu.equalsIgnoreCase("Electronics")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        } else if (menu.equalsIgnoreCase("Apparel")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        } else if (menu.equalsIgnoreCase("Digital downloads")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        } else if (menu.equalsIgnoreCase("Books")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        } else if (menu.equalsIgnoreCase("Jewelry")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        } else if (menu.equalsIgnoreCase("Gift Cards")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        }



//        Reporter.log("Clicking on all Top Menu Tabs" + computers.toString()+ "<br>");
//        Reporter.log("Clicking on all Top Menu Tabs" + electronics.toString() + "<br>");
//        Reporter.log("Clicking on all Top Menu Tabs" + apparel.toString() + "<br>");
//        Reporter.log("Clicking on all Top Menu Tabs" + digidown.toString() + "<br>");
//        Reporter.log("Clicking on all Top Menu Tabs" + books.toString() + "<br>");
//        Reporter.log("Clicking on all Top Menu Tabs" + jewlery.toString() + "<br>");
//        Reporter.log("Clicking on all Top Menu Tabs" + giftcards.toString() + "<br>");
//
//        if (menu.equalsIgnoreCase("Computers")) {
//            clickOnElement(computers);
//        } else if (menu.equalsIgnoreCase("Electronics")) {
//            clickOnElement(electronics);
//        } else if (menu.equalsIgnoreCase("Apparel")) {
//            clickOnElement(apparel);
//        } else if (menu.equalsIgnoreCase("Digital downloads")) {
//            clickOnElement(digidown);
//        } else if (menu.equalsIgnoreCase("Books")) {
//            clickOnElement(books);
//        } else if (menu.equalsIgnoreCase("Jewelry")) {
//            clickOnElement(jewlery);
//        } else if (menu.equalsIgnoreCase("Gift Cards")) {
//            clickOnElement(giftcards);
//        }


    }
}
