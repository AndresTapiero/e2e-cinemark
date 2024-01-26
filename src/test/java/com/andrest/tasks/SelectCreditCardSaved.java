package com.andrest.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.andrest.Utils.Constants.CVV;
import static com.andrest.targets.BillingDataTargets.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectCreditCardSaved implements Task {

    public static SelectCreditCardSaved pressCard() {
        return Instrumented.instanceOf(SelectCreditCardSaved.class).newInstance();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CREDIT_CARD_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SAVED_CARDS),

                WaitUntil.the(VISA_CARD, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(VISA_CARD),
                Click.on(VISA_CVV_INPUT),
                Enter.theValue(CVV.getValue()).into(VISA_CVV_INPUT),
                Click.on(PAY_BUTTON)
        );

        actor.attemptsTo(
                WaitUntil.the(PAGE_RESUME, isVisible()).forNoMoreThan(70).seconds(),
                WaitUntil.the(QR_CODE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_FINISH)
        );
    }

}
