package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {
    public DialogContent() {
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


    private WebElement myElement;

    public void findAndSend(String strelement, String value) {

        switch (strelement) {

            case "username":
                myElement = Username;
                break;
            case "password":
                myElement = Password;
                break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strelement) {

        switch (strelement) {

            case "LoginButton":
                myElement = LoginButton;
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

}