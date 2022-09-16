package StepDefinitions;

import Pages.DialogContent;
import Pages.Huseyin_GIP_5_Content;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.text.Utilities;

public class GIP_5_AddSteps {
    Huseyin_GIP_5_Content HS=new Huseyin_GIP_5_Content();
    @Given("Clicking on the relevant menu options")
    public void clickingOnTheRelevantMenuOptions() {
        HS.findAndClick("HumanResources");
        HS.findAndClick("setupClick");
        HS.findAndClick("positionClick");

    }

     @When("Fill in the fields related to adding a position")
    public void fillInTheFieldsRelatedToAddingAPosition() {
        HS.findAndClick("createButton");
        HS.findAndSend("nameInput2","madridista");
        HS.findAndSend("shortName2","barca");
        HS.findAndClick("saveButton");
    }

    @Then("Successfully add operation")
    public void successfullyAddOperation() {
        HS.findAndContainsText("successMessage","successfully");
//
    }
}
