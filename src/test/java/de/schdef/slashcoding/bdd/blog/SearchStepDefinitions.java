package de.schdef.slashcoding.bdd.blog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.runtime.PendingException;

public class SearchStepDefinitions {
    private WebDriver driver;

    @Before
    public void prepare() {
	driver = new FirefoxDriver();
    }

    @After
    public void cleanUp() {
	driver.close();
    }
    
    @Given("^I want to see the blog posts on slashcoding.blogspot.com$")
    public void I_want_to_see_the_blog_posts_on_slashcoding_blogspot_com() {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^I should be able to get a list of minimum (\\d+) blog posts$")
    public void I_should_be_able_to_get_a_list_of_minimum_blog_posts(int arg1) {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

}
