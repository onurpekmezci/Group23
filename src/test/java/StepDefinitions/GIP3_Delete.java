package StepDefinitions;

import Pages.DialogContent;
import Pages.GIP_3;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;

public class GIP3_Delete extends Parent {

    LeftNav ln=new LeftNav();
    DialogContent dc = new DialogContent();
    GIP_3 gp=new GIP_3();

    @And("Click on the deleteDocument")
    public void clickOnTheDeleteDocument() {
        gp.findAndClick("deleteDocument");
        waitUntilLoading();
        
    }

    @And("User confirms delete processes")
    public void userConfirmsDeleteProcesses() {

        gp.findAndClick("confirmDelete");

    }
}
