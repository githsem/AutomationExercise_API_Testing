package com.example.step_defs;

import com.example.services.PostToAllProductsList;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostToAllProductsList_stepDefs {

    PostToAllProductsList postToAllProductsList = new PostToAllProductsList();

    @When("Post To All Products List")
    public void post_to_all_products_list() {
        postToAllProductsList.postToAllProductsList();
    }
    @Then("Validate that this request method is not supported.")
    public void validate_that_this_request_method_is_not_supported() {
        postToAllProductsList.validateThisPostRequestMethod();
    }
}
