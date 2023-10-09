package com.example.step_defs;

import com.example.services.PostToSearchProduct;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostToSearchProduct_stepDefs {

    PostToSearchProduct postToSearchProduct=new PostToSearchProduct();
    @When("Post To Search Product")
    public void post_to_search_product() {
        postToSearchProduct.postToSearchProduct();

    }
    @Then("Validate that products list searched")
    public void validate_that_products_list_searched() {
        postToSearchProduct.validateProductsSearched();

    }


}
