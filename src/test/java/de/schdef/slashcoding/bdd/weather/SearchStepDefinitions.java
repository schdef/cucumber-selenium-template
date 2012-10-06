package de.schdef.slashcoding.bdd.weather;

import static junit.framework.Assert.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import de.schdef.slashcoding.utils.web.SeleniumWebdriverFactory;

public class SearchStepDefinitions {
    private WebDriver driver;
    private HomePage home;
    private SearchResultPage searchResult;

    @Before
    public void prepare() {
	driver = SeleniumWebdriverFactory.getDefaultWebdriver();
    }

    @After
    public void cleanUp() {
	driver.close();
    }

    @Given("^I want to know the weather forecast for coming days$")
    public void prepareHomePage() {
	home = new HomePage(driver);
    }

    @When("^I search for (.*)$")
    public void search(String location) {
	searchResult = home.searchFor(location);
    }

    @Then("^I should be able to get a weather forecast for (.*)$")
    public void assertTheSearchResult(String locationName) {
	LocationPage location = searchResult.clickOnTopSearchResultLink();
	String actualHeadLine = location.getHeadLine();

	assertTrue(actualHeadLine.contains(locationName));
    }

}
