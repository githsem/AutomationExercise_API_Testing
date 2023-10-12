package com.example.step_defs;

import com.example.services.PostToVerifyLoginWithInvalidDetails;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PostToVerifyLoginWithInvalidDetails_stepDefs {

    PostToVerifyLoginWithInvalidDetails postToVerifyLoginWithInvalidDetails = new PostToVerifyLoginWithInvalidDetails();

    @When("User writes invalid email and password")
    public void user_writes_invalid_email_and_password() {
        postToVerifyLoginWithInvalidDetails.postToVerifyLoginWithInvalidDetails();
    }

    @Then("Validate that invalid result")
    public void validate_that_invalid_result() {
        postToVerifyLoginWithInvalidDetails.validateLoginWithInvalidDetails();
    }

}
