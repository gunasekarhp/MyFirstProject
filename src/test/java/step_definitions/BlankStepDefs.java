package step_definitions;


import static org.testng.AssertJUnit.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en_old.Ac;
import modules.Google_ACTION;
import org.apache.xmlbeans.impl.xb.xmlconfig.ConfigDocument;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.browserlaunchers.locators.GoogleChromeLocator;
import org.testng.internal.Configuration;
import org.testng.internal.Yaml;
import pageobjects.FunctionLibrary;
import pageobjects.ObjectRepository;

import java.util.concurrent.TimeUnit;


public class BlankStepDefs{
    public WebDriver webDriver;
    private FunctionLibrary FN;
    private ObjectRepository OR;
    private Google_ACTION Action;


    public BlankStepDefs()
    {
        webDriver = BaseTest.driver;
        FN =new FunctionLibrary(this.webDriver);
        OR = new ObjectRepository();
        Action = new Google_ACTION(this.webDriver);
    }


    
    @When("^I open seleniumframework website$")
    public void i_open_seleniumframework_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        webDriver.get("http://www.google.com");
    }

    @Then("^I validate title and URL$")
    public void i_print_title_and_URL() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      assertEquals("Selenium Framework | Selenium, Cucumber, Ruby, Java et al.",webDriver.getTitle());
      assertEquals("://www.seleniumframework.com/",webDriver.getCurrentUrl());
    }

    @And("^I search for a text (.*)$")
    public void iSearchForATextAutomationTesting(String text) throws Throwable {
//        FN.type(OR.text,text);
        Action.search_for_text(text);
    }
}