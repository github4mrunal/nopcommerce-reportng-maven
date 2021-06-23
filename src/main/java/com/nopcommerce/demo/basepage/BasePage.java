package com.nopcommerce.demo.basepage;

import com.nopcommerce.demo.pages.Homepage;
import com.nopcommerce.demo.propertyreader.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
    String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");

    int implicitlyWait = Integer.parseInt(PropertyReader.getInstance().getProperty("implicitlyWait"));

    String projectPath = System.getProperty("user.dir");


    private static final Logger log = LogManager.getLogger(BasePage.class.getName());

    public BasePage() {
        PageFactory.initElements(driver,this);
        PropertyConfigurator.configure(projectPath + "/src/test/java/resources/propertiesfile/log4j.properties");

    }

        public void selectBrowser(String browser) {
       // WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver.exe");
            log.info("Launching Chrome Browser");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            log.info("Launching FireFox Browser");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", projectPath + "/drivers/IEDriverServer.exe");
            log.info("Launching IE Browser");
            driver = new InternetExplorerDriver();
        } else {
            log.info("Wrong Browser Name");
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicitlyWait,TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    public void closeBrowser(){
        if (driver != null){
            driver.quit();
        }
    }

}

