package com.test.warc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserInformationPage extends AbstractPage {

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]")
    private WebElement name;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[4]")
    private WebElement age;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[6]")
    private WebElement email;

    public UserInformationPage(final WebDriver driver) {
        super(driver);
    }

    public String getName() {
        return name.getText();
    }

    public String getAge(){
        return age.getText();
    }

    public String getEmail() {
        return email.getText();
    }


}
