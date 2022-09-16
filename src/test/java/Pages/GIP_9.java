package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GIP_9 extends Parent{
    public GIP_9() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(id = "mat-input-0")
    private WebElement Username;

    @FindBy(id = "mat-input-1")
    private WebElement Password;

    @FindBy(css = "button[aria-label=\"LOGIN\"]")
    private WebElement LoginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement Dashboard;

    @FindBy(xpath = "//*[@class=\"svg-inline--fa fa-plus\"]")
    private WebElement addbutton;

    @FindBy(xpath = "//*[@formcontrolname=\"name\"]/input")
    private WebElement nameinput;

    @FindBy(xpath = "//*[@formcontrolname=\"iban\"]/input")
    private WebElement IBAN;

    @FindBy(xpath = "(//*[text()='Currency'])[3]")
    private WebElement currency;

    @FindBy(xpath = "(//*[text()=' USD '])")
    private WebElement USD;

    @FindBy(xpath = "//*[@formcontrolname=\"integrationCode\"]/input")
    private WebElement intcode;

    @FindBy(xpath = "//*[text()='Save']")
    private WebElement save;


    @FindBy(xpath = "//*[@data-icon=\"square-xmark\"]")
    private WebElement closebutton;


    @FindBy(xpath = "//*[@placeholder=\"GENERAL.FIELD.NAME\"]/input")
    private WebElement searchName;

    @FindBy(xpath = "//*[@style=\"visibility: visible;\"]")
    private WebElement searchbutton;

    @FindBy(xpath = "//*[@data-icon=\"pen-to-square\"]")
    private WebElement editbutton;


    @FindBy(xpath = "//*[@data-icon=\"trash-can\"]")
    private WebElement  deleteaccount;



    @FindBy(xpath = "//*[text()=' Delete ']")
    private WebElement  confirmdelete;



    private WebElement myElement;


    public void findAndSend(String strelement, String value) {
        switch (strelement) {

            case "username": myElement = Username;break;
            case "password": myElement = Password;break;}
        sendKeysFunction(myElement, value);
    }
    public void findAndClick(String strelement) {

        switch (strelement) {
            case "LoginButton": myElement = LoginButton;break;
            case "addbutton": myElement=addbutton;break;
            case "currency": myElement=currency;break;
            case "USD": myElement=USD;break;
            case "save":myElement=save;break;
            case "searchbutton":myElement=searchbutton;break;
            case "closebutton":myElement=closebutton;break;
            case "editbutton":myElement=editbutton;break;
            case "deleteaccount":myElement=deleteaccount;break;
            case "confirmdelete":myElement=confirmdelete;break;

        }

        clickFunction(myElement);

    }

       public void typeNameinput(){
        sendKeysFunction(nameinput,"TT");

       }
       public void typeIBAN(){
        sendKeysFunction(IBAN,"TR");

       }

       public void typeintcode(){
        sendKeysFunction(intcode,"123");


       }
       public void findcreatedname(){
        sendKeysFunction(searchName,"TT");

       }
       public void editintcode() {
        sendKeysFunction(intcode,"123s");


       }



        public void findAndContainsText(String strelement, String text) {

        switch (strelement) {

            case "Dashboard": myElement = Dashboard;break;

        }

        VerifyContainsText(myElement, text);
    }

}
