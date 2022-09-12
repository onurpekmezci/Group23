package StepDefinitions;

import Pages.DialogContent;
import Pages.GIP_3;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class GIP3_Add {


    LeftNav ln=new LeftNav();
    DialogContent dc = new DialogContent();
    GIP_3 gp=new GIP_3();

        @When("Navigate to Document Types")
        public void NavigateToDocumentTypes() {

            ln.findAndClick("SetupOne");
            ln.findAndClick("Parameters");
            ln.findAndClick("DocumentTypes");
            }

        @And("Click on the addDocument")

            public void ClickOnTheAddDocument() {

            gp.findAndClick("addDocument");

            }


        @And("User sending the keys in Document Page")
    public void UserSendingTheKeysInDocumentPage() {

            gp.findAndSend("documentName", "ALI");


        }

        @And("User click document stage and choose Sertificate Stage in Document Page")

    public void UserClickDocumenentStageAndChooseSertificateStageInDocumentPage() {
            gp.findAndClick("documentStage");
            gp.findAndClick("stageSertificate");
            gp.actionEsc();


}
        @And("Click on Save Button in Document Page")
        public void ClickOnSaveButtonInDocumentPage() {

            gp.findAndClick("saveDocument");


}

        @And("Success message should be displayed")
        public void SuccessMessageShouldBeDisplayed(DataTable elements){


        }

    }

