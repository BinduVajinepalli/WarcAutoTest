package com.test.warc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateUserPage extends AbstractPage {

    private static final String URL = "http://mtest.warc.com:8080/Home/CreateUser";

    @FindBy(css = "input#inputForename")
    private WebElement txtForename;

    @FindBy(css = "input#inputSurname")
    private WebElement txtSurname;

    @FindBy(css = "input#inputEmail")
    private WebElement txtEmail;

    @FindBy(css = "input#inputAge")
    private WebElement txtAge;

    @FindBy(css = "select#inputTitle")
    private WebElement cboTitle;

    @FindBy(css = "button#saveButton")
    private WebElement btnSave;

    public CreateUserPage(final WebDriver driver) {
        super(driver);
    }

    public void goTo() throws InterruptedException {
        this.driver.get(URL);
    }

    public void enterForename(String forename) {
        txtForename.sendKeys(forename);
    }

    public void enterSurname(String surname) {
        txtSurname.sendKeys(surname);
    }

    public void enterEmail(String email) {
        txtEmail.sendKeys(email);
    }

    public void enterAge(String age) {
        txtAge.sendKeys(age);
    }

    public void selectTitle(String title) {
        Select dropdown = new Select(cboTitle);
        dropdown.selectByVisibleText(title);
    }

    public void saveTheDetails() {
        btnSave.click();
    }
}
