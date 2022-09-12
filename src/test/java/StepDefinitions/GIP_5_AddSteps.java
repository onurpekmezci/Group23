package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.text.Utilities;

public class GIP_5_AddSteps {
    LeftNav leftNav=new LeftNav();
    DialogContent dialog=new DialogContent();
    @Given("Clicking on the relevant menu options")
    public void clickingOnTheRelevantMenuOptions() {
        leftNav.findAndClick("HumanResources");
        leftNav.findAndClick("setupClick");
        leftNav.findAndClick("positionClick");

    }

     @When("Fill in the fields related to adding a position")
    public void fillInTheFieldsRelatedToAddingAPosition() {
        dialog.findAndClick("createButton");
        dialog.findAndSend("nameInput2","madridista");
        dialog.findAndSend("shortName2","barca");
        dialog.findAndClick("saveButton");
    }

    @Then("Successfully add operation")
    public void successfullyAddOperation() {
        dialog.findAndContainsText("successMessage","successfully");

    }
}
