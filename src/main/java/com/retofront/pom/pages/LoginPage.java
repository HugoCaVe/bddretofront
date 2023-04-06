package com.retofront.pom.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    @FindBy(id = "user-name")
    private WebElementFacade txtUser;

    @FindBy(id = "password")
    private WebElementFacade txtPassword;

    @FindBy(id = "login-button")
    private WebElementFacade btnLogin;

    @FindBy(className = "error-message-container error")
    private WebElementFacade lblErrorMessage;

    public boolean validateUser() {
        return txtUser.isDisplayed();
    }

    public boolean validatePassword() {
        return txtPassword.isDisplayed();
    }

    public void selectUserField() {
        txtUser.waitUntilClickable().click();
    }

    public void selectPasswordField() {
        txtPassword.waitUntilClickable().click();
    }

    public void setUserName(String user) {
      txtUser.sendKeys(user);
    }

    public void setPassword(String pass) {
        txtPassword.sendKeys(pass);
    }

    public void sendInformation() {
        btnLogin.click();
    }

    public String getErrorInformation() {
        return getDriver()
                .findElement(
                        By.xpath(
                                "//div[contains(@class, 'error-message-container error')]"))
                .getText();
    }

    public Boolean checkMainPage() {
        return getDriver()
                .findElement(
                        By.xpath(
                                "//*[@class='app_logo']"))
                .isDisplayed();
    }
}
