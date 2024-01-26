package com.andrest.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.andrest.Utils.Constants.*;
import static com.andrest.targets.BillboardTargets.*;
import static com.andrest.targets.RegisterTargets.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class LoginForm implements Task {

    public static LoginForm fill() {
        return Instrumented.instanceOf(LoginForm.class).newInstance();
    }

    @Override
    @Step("{0} login successfully")
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(MENU_BUTTON),
                WaitUntil.the(PROFILE_BUTTON, isVisible())
        );
       actor.attemptsTo(
                Click.on(PROFILE_BUTTON),
                WaitUntil.the(EMAIL_INPUT, isVisible())
        );
        actor.attemptsTo(
                Click.on(EMAIL_INPUT),
                Enter.keyValues(EMAIL.getValue()).into(EMAIL_INPUT),
                Click.on(PASSWORD_INPUT),
                Enter.theValue(PASSWORD.getValue()).into(PASSWORD_INPUT),
                Click.on(LOGIN_BUTTON)

        );
    }
}
