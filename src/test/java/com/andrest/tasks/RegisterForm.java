package com.andrest.tasks;

import com.andrest.Utils.ScrollUtils;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.andrest.Utils.Constants.*;
import static com.andrest.targets.RegisterTargets.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class RegisterForm implements Task {

    public static RegisterForm fill() {
        return Instrumented.instanceOf(RegisterForm.class).newInstance();
    }

    @Override
    @Step("{0} Fill register form")
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(NAME_INPUT, isVisible()).forNoMoreThan(5).seconds()
        );

        actor.attemptsTo(
                Enter.theValue(NEW_NAME.getValue()).into(NAME_INPUT),
                Click.on(LAST_NAME_INPUT),
                Enter.theValue(LAST_NAME.getValue()).into(LAST_NAME_INPUT),
                Click.on(CREATE_EMAIL_INPUT),
                Enter.theValue(NEW_EMAIL.getValue()).into(CREATE_EMAIL_INPUT),
                Click.on(CONFIRM_EMAIL_INPUT),
                Enter.theValue(NEW_EMAIL.getValue()).into(CONFIRM_EMAIL_INPUT),
                Click.on(PHONE_INPUT),
                Enter.theValue(PHONE.getValue()).into(PHONE_INPUT),
                Click.on(ADDRESS_INPUT),
                Enter.theValue(ADDRESS.getValue()).into(ADDRESS_INPUT),

                Click.on(BIRTHDATE_INPUT),
                Click.on(SELECT_YEAR_OPTION),
                Click.on(SELECT_YEAR),
                Click.on(ACCEPT_BIRTHDATE),
                Click.on(DOCUMENT_NUMBER_INPUT),
                Enter.theValue(DOCUMENT_NUMBER.getValue()).into(DOCUMENT_NUMBER_INPUT)
        );
        ScrollUtils.scrollToElementWithText(actor, "Los campos");
        actor.attemptsTo(
                Click.on(PREFER_THEATER_INPUT),
                Click.on(THEATER_MULTIPLAZA),
                Click.on(CREATE_PASSWORD_INPUT),
                Enter.theValue(PASSWORD.getValue()).into(CREATE_PASSWORD_INPUT),
                Click.on(TERM_AND_CONDITIONS),
                Click.on(CONTINUE_REGISTER_BUTTON)
        );
    }
}
