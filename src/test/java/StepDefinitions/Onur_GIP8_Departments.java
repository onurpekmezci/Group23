package StepDefinitions;

import Pages.LeftNav;
import Pages.Onur_GIP8_Content;
import Utilities.ExcelUtility;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Onur_GIP8_Departments {

    LeftNav ln = new LeftNav();
    Onur_GIP8_Content ogc = new Onur_GIP8_Content();
    private String path;

    @When("Navigate to department")
    public void navigateToDepartment() {
        ln.findAndClick("SetupOne");
        ln.findAndClick("SchoolSetup");
        ln.findAndClick("SchoolDepartments");

    }

    @And("Click add button")
    public void clickAddButton() {

        ogc.FindAndClick("AddButton");
        path = "src/test/java/StepDefinitions/Onur_Resources/GIP8.xlsx";
    }

    @And("Create department")
    public void createDepartment() {


        sendvalue("department", "NameInput", "CodeInput");


    }

    @And("click Section")
    public void clickSection() {
        ogc.FindAndClick("SectionButton");
    }

    @And("Create Section")
    public void createSection() {

        sendvalue("section", "NameInput", "CodeInput");
        ogc.FindAndClick("GridAddButton");

    }

    @And("Department Constants")
    public void departmentConstants() {
        ogc.FindAndClick("DepConsButton");
    }

    @And("Create Constants")
    public void createConstants() {

        sendvalue("constants", "KeyInput", "ValueInput");
        ogc.FindAndClick("GridAddButton");
    }

    @Then("Select School")
    public void selectSchool() {

        ogc.FindAndClick("SchoolClick");
        ogc.FindAndClick("SchoolSelect");

    }

    private void sendvalue(String sheet, String Input1, String Input2) {

        ArrayList<ArrayList<String>> exlist = ExcelUtility.getListData(path, sheet, 2);

        for (int i = 0; i < exlist.size(); i++) {

            ogc.FindAndSend(Input1, exlist.get(0).get(0));

            ogc.FindAndSend(Input2, exlist.get(0).get(1));
        }
    }

    @And("Click Save")
    public void clickSave() {
        ogc.FindAndClick("SaveButton");
    }

    @And("Click edit button")
    public void clickEditButton() {

        ogc.FindAndClick("GridEditButton");
        path = "src/test/java/StepDefinitions/Onur_Resources/GIP8_edit.xlsx";
    }

    @And("Click School Department")
    public void clickSchoolDepartment() {

        ogc.FindAndClick("DepartmentButton");
    }

    @And("Click dialog edit button")
    public void clickDialogEditButton() { ogc.FindAndClick("DialogEditButton");
    }

    @And("Wait until loading")
    public void waitUntilLoading() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.cssSelector("fuse-progress-bar > *"), 0));
    }

    @And("Edit Constants")
    public void editConstants() {
        sendvalue("constants", "KeyInput", "ValueInput");
        ogc.FindAndClick("recordEditButton");
    }

    @And("Edit Section")
    public void editSection() {
        sendvalue("section", "NameInput", "CodeInput");
        ogc.FindAndClick("recordEditButton");
    }

    @And("Verify successfuly")
    public void verifySuccessfuly() {

        ogc.findAndContainsText("SuccessDialog","success");
    }


    @And("Dialog records delete")
    public void dialogRecordsDelete() {

        ogc.ConstantsandSectionDelete();
    }

    @And("Delete departments")
    public void deleteDepartments() {

        ogc.DepartmentsDelete();
    }

}
