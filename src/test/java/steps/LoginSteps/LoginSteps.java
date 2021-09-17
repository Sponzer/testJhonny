package steps.LoginSteps;

import net.thucydides.core.annotations.Step;
import org.testng.Assert;
import pagesObject.landing.LandingPageObject;
import pagesObject.login.LoginPageObject;

public class LoginSteps {

    LoginPageObject loginPageObject;
    LandingPageObject landingPageObject;

    @Step
    public void goToLoginScreen() {
        loginPageObject.open();
        loginPageObject.goToUrl();
    }

    @Step
    public void enterCredentials() {
        loginPageObject.setCredentials("testuser@example.com", "test123");
    }

    @Step
    public void verifyLandingPage() {
        String title;
        title = loginPageObject.getTitle();
        Assert.assertEquals(title, "Sample Website for Galen Framework");
        Assert.assertEquals(landingPageObject.getHomeLink().getText(), "Home");
        Assert.assertEquals(landingPageObject.getMyNotesLink().getText(), "My Notes");
        Assert.assertEquals(landingPageObject.getAboutLink().getText(), "About");
        Assert.assertEquals(landingPageObject.getContactLink().getText(), "Contact");
        Assert.assertEquals(landingPageObject.getAddNoteBtn().getText(), "Add note");
        Assert.assertEquals(landingPageObject.getAddNoteBtn().isClickable(), true);
    }
}
