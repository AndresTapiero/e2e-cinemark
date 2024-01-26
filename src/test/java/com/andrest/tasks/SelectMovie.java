package com.andrest.tasks;

import com.andrest.Utils.ScrollUtils;
import com.andrest.Utils.Wait;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.time.Duration;
import static com.andrest.targets.BillboardTargets.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectMovie implements Task {

    public static SelectMovie select() {
        return Instrumented.instanceOf(SelectMovie.class).newInstance();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BILLBOARD_TITLE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(MOVIE),
                WaitUntil.the(DUBBED_TITLE, isVisible()),
                Click.on(SELECT_HOUR)


        );

        actor.attemptsTo(
                WaitUntil.the(BONO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(GENERAL_BUTTON_MORE),
                Click.on(CONTINUE_BUTTON),
                WaitUntil.the(SCREEN_TITLE, isVisible()).forNoMoreThan(15).seconds()
        );

        //select seats
        actor.attemptsTo(
                waitFor(4000),
                Click.on(SEAT_1),
                Click.on(CONTINUE_BUTTON),
                WaitUntil.the(CONFECTIONERY_TITLE, isVisible()).forNoMoreThan(20).seconds()
        );

        //Select comb
        actor.attemptsTo(
                WaitUntil.the(COMBO_MORE_BUTTON, isVisible()),
                Click.on(COMBO_MORE_BUTTON)
        );


        if (UPDATE_BUTTON.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Click.on(UPDATE_BUTTON)
            );
        }

        //See Cart
        actor.attemptsTo(
                Click.on(CONTINUE_BUTTON),
                WaitUntil.the(TOTAL_TITLE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CONTINUE_BUTTON)
        );

        //Add city
        actor.attemptsTo(
                WaitUntil.the(BILLING_TITLE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CITY_INPUT),
                Enter.keyValues("BOGOTA D.C., BOGOTÁ").into(CITY_INPUT),
                Click.on(CITY_INPUT),
                Click.on(CITY_INPUT),
                waitFor(2000),
                WaitUntil.the(SELECT_CITY, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SELECT_CITY),
                Click.on(SELECT_CITY)

        );
        ScrollUtils.scrollToElementWithText(actor, "He revisa");
        actor.attemptsTo(
                WaitUntil.the(TERMS_AND_CONDITION, isVisible()),
                Click.on(TERMS_AND_CONDITION),
                Click.on(CONTINUE_BUTTON)
        );
    }

    private static Performable waitFor(long milisegundos) {
        return Tasks.instrumented(Wait.class, Duration.ofMillis(milisegundos));
    }
}
