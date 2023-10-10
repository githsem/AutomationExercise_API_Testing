package com.example.step_defs;

import com.example.services.PostToVerifyLoginwithValidDetails;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apiguardian.api.API;

public class PostToVerifyLoginWithValidDetails {
    PostToVerifyLoginwithValidDetails postToVerifyLoginwithValidDetails=new PostToVerifyLoginwithValidDetails();

    @When("Post to verify login")
    public void post_to_verify_login() {
     postToVerifyLoginwithValidDetails.postToVerifyLoginwithValidDetails();
    }
    @Then("Verify that valid result")
    public void verify_that_valid_result() {

        postToVerifyLoginwithValidDetails.verifyUserLogin();

    }
}
