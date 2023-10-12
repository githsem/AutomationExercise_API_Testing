package com.example.step_defs;

import com.example.services.GetAllProductsList;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetAllProductsList_stepDefs {

    GetAllProductsList getAllProductsList = new GetAllProductsList();

    @When("Get All Products List")
    public void get_all_products_list() {
        getAllProductsList.getAllProductsList();
    }

    @Then("Validate that all products are listed")
    public void validate_that_all_products_are_listed() {
        getAllProductsList.validateThatAllProductsAreListed();
    }
}
