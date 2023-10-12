package com.example.step_defs;

import com.example.services.DeleteToVerifyLogin;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteToVerifyLogin_stepDefs {

    DeleteToVerifyLogin deleteToVerifyLogin = new DeleteToVerifyLogin();

    @When("Delete To Verify Login")
    public void delete_to_verify_login() {
        deleteToVerifyLogin.deleteToVerifyLogin();
    }

    @Then("Validate that DELETE To Verify Login")
    public void validate_that_delete_to_verify_login() {
        deleteToVerifyLogin.validateThatDeleteToVerifyLogin();
    }
}
