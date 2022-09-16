package StepDefinitions;
import Pages.GIP_3;
import Pages.GIP_9;
import Pages.LeftNav;
import Pages.Parent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Nicat_GID9_emplsteps extends Parent  {
    LeftNav ln=new LeftNav();
    GIP_9 gp=new GIP_9();


    @And("Navigate to Bank Account page")
    public void navigateToBankAccountPage() {
        ln.findAndClick("SetupOne");
        ln.findAndClick("Parameters");
        ln.findAndClick("Bankaccounts");
    }

    @When("Create a Bank Account")
    public void createABankAccount() {
        waitUntilLoading();
        gp.findAndClick("addbutton");
        gp.typeNameinput();
        gp.typeIBAN();
        gp.findAndClick("currency");
        gp.findAndClick("USD");
        gp.typeintcode();
        gp.findAndClick("save");

    }


    @And("find created account")
    public void findCreatedAccount() {
        gp.findAndClick("closebutton");
        gp.findcreatedname();
        gp.findAndClick("searchbutton");
        gp.findAndClick("editbutton");
        gp.editintcode();
        gp.findAndClick("save");



    }

    @And("delete bank account")
    public void deleteBankAccount() {
        waitUntilLoading();
        gp.findAndClick("deleteaccount");
        gp.findAndClick("confirmdelete");


    }
}

