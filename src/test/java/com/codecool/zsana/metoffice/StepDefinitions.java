package com.codecool.zsana.metoffice;

import com.codecool.zsana.metoffice.base.KeywordRepository;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    private KeywordRepository repository = new KeywordRepository();

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
    }

    @After
    void close() {
        repository.closeDriver();
    }

}
