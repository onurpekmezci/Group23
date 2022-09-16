package StepDefinitions;

import Pages.DialogContent;
import Pages.GIP_3;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;

public class GIP3_Edit extends Parent {

    //

    LeftNav ln=new LeftNav();
    DialogContent dc = new DialogContent();
    GIP_3 gp=new GIP_3();
    @And("Search on the Document")
    public void SearchOnTheDocument() {
        waitUntilLoading();
        gp.findAndSend("searchDocument", "ALI");


        
    }

    @And("Click on the Search Button")
    public void clickOnTheSearchButton() {

        gp.findAndClick("searchButton");
    }

    @And("User edit the keys in Document Page")
    public void userEditTheKeysInDocumentPage() {

        gp.findAndClick("editDocument");
        gp.findAndSend("editName", "MEHMET");

    }


    @And("Click on Save Button the Edit Page")
    public void clickOnSaveButtonTheEditPage() {
        gp.findAndClick("editSave");
    }
}
