package com.andrest.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.andrest.Utils.Constants.*;
import static com.andrest.targets.BillingDataTargets.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BillingForm implements Task {

    public static BillingForm putData() {
        return Instrumented.instanceOf(BillingForm.class).newInstance();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(CREDIT_CARD_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CREDIT_CARD_BUTTON),
                WaitUntil.the(TITLE_CARDS, isVisible()).forNoMoreThan(10).seconds(),


                Click.on(CARD_NAME_INPUT),
                Enter.theValue(CARD_NAME.getValue()).into(CARD_NAME_INPUT),
                Click.on(CARD_NUMBER_INPUT),
                Enter.theValue(CARD_NUMBER.getValue()).into(CARD_NUMBER_INPUT),

                Click.on(CARD_EXPIRATION_INPUT),
                Enter.theValue(EXPIRATION_DATE.getValue()).into(CARD_EXPIRATION_INPUT),

                Click.on(CARD_CVV_INPUT),
                Enter.theValue(CVV.getValue()).into(CARD_CVV_INPUT),


                Click.on(PAY_BUTTON)

        );

        actor.attemptsTo(
                WaitUntil.the(PAGE_RESUME, isVisible()).forNoMoreThan(10).seconds(),
                WaitUntil.the(QR_CODE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_FINISH)
        );

    }

}
