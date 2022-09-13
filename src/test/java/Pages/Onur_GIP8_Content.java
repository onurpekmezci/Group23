package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Onur_GIP8_Content extends Parent {
    public Onur_GIP8_Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//mat-select")
    private WebElement SchoolClick;

    @FindBy(xpath = "(//div//mat-option)[2]")
    private WebElement SchoolSelect;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,\"TITLE.ADD\")]")
    private WebElement AddButton;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement NameInput;

    @FindBy(xpath = "(//ms-text-field//input)[2]")
    private WebElement CodeInput;

    @FindBy(css = "[placeholder=\"GENERAL.FIELD.KEY\"]>input")
    private WebElement KeyInput;

    @FindBy(css = "[placeholder=\"GENERAL.FIELD.VALUE\"]>input")
    private WebElement ValueInput;

    @FindBy(xpath = "//div//span[text()='Section']")
    private WebElement SectionButton;
    @FindBy(xpath = "//div//span[text()='School Department']")
    private WebElement DepartmentButton;
    @FindBy(xpath = "//div//span[text()='Department Constants']")
    private WebElement DepConsButton;

    @FindBy(id = "mat-slide-toggle-12-input")
    private WebElement ActiveCheckbox;

    @FindBy(id = "mat-slide-toggle-13-input")
    private WebElement SectionActiveCheckbox;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement SaveButton;

    @FindBy(xpath = "//ms-button")
    private WebElement GridAddButton;
    @FindBy(xpath = "//ms-button//button")
    private WebElement recordEditButton;
    @FindBy(xpath = "(//tbody//td//following::button)[1]")
    private WebElement GridEditButton;

    @FindBy(css = "[id=\"ms-table-1\"]")
    private WebElement gridTable;

    @FindBy(xpath = "//school-department-dialog")
    private WebElement departmentDialog;
    @FindBy(xpath = "//div[@class='cdk-overlay-pane']//ms-edit-button//button")
    private WebElement DialogEditButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement SuccessDialog;
    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExists;


    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement DepartmentsDeleteButton;
    @FindBy(xpath = "//mat-dialog-container//ms-delete-button//button")
    private WebElement DialogDeleteButton;

    @FindBy(xpath = "(//mat-dialog-actions//button)[3]")
    private WebElement DeleteAcceptButton;

    @FindBy(xpath = "(//mat-dialog-actions//button)[2]")
    private WebElement DeleteAcceptButton2;
    WebElement SendElement = null;

    public void FindAndClick(String element) {

        switch (element) {

            case "SchoolClick":
                SendElement = SchoolClick;
                break;
            case "SchoolSelect":
                SendElement = SchoolSelect;
                break;
            case "AddButton":
                SendElement = AddButton;
                break;
            case "SectionButton":
                SendElement = SectionButton;
                break;
            case "DepConsButton":
                SendElement = DepConsButton;
                break;
            case "ActiveCheckbox":
                SendElement = ActiveCheckbox;
                break;
            case "SectionActiveCheckbox":
                SendElement = SectionActiveCheckbox;
                break;
            case "SaveButton":
                SendElement = SaveButton;
                break;
            case "GridAddButton":
                SendElement = GridAddButton;
                break;
            case "GridEditButton":
                SendElement = GridEditButton;
                break;
            case "DepartmentButton":
                SendElement = DepartmentButton;
                break;
            case "DialogEditButton":
                SendElement = DialogEditButton;
                break;
            case "recordEditButton":
                SendElement = recordEditButton;
                break;
            case "DialogDeleteButton":
                SendElement = DialogDeleteButton;
                break;
            case "DeleteAcceptButton":
                SendElement = DeleteAcceptButton;
                break;
            case "DepartmentsDeleteButton":
                SendElement = DepartmentsDeleteButton;
                break;
            case "DeleteAcceptButton2":
                SendElement = DeleteAcceptButton2;
                break;
        }

        if (SendElement == SchoolClick) {
            waitUntilTexttobe();

        } else if (SendElement == GridEditButton) {
            waitUntilLoading();
        }

        clickFunction(SendElement);

        if (SendElement == DepConsButton) {

            Actions act = new Actions(GWD.getDriver());
            act.moveToElement(SectionButton).click().build().perform();
            act.moveToElement(DepConsButton).click().build().perform();

        }



    }

    public void findAndContainsText(String strelement, String text) {

        switch (strelement) {


            case "SuccessDialog":
                SendElement = SuccessDialog;
                break;
            case "NameInput":
                SendElement = NameInput;
                break;
            case "CodeInput":
                SendElement = CodeInput;
                break;
            case "KeyInput":
                SendElement = KeyInput;
                break;
            case "ValueInput":
                SendElement = ValueInput;
                break;

        }

        VerifyContainsText(SendElement, text);
    }

    public void FindAndSend(String element, String value) {

        switch (element) {

            case "NameInput":
                SendElement = NameInput;
                break;
            case "CodeInput":
                SendElement = CodeInput;
                break;
            case "KeyInput":
                SendElement = KeyInput;
                break;
            case "ValueInput":
                SendElement = ValueInput;
                break;

        }

        sendKeysFunction(SendElement, value);

    }

    public void ConstantsandSectionDelete() {

       waitUntilLoading();

        FindAndClick("DialogDeleteButton");
        FindAndClick("DeleteAcceptButton");

    }

    public void DepartmentsDelete() {

        waitUntilLoading();
        FindAndClick("DepartmentsDeleteButton");
        FindAndClick("DeleteAcceptButton2");

    }

}
