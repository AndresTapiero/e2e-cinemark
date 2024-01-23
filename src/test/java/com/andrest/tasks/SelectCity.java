package com.andrest.tasks;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static com.andrest.targets.BillboardTargets.BILLBOARD_TITLE;
import static com.andrest.targets.LocationTargets.*;
import static com.andrest.targets.LocationTargets.CONTINUE_BUTTON;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCity implements Task {

    public static SelectCity andSelectBogota() {
        return Instrumented.instanceOf(SelectCity.class).withProperties();
    }

    @Override
    @Step("{0} Select city")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SELECT_CITY_INPUT),
                WaitUntil.the(SELECT_CITY, isVisible()),
                Click.on(SELECT_CITY),
                WaitUntil.the(CONTINUE_BUTTON, isVisible()),
                Click.on(CONTINUE_BUTTON),
                WaitUntil.the(BILLBOARD_TITLE, isVisible()).forNoMoreThan(20).seconds()
        );
    }
}

