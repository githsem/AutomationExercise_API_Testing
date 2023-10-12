package com.example.step_defs;

import com.example.services.PostToCreateRegisterUser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.example.utilities.Globals.response;


public class PostToCreateRegisterUser_stepDefs {

    PostToCreateRegisterUser postToCreateRegisterUser=new PostToCreateRegisterUser();

    @When("Create And Register User")
    public void create_and_register_user() {
        postToCreateRegisterUser.postToCreateRegisterUser();
    }
    @Then("Validate that new user are registered")
    public void validate_that_new_user_are_registered() {
        Assert.assertEquals(201, response.jsonPath().getInt("responseCode"));
        Assert.assertEquals("User created!", response.jsonPath().getString("message"));
    }
}
