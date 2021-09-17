package pagesObject.landing;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LandingPageObject extends PageObject {

    @FindBy(xpath = "//span[contains(text(),'for Galen Framework')]")
    private WebElementFacade titleLab;

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    private WebElementFacade homeLink;

    @FindBy(xpath = "//a[contains(text(),'My Notes')]")
    private WebElementFacade myNotesLink;

    @FindBy(xpath = "//a[contains(text(),'About')]")
    private WebElementFacade aboutLink;

    @FindBy(xpath = "//a[contains(text(),'Contact')]")
    private WebElementFacade contactLink;

    @FindBy(xpath = "//button[contains(text(),'Add note')]")
    private WebElementFacade addNoteBtn;


    public WebElementFacade getHomeLink() {
        return homeLink;
    }

    public WebElementFacade getMyNotesLink() {
        return myNotesLink;
    }

    public WebElementFacade getAboutLink() {
        return aboutLink;
    }

    public WebElementFacade getContactLink() {
        return contactLink;
    }

    public WebElementFacade getAddNoteBtn() {
        return addNoteBtn;
    }
}