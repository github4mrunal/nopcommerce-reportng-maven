package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.BuildYourOwnComputer;
import com.nopcommerce.demo.pages.ComputersPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.Homepage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(CustomListeners.class)
public class TestSuite extends TestBase {


    Homepage homepage = new Homepage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage deskTopPage = new DesktopPage();
    BuildYourOwnComputer buildyourowncomputer = new BuildYourOwnComputer();

    @BeforeMethod(alwaysRun = true)
    public void testSetUp(){
        homepage = new Homepage();
        computersPage = new ComputersPage();
        deskTopPage = new DesktopPage();
        buildyourowncomputer = new BuildYourOwnComputer();
    }

    @Test(groups = {"sanity","regression"})
    public void clickOnAllTopMenuTabs()  {
        homepage.selectMenu("Computers");
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void clickOnDesktopAndSortByZtoA() throws InterruptedException {
        homepage.selectMenu("Computers");
        computersPage.clickOnComputersTab();
        Thread.sleep(3000);
        computersPage.clickOnDesktopOption();
      //  computersPage.verifyproductsSortByGivenOrder();
    }

    @Test(groups = {"smoke" ,"regression"})
    public void clickOnDesktopAndSortByAndAddToCart() throws InterruptedException {
        homepage.selectMenu("Computers");
        computersPage.clickOnComputersTab();
        Thread.sleep(3000);
        deskTopPage.clickonDesktop();
        deskTopPage.selectValueFromDropdown("Name: A to Z");
        deskTopPage.clickOnAddToCart();

    }

    @Test(groups = {"smoke" ,"regression"})
    public void buildYourOwnComputer() throws InterruptedException {
        homepage.selectMenu( "Computers" );
        computersPage.clickOnComputersTab();
        deskTopPage.clickonDesktop();
        deskTopPage.selectValueFromDropdown( "Name: A to Z" );
        deskTopPage.clickOnAddToCart();
        SoftAssert softAssert = new SoftAssert();
        String expectedPagetext = "Build your own computer";  //verify build your own page
        String actualPageText = buildyourowncomputer.getBuildYourOwnText();
        Assert.assertEquals( actualPageText,expectedPagetext );
        softAssert.assertTrue( false );
        buildyourowncomputer.selectProcessorFromDropDownOne( "2.2 GHz Intel Pentium Dual-Core E2200" );
        buildyourowncomputer.selectRamFromDropDownTwo( "8GB [+$60.00]" );
        buildyourowncomputer.clickOnHDDRadioButton();
        buildyourowncomputer.clickOSOnRadioButton();
        buildyourowncomputer.clickOnSoftwareCheckBox();
        String expectedtotal = "$1,475.00";          //Verifying Total
        String actualTotal = buildyourowncomputer.getTotalAmt();
        Assert.assertEquals( actualTotal,expectedtotal );
        softAssert.assertTrue( true );
        buildyourowncomputer.clickOnAddToCart();
        String expectedBarMessage = "The product has been added to your shopping cart";
        String actualBarMessage = buildyourowncomputer.getTopBarMessage();
        Assert.assertEquals( actualBarMessage,expectedBarMessage);
        softAssert.assertTrue( false );
        softAssert.assertAll();



    }

}
