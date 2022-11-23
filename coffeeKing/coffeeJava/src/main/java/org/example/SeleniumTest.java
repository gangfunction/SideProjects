package org.example;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class SeleniumTest {
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final  String WEB_DRIVER_PATH = "src/main/resources/chromedriver";
    SeleniumTest(){
        try{
            System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public void PageLoad(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://bwport.com/product/list.html?cate_no=389");
        ElementFind(driver);
    }
    public void ElementFind(WebDriver driver){
        List<WebElement> results = driver.findElements(By.className("text-info"));
        ArrayList<String> answers = new ArrayList<>();
        for(WebElement element : results)
        {
            answers.add(element.getText());
        }
        System.out.println(answers);
        driver.close();

    }

}
