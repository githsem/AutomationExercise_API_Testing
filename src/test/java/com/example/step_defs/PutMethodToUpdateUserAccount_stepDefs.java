package com.example.step_defs;

import com.example.services.PutMethodToUpdateUserAccount;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PutMethodToUpdateUserAccount_stepDefs {

    PutMethodToUpdateUserAccount putMethodToUpdateUserAccount = new PutMethodToUpdateUserAccount();

    @When("Put To Account")
    public void put_to_account() {
        putMethodToUpdateUserAccount.updateAccount();
    }

    @Then("Validate that user updated")
    public void validate_that_user_updated() {
        putMethodToUpdateUserAccount.validateUSerUpdated();
    }
}
