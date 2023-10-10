package com.example.step_defs;

import com.example.services.PostToSearchProductWithoutParameter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostToSearchProductWithoutParameter_stepDefs {

    PostToSearchProductWithoutParameter postToSearchProductWithoutParameter=new PostToSearchProductWithoutParameter();
    @When("Post To Search Product without Search product parameter")
    public void post_to_search_product_without_search_product_parameter() {
         postToSearchProductWithoutParameter.postToSearchProductWithoutParameter();
    }
    @Then("Validate that product parameter is missing in post request")
    public void validate_that_product_parameter_is_missing_in_post_request() {
         postToSearchProductWithoutParameter.validateThatProductSearchedWithoutParameter();
    }
}
