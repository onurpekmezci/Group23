package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GIP_5_DeleteSteps {
    DialogContent dialog=new DialogContent();
    Parent parent=new Parent();
    @When("Execution of deletion")
    public void executionOfDeletion() {
        dialog.findAndSend("nameInput1","celtic");
        dialog.findAndClick("searchButton");
        parent.waitUntilLoading();
        dialog.findAndClick("deleteButton");
        dialog.findAndClick("deleteClick");

    }

    @Then("Delete and successfully")
    public void deleteAndSuccessfully() {
        dialog.findAndContainsText("successMessage","successfully");
    }
}
