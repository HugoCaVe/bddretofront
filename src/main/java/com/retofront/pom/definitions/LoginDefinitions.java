package com.retofront.pom.definitions;

import com.retofront.pom.steps.LoginStep;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitions {
    @Steps
    LoginStep loginStep;

    @Dado("que se ingresó a la página de www.saucedemo.com")
    public void enterThePage() {
        loginStep.shouldInstantiatedPageObjectsForAWebTest();
    }

    @Dado("que se valida que se cargue los elementos para realizar el login")
    public void validatePageinformation() {
        loginStep.validateScreenInformation();
    }

    @Cuando("en el campo Username ingreso (.*)$")
    public void validateUserField(String user) {
          loginStep.validateUserInformation(user);
    }

    @Cuando("en el campo Password ingreso (.*)$")
    public void validatePasswordField(String password) {
        loginStep.validatePasswordInformation(password);
    }

    @Cuando("envío la solicitud")
    public void sendRequest() {
        loginStep.submitLoginInformation();
    }

    @Entonces("se muestra el mensaje (.*)$")
    public void messageDisplayed(String messageInformation) {
        loginStep.validateLoginMessage(messageInformation);
    }

    @Entonces("no se permite el ingreso")
    public void noSePermiteElIngreso() {

    }

    @Entonces("permite el ingreso")
    public void goToTheStorePage() {
        loginStep.verifyStorePageIsDisplayed();
    }
}
