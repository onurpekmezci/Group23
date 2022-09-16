package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    private WebElement myElement;

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement SetupOne;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement Countries;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement Parameters;

    @FindBy(xpath = "//span[text()='Citizenships']")
    private WebElement Citizenships;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "//span[text()='Fees']")
    private WebElement Fees;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement EntranceExams1;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement EntranceExams2;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement SetupTwo;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HRlink;
    @FindBy(xpath = "//span[text()='Employees']")
    private WebElement Employees;

    //Onur locator
    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement SchoolSetup;
    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement SchoolDepartments;

    //    @FindBy(xpath = "//span[text()='Departments']")
//    private WebElement Departments;
    @FindBy(xpath = "//span[text()='Fields']")
    private WebElement Fields;
    @FindBy(xpath = "//*[text()='Bank Accounts']")
    private WebElement Bankaccounts;
    @FindBy(xpath = "//span[text()='Document Types'][1]")
    private WebElement DocumentTypes;
    public void findAndClick(String Strelement) {
        switch (Strelement) {
            case "SetupOne":
                myElement = SetupOne;
                break;
            case "Parameters":
                myElement = Parameters;
                break;
            case "Countries":
                myElement = Countries;
                break;
            case "Citizenships":
                myElement = Citizenships;
                break;
            case "Nationality":
                myElement = nationalities;
                break;
            case "Fees":
                myElement = Fees;
                break;
            case "EntranceExams1":
                myElement = EntranceExams1;
                break;
            case "EntranceExams2":
                myElement = EntranceExams2;
                break;
            case "SetupTwo":
                myElement = SetupTwo;
                break;
            case "HRlink":
                myElement = HRlink;
                break;
            case "EmployeeLink":
                myElement = Employees;
                break;
            case "Fields":
                myElement = Fields;
                break;
            case "SchoolSetup":
                myElement = SchoolSetup;
                break;
            case "SchoolDepartments":
                myElement = SchoolDepartments;
                break;
            case "Bankaccounts":
                myElement = Bankaccounts;
                break;
                case "DocumentTypes":
                myElement = DocumentTypes;
                break;
            //   case "Departments" :myElement=Departments; break;

        }

        clickFunction(myElement);
    }


}
