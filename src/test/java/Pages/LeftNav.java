package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

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
//-------------------------------------------------------------//
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupClick;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private WebElement positionClick;

//-----------------------------------------------------------//
    @FindBy(xpath = "//span[text()='Employees']")
    private WebElement Employees;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement SchoolSetup;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement SchoolDepartments;

    private  WebElement myElement;
    public void findAndClick(String strElement){
        switch (strElement){
            case "SetupOne": myElement=SetupOne; break;
            case "Parameters":myElement=Parameters; break;
            case "Countries" :myElement=Countries; break;
            case "Citizenships" :myElement=Citizenships; break;
            case "Nationality" :myElement=nationalities; break;
            case "Fees" :myElement=Fees; break;
            case "EntranceExams1" :myElement=EntranceExams1; break;
            case "EntranceExams2" :myElement=EntranceExams2; break;
            case "SetupTwo" :myElement=SetupTwo; break;
            case "HumanResources" :myElement=HumanResources; break;
            case "EmployeeLink" :myElement=Employees; break;
            case "SchoolSetup" :myElement=SchoolSetup; break;
            case "SchoolDepartments" :myElement=SchoolDepartments; break;
            case "setupClick":myElement=setupClick;break;
            case "positionClick":myElement=positionClick;break;

        }

        clickFunction(myElement);
    }

    public void findAndSend(String strElement,String value){
        switch (strElement){


        }
        sendKeysFunction(myElement,value);
    }

    public void verifyText(String strElement,String text){
        switch (strElement){



        }
        VerifyContainsText(myElement,text);
    }
}
