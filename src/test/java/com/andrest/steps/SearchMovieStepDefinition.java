package com.andrest.steps;

import com.andrest.tasks.SelectCity;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.andrest.targets.BillboardTargets.*;
import static com.andrest.targets.LocationTargets.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchMovieStepDefinition {

    @Given("{actor} is on the main page")
    public void searchMovie(Actor actor) {
        //Test
    closeLocationView(actor);
    selectCity();
    //selectMovie();
    }

    @Step
    private void closeLocationView(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(CLOSE_LOCATION_BUTTON, isVisible()).forNoMoreThan(10).seconds()
        );
        actor.attemptsTo(
                Click.on(CLOSE_LOCATION_BUTTON),
                WaitUntil.the(SELECT_CITY_INPUT, isVisible())
        );
    }

    @Step
    private void selectCity() {
        theActorInTheSpotlight().attemptsTo(
                SelectCity.andSelectBogota()
        );
    }


    private void selectMovie(){
        theActorInTheSpotlight().attemptsTo(
                Click.on(FIRST_MOVIE)
        );


        theActorInTheSpotlight().attemptsTo(
                Click.on(SELECT_HOUR),
                WaitUntil.the(EMAIL_INPUT, isVisible())
        );
    }

    @Then("I can see the view")
    public void seeScreen() {

    }



}
