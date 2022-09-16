package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Safak_Content extends Parent{

    public Safak_Content() {
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





    @FindBy(xpath = "//ms-add-button")
    private WebElement AddPlus;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;


    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement sendSearchName;

    @FindBy(xpath = "//span[@class='mat-button-wrapper'][1]")
    private WebElement SearchButton;

    @FindBy(xpath = "//ms-edit-button")
    private WebElement EditButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement Delete1Button;


    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement Delete2Button;

    private WebElement myElement;

    public void findAndSend(String strelement, String value) {

        switch (strelement) {

            case "username":
                myElement = Username;
                break;
            case "password":
                myElement = Password;
                break;
            case "nameInput":
                myElement = nameInput;
                break;

            case "codeInput":
                myElement = codeInput;
                break;
            case "sendSearchName":
                myElement = sendSearchName;
                break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strelement) {

        switch (strelement) {

            case "LoginButton":
                myElement = LoginButton;
                break;
            case "AddPlus":
                myElement = AddPlus;
                break;

            case "saveButton":
                myElement = saveButton;
                break;

            case "SearchButton":
                myElement = SearchButton;
                break;

            case "EditButton":
                myElement = SearchButton;
                break;

            case "Delete1Button":
                myElement = SearchButton;
                break;
            case "Delete2Button":
                myElement = SearchButton;
                break;

        }

        clickFunction(myElement);

    }


    public void findAndContainsText(String strelement, String text) {

        switch (strelement) {

            case "Dashboard":
                myElement = Dashboard;
                break;

        }

        VerifyContainsText(myElement, text);
    }

    public void SearchButton() {
        Actions action = new Actions(GWD.getDriver());
        action.moveToElement(SearchButton).click().build().perform();
    }

    public void editaction() {
        Actions action = new Actions(GWD.getDriver());
        action.moveToElement(EditButton).click().build().perform();


    }

    public void deleteaction() {

        Actions action = new Actions(GWD.getDriver());
        action.moveToElement(Delete1Button).click().build().perform();
    }

    public void delete2action() {

        Actions action = new Actions(GWD.getDriver());
        action.moveToElement(Delete2Button).click().build().perform();
    }


}
