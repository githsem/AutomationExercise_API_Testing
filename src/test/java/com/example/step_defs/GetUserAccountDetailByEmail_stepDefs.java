package com.example.step_defs;

import com.example.services.GetUserAccountDetailByEmail;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetUserAccountDetailByEmail_stepDefs {

    GetUserAccountDetailByEmail getUserAccountDetailByEmail = new GetUserAccountDetailByEmail();

    @When("Get To User Account Detail by Email")
    public void get_to_user_account_detail_by_email() {
        getUserAccountDetailByEmail.GetUserAccountDetailByEmail();
    }
    @Then("Validate User Detail")
    public void validate_user_detail() {
        getUserAccountDetailByEmail.validateUserDetail();
    }
}
