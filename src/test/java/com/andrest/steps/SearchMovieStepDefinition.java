package com.andrest.steps;

import com.andrest.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.andrest.targets.BillboardTargets.BILLBOARD_TITLE;
import static com.andrest.targets.LocationTargets.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchMovieStepDefinition {

    @Given("{actor} is on the main page")
    public void searchMovie(Actor actor) {
    closeLocationView(actor);
    selectCity();
    }

    @And("log in with correct credentials")
    public void login() {
        theActorInTheSpotlight().attemptsTo(
                LoginForm.fill()
        );
    }

    @Step("close location view")
    private void closeLocationView(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(CLOSE_LOCATION_BUTTON, isVisible()).forNoMoreThan(20).seconds()
        );
        actor.attemptsTo(
                Click.on(CLOSE_LOCATION_BUTTON),
                WaitUntil.the(SELECT_CITY_INPUT, isVisible())
        );
    }

    @Step("Select city")
    private void selectCity() {
        theActorInTheSpotlight().attemptsTo(
                SelectCity.andSelectBogota()
        );
    }


    @When("select a movie")
    public void selectMovie() {
        theActorInTheSpotlight().attemptsTo(
                SelectMovie.select()
        );
    }

    @And("add the payment method")
    public void addPaymentMethod() {
        theActorInTheSpotlight().attemptsTo(
                SelectCreditCardSaved.pressCard()
        );
    }

    @Then("can see the billboard view")
    public void seeScreen() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(BILLBOARD_TITLE, isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(BILLBOARD_TITLE, isVisible())
        );
    }

}
