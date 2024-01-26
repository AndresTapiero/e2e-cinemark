package com.andrest.Utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.time.Duration;

public class Wait implements Task {
    private final Duration duracion;

    public Wait(Duration duration) {
        this.duracion = duration;
    }

    public static Performable to(Duration duracion) {
        return Tasks.instrumented(Wait.class, duracion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(duracion.toMillis());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Error waiting....", e);
        }
    }
}
