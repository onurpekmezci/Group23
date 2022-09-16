package StepDefinitions;

import Pages.DialogContent;
import Pages.Huseyin_GIP_5_Content;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GIP_5_EditSteps {
   Huseyin_GIP_5_Content HS=new Huseyin_GIP_5_Content();
    @Given("Arrangement of first and last names")
    public void arrangementOfFirstAndLastNames() {
        HS.findAndSend("nameInput1","madridista");
        HS.findAndClick("searchButton");
        HS.waitUntilLoading();
        HS.findAndClick("editButton");
        HS.findAndSend("nameInput2","celtic");
        HS.findAndSend("shortName2","rangers");
        HS.findAndClick("saveButton");

    }

    @Then("Confirmation of successfully")
    public void confirmationOfSuccessfully() {
        HS.findAndContainsText("successMessage","success");

    }
}
