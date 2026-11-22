package com.qvision.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed
    WebDriver driver;

    @Before
    public void setup(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Jeferson");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
    }

    @After
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
