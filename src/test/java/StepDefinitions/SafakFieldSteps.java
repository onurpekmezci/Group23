package StepDefinitions;
import Pages.DialogContent;
import Pages.LeftNav;
import Pages.Parent;
import Pages.Safak_Content;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SafakFieldSteps extends Parent {
    LeftNav lb = new LeftNav();
    Safak_Content dc = new Safak_Content();

    @And("Navigate Field Pages")

    public void navigateFieldPages() {
        lb.findAndClick("SetupOne"); // Setup Click
        lb.findAndClick("Parameters"); // Parameters Click
        lb.findAndClick("Fields"); // Fields  Click

    }

    @When("Create a new Fields")

    public void CreateanewFields() {

        dc.findAndClick("AddPlus");
        dc.findAndSend("nameInput", "domates");
        dc.findAndSend("codeInput", "314170");
        dc.findAndClick("saveButton");
        dc.findAndSend("sendSearchName", "Kavuncum");
        dc.SearchButton();
        //waitUntilLoading();
        dc.editaction();
        dc.delete2action();


    }



    @And("Edit a Fields")
    public void editAFields() {

          waitUntilLoading();
          dc.editaction();

          dc.editaction();
       // dc.findAndClick("EditButton");


        dc.findAndSend("nameInput", "Tavukcum");
        dc.findAndSend("codeInput", "19235");
        waitUntilLoading();
        dc.findAndClick("saveButton");


    }

       @And("Delete a Fields")
        public void deleteaFields(){

           dc.deleteaction();
           waitUntilLoading();
           dc.delete2action();
           waitUntilLoading();


       }





}