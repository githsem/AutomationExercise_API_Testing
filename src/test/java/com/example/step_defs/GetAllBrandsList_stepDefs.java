package com.example.step_defs;

import com.example.services.GetAllBrandsList;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetAllBrandsList_stepDefs {
    GetAllBrandsList getAllBrandsList = new GetAllBrandsList();

    @When("Get All Brands List")
    public void get_all_brands_list() {
        getAllBrandsList.getAllBrandsList();
    }

    @Then("Validate that all brands are listed")
    public void validate_that_all_brands_are_listed() {
        getAllBrandsList.validateThatAllBrands();
    }

}
