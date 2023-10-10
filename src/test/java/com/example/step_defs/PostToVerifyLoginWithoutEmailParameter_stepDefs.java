package com.example.step_defs;

import com.example.services.PostToVerifyLoginWithoutEmail;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostToVerifyLoginWithoutEmailParameter_stepDefs {

    PostToVerifyLoginWithoutEmail postToVerifyLoginWithoutEmail=new PostToVerifyLoginWithoutEmail();

    @When("Post to login witout email")
    public void post_to_login_witout_email() {
        postToVerifyLoginWithoutEmail.postToVerifyLoginWithoutEmail();
    }
    @Then("Verify that invalid result")
    public void verify_that_invalid_result() {
    postToVerifyLoginWithoutEmail.verifyLoginWithInvalidDetails();
    }
}
