package com.qvision.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features/register.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "reto.automatizacion.stepsdefinitions"
)
public class RegisterRunner {


}

