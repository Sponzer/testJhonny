package definitions.login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginSteps.LoginSteps;

public class LoginDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("^the user is in login screen$")
    public void theUserIsInLoginScreen() throws Exception {
        loginSteps.goToLoginScreen();
    }

    @When("^enters the username and password$")
    public void entersTheUsernameAndPassword() throws Exception {
        loginSteps.enterCredentials();
    }

    @Then("^should login in the web$")
    public void shouldLoginInTheWeb() throws Exception {
        loginSteps.verifyLandingPage();
    }

}
