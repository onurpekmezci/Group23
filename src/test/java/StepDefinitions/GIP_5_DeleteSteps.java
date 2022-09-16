package StepDefinitions;

import Pages.DialogContent;
import Pages.Huseyin_GIP_5_Content;
import Pages.Parent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GIP_5_DeleteSteps {
   Huseyin_GIP_5_Content HS=new Huseyin_GIP_5_Content();
    @When("Execution of deletion")
    public void executionOfDeletion() {
        HS.findAndSend("nameInput1","celtic");
        HS.findAndClick("searchButton");
        HS.waitUntilLoading();
        HS.findAndClick("deleteButton");
        HS.findAndClick("deleteClick");

    }

    @Then("Delete and successfully")
    public void deleteAndSuccessfully() {
        HS.findAndContainsText("successMessage","successfully");
    }
}
