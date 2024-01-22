package com.andrest.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.andrest.targets.LocationTargets.CLOSE_LOCATION_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchMovieStepDefinition {

    @Given("{actor} close the location view and select movie")
    public void searchMovie(Actor actor) {
        //Test
    closeLocationView(actor);

    }

    private void closeLocationView(Actor actor) {
        actor.attemptsTo(
                Click.on(CLOSE_LOCATION_BUTTON),
                WaitUntil.the(CLOSE_LOCATION_BUTTON, isVisible())
        );
    }

    @Then("I can see the view")
    public void seeScreen() {

    }

}
