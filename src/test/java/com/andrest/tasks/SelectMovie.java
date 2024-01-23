package com.andrest.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.andrest.targets.BillboardTargets.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectMovie implements Task {

    public static SelectMovie selectFirst() {
        return Instrumented.instanceOf(SelectMovie.class).newInstance();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BILLBOARD_TITLE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(FIRST_MOVIE),
                WaitUntil.the(DUBBED_TITLE, isVisible()),
                Click.on(SELECT_HOUR)


        );
        System.out.print("wait ");
        actor.attemptsTo(

                WaitUntil.the(BONO, isVisible()).forNoMoreThan(10).seconds(),
                //Click.on(BONO),
                //Click.on(TITLE_PRICES),
                Click.on(GENERAL_BUTTON_MORE)
                //VALIDATE PRICE OF THE cart
                //Click.on(CONTINUE_BUTTON)
        );
        System.out.print("waitaaaa ");

        //select seats
        actor.attemptsTo(
                WaitUntil.the(SCREEN_TITLE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SEAT_1),
                Click.on(SEAT_2),
                Click.on(CONTINUE_BUTTON)
        );

        //Select comb
        actor.attemptsTo(
                WaitUntil.the(CONFECTIONERY_TITLE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(COMBO_MORE_BUTTON),
                Click.on(CONTINUE_BUTTON)

        );

        //See Cart
        actor.attemptsTo(
                WaitUntil.the(TOTAL_TITLE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CONTINUE_BUTTON)
        );

        //Add city
        actor.attemptsTo(
                WaitUntil.the(BILLING_TITLE, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(CITY_INPUT),
                Enter.theValue("BOGOTA").into(CITY_INPUT),
                WaitUntil.the(SELECT_CITY, isVisible()),
                Click.on(SELECT_CITY),
                Click.on(TERMS_AND_CONDITION),
                Click.on(CONTINUE_BUTTON)
        );

    }


}
