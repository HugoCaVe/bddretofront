package com.retofront.pom.runners.login;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/login/login_saucedemo.feature",
        glue = {"com.retofront.pom.definitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class LoginSaucedemoRunner {
}
