package com.codecool.zsana.metoffice;

import com.codecool.zsana.metoffice.base.KeywordRepository;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StepDefinitions {

    private KeywordRepository repository = new KeywordRepository();

    @Before
    public void letsStart() {
        System.out.println("We start here.");
    }

    @Given("that I want to open met.hu")
    public void that_I_want_to_open_met_hu() {
        System.out.println("I want to open metoffice");
    }

    @When("I write met.hu")
    public void i_write_met_hu() {
        System.out.println("Here is write met.hu");
    }

    @Then("met.hu is open")
    public void met_hu_is_open() {
        repository.navigate("http://met.hu");
        Assert.assertTrue(repository.isElementVisible(repository.getProperties().getProperty("mainMenuPath")));
    }

    @After
    public void close() {
        repository.closeDriver();
    }

}
