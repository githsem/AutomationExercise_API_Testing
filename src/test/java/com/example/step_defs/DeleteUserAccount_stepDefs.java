package com.example.step_defs;
import com.example.services.DeleteUserAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.util.Map;

import static com.example.utilities.Globals.response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DeleteUserAccount_stepDefs {

    DeleteUserAccount deleteUserAccount=new DeleteUserAccount();
    @When("Delete User Account")
    public void delete_user_account() { deleteUserAccount.DeleteUserAccountApi();

    }
    @Then("Validate that Account was deleted")
    public void validate_that_account_was_deleted() { deleteUserAccount.verifyAccountUser();

    }

}


