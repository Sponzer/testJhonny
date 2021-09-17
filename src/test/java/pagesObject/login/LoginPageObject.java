package pagesObject.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPageObject extends PageObject {

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    private WebElementFacade loginBtn;

    @FindBy(name = "login.username")
    private WebElementFacade userNameTxt;

    @FindBy(name = "login.password")
    private WebElementFacade passwordTxt;

    public void goToUrl(){
        loginBtn.click();
    }

    public void setCredentials(String username, String password){
        userNameTxt.sendKeys(username);
        passwordTxt.sendKeys(password);
        loginBtn.click();
    }

}
