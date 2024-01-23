package com.andrest.targets;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class BillboardTargets {

    public static Target BILLBOARD_TITLE = Target.the("Billboard title").located(AppiumBy.xpath("//android.view.View[@content-desc=\"Cartelera\"]"));
    public static Target FIRST_MOVIE = Target.the("Movie").located(AppiumBy.xpath("//android.view.View/android.view.View[2]/android.view.View[7]/android.view.View/android.view.View[1]"));
    public static Target SELECT_DATE = Target.the("Select Date").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"Ene. 23 Mar.\"]"));
    public static Target SELECT_HOUR = Target.the("Select Hour").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"11:30 AM\"]"));

    // INICIAR SESION

    public static Target EMAIL_INPUT = Target.the("Email input").located(AppiumBy.xpath( "//android.view.View[1]/android.widget.EditText[1]"));
    public static Target PASSWORD_INPUT = Target.the("Password input").located(AppiumBy.xpath( "//android.view.View[2]/android.widget.EditText[2]"));
    public static Target LOGIN_BUTTON = Target.the("Login button").located(AppiumBy.xpath( "//android.widget.Button[@content-desc=\"INICIAR SESIÓN\"]"));


    //MENU
    public static Target MENU_BUTTON = Target.the("Menu button").located(AppiumBy.xpath( "//android.view.View[contains(@content-desc, 'Menu')]"));
    public static Target PROFILE_BUTTON = Target.the("Profile button").located(AppiumBy.xpath( "//android.view.View[contains(@content-desc, 'Perfil')]"));
    public static Target REGISTER_BUTTON = Target.the("Register button").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"Registrarse\"]"));



}
