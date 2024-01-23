package com.andrest.targets;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LocationTargets {

    public static Target CLOSE_LOCATION_BUTTON = Target.the("Close location Button").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"CONTINUAR SIN LOCALIZACIÓN\"]"));
    public static Target SELECT_CITY_INPUT = Target.the("Select city input").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Ciudad *\"]"));
    public static Target SELECT_CITY = Target.the("Select Bogota city").located(AppiumBy.xpath("//android.view.View[@content-desc=\"Bogota\"]"));
    public static Target CONTINUE_BUTTON = Target.the("Continue button").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"CONTINUAR\"]"));

}
