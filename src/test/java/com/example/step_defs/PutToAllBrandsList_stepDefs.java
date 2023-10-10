package com.example.step_defs;

import com.example.services.PutToAllBrandsList;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PutToAllBrandsList_stepDefs {
    PutToAllBrandsList putToAllBrandsList = new PutToAllBrandsList();

    @When("Put to All Brands List")
    public void put_to_all_brands_list() {
        putToAllBrandsList.putToAllBrandsList();
    }

    @Then("Validate that response message")
    public void validate_that_response_message() {
        putToAllBrandsList.validateThatPostRequestMethod();
    }


}
