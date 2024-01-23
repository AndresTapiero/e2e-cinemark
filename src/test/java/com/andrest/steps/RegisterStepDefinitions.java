package com.andrest.steps;

import com.andrest.tasks.RegisterForm;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.andrest.targets.BillboardTargets.*;
import static com.andrest.targets.RegisterTargets.NAME_INPUT;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegisterStepDefinitions {

    @When("create a new user")
    public void createNewUser() {
        selectProfile();
        createAccount();
    }


    @Step
    private void selectProfile() {

        theActorInTheSpotlight().attemptsTo(
                Click.on(MENU_BUTTON),
                WaitUntil.the(PROFILE_BUTTON, isVisible())
        );
        theActorInTheSpotlight().attemptsTo(
                Click.on(PROFILE_BUTTON),
                WaitUntil.the(REGISTER_BUTTON, isVisible())
        );
        theActorInTheSpotlight().attemptsTo(
                Click.on(REGISTER_BUTTON),
                WaitUntil.the(NAME_INPUT, isVisible())
        );

    }

    private void createAccount(){
        theActorInTheSpotlight().attemptsTo(
                RegisterForm.fill()
        );
    }


    @Then("see the billboard view")
    public void seeScreen() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(BILLBOARD_TITLE, isVisible())
        );
    }
}
