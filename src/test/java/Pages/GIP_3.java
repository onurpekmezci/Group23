package Pages;

import Utilities.GWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GIP_3 extends Parent {
    public GIP_3() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "mat-input-0")
    private WebElement Username;

    @FindBy(id = "mat-input-1")
    private WebElement Password;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement LoginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement Dashboard;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[10]//fa-icon")
    private WebElement addDocument;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME'])[2]//input")
    private WebElement documentName;


    @FindBy(xpath = "(//span[text()='Stage'])[3]")
    private WebElement documentStage;


    @FindBy(xpath = "//span[contains(text(),'Certificate')]")
    private WebElement stageSertificate;

    @FindBy(xpath = "//textarea[@id='mat-input-11']")
    private WebElement descriptionButton;


    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")
    private WebElement saveDocument;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement searchDocument;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchButton;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[12]//fa-icon")
    private WebElement editDocument;


    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.NAME'])[2]//input")
    private WebElement editName;


    @FindBy(xpath = "//span[text()='Save']")
    private WebElement editSave;

    @FindBy(xpath = "(//span[@class='mat-button-wrapper'])[13]//fa-icon")
    private WebElement deleteDocument;

    @FindBy(xpath = "//span[text()=' Delete ']")
    private WebElement confirmDelete;

    private WebElement myElement;

    public void findAndSend(String strelement, String value) {

        switch (strelement) {

            case "username": myElement = Username;break;
            case "password": myElement = Password;break;
            case "documentName": myElement = documentName;break;
            case "editName": myElement = editName;break;
            case "searchDocument": myElement = searchDocument;break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strelement) {

        switch (strelement) {

            case "LoginButton": myElement = LoginButton;break;
            case "addDocument": myElement = addDocument;break;
            case "documentStage": myElement = documentStage;break;
            case "stageSertificate": myElement = stageSertificate;break;
            case "saveDocument": myElement = saveDocument;break;
            case "editDocument": myElement = editDocument;break;
            case "editSave": myElement = editSave;break;
            case "deleteDocument": myElement = deleteDocument;break;
            case "searchButton": myElement = searchButton;break;
            case "confirmDelete": myElement = confirmDelete;break;


        }


        clickFunction(myElement);

    }


    public void findAndContainsText(String strelement, String text) {

        switch (strelement) {

            case "Dashboard": myElement = Dashboard;break;

        }

        VerifyContainsText(myElement, text);
    }



    public void actionEsc() {
        Actions aksiyon = new Actions(GWD.getDriver());
        aksiyon.moveToElement(stageSertificate).keyDown(Keys.ESCAPE).build().perform();

    }
}