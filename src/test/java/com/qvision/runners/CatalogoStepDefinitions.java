package com.qvision.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/CatalogoPrecioStepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.qvision.stepDefinitions"
)
public class CatalogoStepDefinitions {


}
