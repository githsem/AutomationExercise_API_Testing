package com.example.step_defs;

import com.example.services.DeleteUserAccount;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteUserAccount_stepDefs {

    DeleteUserAccount deleteUserAccount = new DeleteUserAccount();

    @When("Delete User Account")
    public void delete_user_account() {
        deleteUserAccount.DeleteUserAccountApi();
    }

    @Then("Validate that Account was deleted")
    public void validate_that_account_was_deleted() {
        deleteUserAccount.verifyAccountUser();
    }
}


