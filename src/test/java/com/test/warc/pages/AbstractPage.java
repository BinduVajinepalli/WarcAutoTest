package com.test.warc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class AbstractPage {

    protected final WebDriver driver;
    protected final WebDriverWait wait;

    @FindBy(css = "h2")
    private WebElement title;

    @FindBy(tagName = "body")
    private WebElement bodyText;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 10);
    }

    public String getPageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleContains("User Iformation"));
        return title.getText();
    }

    public String getBodyText() {
        return bodyText.getText();
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public void quit() {
        this.driver.quit();
    }

}