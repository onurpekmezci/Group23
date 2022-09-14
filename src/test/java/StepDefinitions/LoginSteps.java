package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {

    DialogContent dialog = new DialogContent();

    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();
        dialog.findAndClick("AcceptCookies");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dialog.findAndSend("username", "richfield.edu");
        dialog.findAndSend("password", "Richfield2020!");
        dialog.findAndClick("LoginButton");

    }

    @Then("User should login successfuly")
    public void userShouldLoginSuccessfuly() {

        dialog.findAndContainsText("Dashboard","Dashboard");
    }
}
