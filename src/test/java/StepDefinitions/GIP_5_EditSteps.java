package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GIP_5_EditSteps {
    Parent parent=new Parent();
    DialogContent dialog=new DialogContent();

    @Given("Arrangement of first and last names")
    public void arrangementOfFirstAndLastNames() {
        dialog.findAndSend("nameInput1","madridista");
        dialog.findAndClick("searchButton");
        parent.waitUntilLoading();
        dialog.findAndClick("editButton");
        dialog.findAndSend("nameInput2","celtic");
        dialog.findAndSend("shortName2","rangers");
        dialog.findAndClick("saveButton");

    }

    @Then("Confirmation of successfully")
    public void confirmationOfSuccessfully() {
        dialog.findAndContainsText("successMessage","successfully");

    }
}
