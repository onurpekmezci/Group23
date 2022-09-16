package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Huseyin_GIP_5_Content extends Parent {
    public Huseyin_GIP_5_Content() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
//----------------------------------------------------------//
    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement HumanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupClick;

    @FindBy(xpath = "(//span[text()='Positions'])[1]")
    private WebElement positionClick;
//-------------------------------------------------------------//
    @FindBy(id = "mat-input-0")
    private WebElement Username;

    @FindBy(id = "mat-input-1")
    private WebElement Password;

    @FindBy (xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD.NAME')])[1]//input")
    private WebElement nameInput1;

    @FindBy (xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD.NAME')])[2]//input")
    private WebElement nameInput2;

    @FindBy (xpath = "(//ms-text-field[contains(@placeholder,'GENERAL.FIELD.SHORTNAME')])[2]//input")
    private WebElement shortName2;

    @FindBy (xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    private WebElement saveButton;

    @FindBy (xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy (xpath = "//span[text()='Search']")
    private WebElement searchButton;

    @FindBy (xpath = "(//span[@class='mat-button-wrapper'])[12]//fa-icon")
    private WebElement editButton;

    @FindBy (xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy (xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteClick;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement LoginButton;

    @FindBy(xpath = " //button[text()='Accept all cookies']")
    private WebElement AcceptCookies;

    @FindBy (xpath = "(//span[@class='mat-button-wrapper'])[10]//fa-icon")
    private WebElement createButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement Dashboard;



    WebElement myElement;

    public void findAndSend(String strelement, String value) {
        switch (strelement) {
            case "username":myElement=Username;break;
            case "password":myElement=Password;break;
            case "nameInput1":myElement=nameInput1;break;
            case "nameInput2":myElement=nameInput2;break;
            case "shortName2":myElement=shortName2;break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strelement) {
        switch (strelement) {
            case "LoginButton":myElement = LoginButton;break;
            case "AcceptCookies":myElement=AcceptCookies;break;
            case "createButton":myElement=createButton;break;
            case "saveButton":myElement=saveButton;break;
            case "searchButton":myElement=searchButton;break;
            case "editButton":myElement=editButton;break;
            case "deleteButton":myElement=deleteButton;break;
            case "deleteClick":myElement=deleteClick;break;
            case "HumanResources":myElement=HumanResources;break;
            case "setupClick":myElement=setupClick;break;
            case "positionClick":myElement=positionClick;break;


        }
        clickFunction(myElement);
    }


    public void findAndContainsText(String strelement, String text) {
        switch (strelement) {
            case "Dashboard":myElement = Dashboard;break;
            case "successMessage":myElement=successMessage;break;
        }
        VerifyContainsText(myElement, text);
    }

}
