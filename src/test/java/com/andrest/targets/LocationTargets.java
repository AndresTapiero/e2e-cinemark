package com.andrest.targets;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class LocationTargets {

    public static Target CLOSE_LOCATION_BUTTON = Target.the("Close location Button").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"CONTINUAR SIN LOCALIZACIÓN\"]"));
    public static Target SELECT_CITY = Target.the("Close location Button").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"CONTINUAR SIN LOCALIZACIÓN\"]"));

}
