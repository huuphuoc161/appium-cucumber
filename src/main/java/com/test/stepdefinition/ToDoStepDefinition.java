package com.test.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.*;
import com.test.stepdefinition.TestRunner;


public class ToDoStepDefinition extends TestRunner {

    public RemoteWebDriver driver = this.connection;
    WebDriverWait wait = new WebDriverWait(driver, 30);


    @Given("^user is on the App home page$")
    public void user_already_on_home_page() {
        System.out.println("On Home page");
    }

    @When("^click on color element$")
    public void click_color() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("color"))).click();

    }

    @Then("^click on geolocation element and navigate back$")
    public void click_geolocation()throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.lambdatest.proverbial:id/geoLocation"))).click();
        Thread.sleep(5000);
        driver.navigate().back();

    }

    @Then("^click on text element$")
    public void click_text() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Text"))).click();
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("Browser"))).click();
    }

    @Then("^click on notification element$")
    public void click_notification() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("notification"))).click();
    }

    @Then("^click on toast element$")
    public void click_toast() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("toast"))).click();
    }
}