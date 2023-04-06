package com.retofront.pom.steps;

import com.retofront.pom.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static com.retofront.pom.utils.AssertionMessages.*;
import static com.retofront.pom.utils.Constants.EMPTY_FIELD;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;


public class LoginStep {
    @Page
    LoginPage loginpage;
    @Step
    public void shouldInstantiatedPageObjectsForAWebTest() {
        loginpage.open();
    }
    @Step
    public void validateScreenInformation() {
        assertThat(ERROR_VALUE_NOT_FOUND.getValue(), loginpage.validateUser());
        assertThat(ERROR_VALUE_NOT_FOUND.getValue(), loginpage.validatePassword());
    }
    @Step
    public void validateUserInformation(String userName) {
      loginpage.selectUserField();
      if(!userName.equals(EMPTY_FIELD.getValue())) {
          loginpage.setUserName(userName);
      }
    }

    @Step
    public void validatePasswordInformation(String pasword) {
        loginpage.selectPasswordField();
        if (!pasword.equals(EMPTY_FIELD.getValue())) {
             loginpage.setPassword(pasword);
        }
    }

    @Step
    public void submitLoginInformation() {
        loginpage.sendInformation();
    }

    @Step
    public void validateLoginMessage(String message) {
        assertThat(
                ERROR_VALIDATE_CONTENT.getValue(),
                loginpage.getErrorInformation(),
                containsString(message));
    }

    @Step
    public void verifyStorePageIsDisplayed() {
        assertThat(
                ERROR_MAIN_PAGE_NOT_FOUND.getValue(), loginpage.checkMainPage());
    }
}
