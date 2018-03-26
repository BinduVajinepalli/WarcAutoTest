package com.test.warc.stepDefs;

import com.test.warc.pages.CreateUserPage;
import com.test.warc.pages.UserInformationPage;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WarcStepDefs implements En {
    private WebDriver driver = new ChromeDriver();

    private CreateUserPage createUserPage = new CreateUserPage(driver);
    private UserInformationPage userInfoPage = new UserInformationPage(driver);

    public WarcStepDefs() {
        Given("^I am on the create user website$", () -> {
            createUserPage.goTo();
        });

        When("^I enter my forename as \"([^\"]*)\"$", (String forename) -> {
            createUserPage.enterForename(forename);
        });

        When("^I enter my surname as \"([^\"]*)\"$", (String surname) -> {
            createUserPage.enterSurname(surname);
        });

        When("^I enter my email as \"([^\"]*)\"$", (String email) -> {
            createUserPage.enterEmail(email);
        });

        When("^I enter my age as \"([^\"]*)\"$", (String age) -> {
            createUserPage.enterAge(age);
        });

        When("^I enter the title as \"([^\"]*)\"$", (String title) -> {
            createUserPage.selectTitle(title);
        });

        When("^I click on save my details$", () -> {
            createUserPage.saveTheDetails();

        });

        Then("I should be registered as a new user$", () -> {
           Assert.assertTrue(userInfoPage.getPageTitle().contains("User Information"));
        });

        Then("My name must be \"([^\"]*)\"$", (String name) -> {
            Assert.assertTrue(userInfoPage.getName().contains(name));
        });

        Then("My age must be \"([^\"]*)\"$", (String age) -> {
            Assert.assertTrue(userInfoPage.getAge().contains(age));
        });

        Then("My email must be \"([^\"]*)\"$", (String email) -> {
            Assert.assertTrue(userInfoPage.getEmail().contains(email));
        });

        Then("I must see validation message \"([^\"]*)\"$", (String message) -> {
            Assert.assertTrue(userInfoPage.getBodyText().contains(message));
        });

        Then("I must not be able to save the details", () -> {
            Assert.assertFalse(userInfoPage.getUrl().contains("http://mtest.warc.com:8080/Home/UserInformation/?userId=1"));
        });

    }


}

