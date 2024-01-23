package com.andrest.targets;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class BillboardTargets {

    public static Target BILLBOARD_TITLE = Target.the("Billboard title").located(AppiumBy.xpath("//android.view.View[@content-desc=\"Cartelera\"]"));
    public static Target FIRST_MOVIE = Target.the("Movie").located(AppiumBy.xpath("//android.view.View/android.view.View[2]/android.view.View[7]/android.view.View/android.view.View[1]"));
    public static Target DUBBED_TITLE = Target.the("Select Date").located(AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Doblada\"]"));
    public static Target SELECT_HOUR = Target.the("Select Hour").located(AppiumBy.xpath("//android.view.View[@content-desc=\"17:35 PM\"]"));

    // Login
    public static Target EMAIL_INPUT = Target.the("Email input").located(AppiumBy.xpath("//android.view.View[2]/                       android.widget.EditText[1]"));
    public static Target PASSWORD_INPUT = Target.the("Password input").located(AppiumBy.xpath("//android.view.View[2]/android.widget.EditText[2]"));
    public static Target LOGIN_BUTTON = Target.the("Login button").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"INICIAR SESIÓN\"]"));

    //MENU
    public static Target MENU_BUTTON = Target.the("Menu button").located(AppiumBy.xpath("//android.view.View[contains(@content-desc, 'Menu')]"));
    public static Target PROFILE_BUTTON = Target.the("Profile button").located(AppiumBy.xpath("//android.view.View[contains(@content-desc, 'Perfil')]"));
    public static Target REGISTER_BUTTON = Target.the("Register button").located(AppiumBy.xpath("//android.view.View[@content-desc=\"Registrarse\"]"));

    //Movie
    public static Target TITLE_PRICES = Target.the("Title prices").located(AppiumBy.xpath("//android.view.View[contains(@content-desc, 'TARIFAS Pestaña 1 de 2')]"));

    public static Target BONO = Target.the("Title prices").located(AppiumBy.xpath("//android.view.View[contains(@content-desc, 'CINEBONO')]"));
    //public static Target GENERAL_BUTTON_MORE = Target.the("General seat").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"General 3D $ 7.900 2\"]/following-sibling::android.widget.Button[2]"));
    public static Target GENERAL_BUTTON_MORE = Target.the("General seat").located(AppiumBy.xpath("//android.view.View[@content-desc=\"General 3D $ 7.900 2\"]/following-sibling::android.widget.Button[2]"));
    public static Target PRICE = Target.the("Price").located(AppiumBy.xpath("//android.view.View[@content-desc=\"$ 15.800\"]"));
    public static Target CONTINUE_BUTTON = Target.the("Continue button").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"CONTINUAR\"]"));
    public static Target SCREEN_TITLE = Target.the("Screen title").located(AppiumBy.xpath("//android.view.View[@content-desc=\"Pantalla\"]"));
    public static Target SEAT_1 = Target.the("Select seat 1").located(AppiumBy.xpath("//android.view.View[2]/android.view.View[6]/android.view.View[552]"));
    public static Target SEAT_2 = Target.the("Select seat 2").located(AppiumBy.xpath("//android.view.View[2]/android.view.View[6]/android.view.View[553]"));
    public static Target CONFECTIONERY_TITLE = Target.the("Confectionery title").located(AppiumBy.xpath("//android.view.View[@content-desc=\"CONFITERIA REGULAR\"]"));
    public static Target COMBO_MORE_BUTTON = Target.the("Combo more").located(AppiumBy.xpath("//android.view.View[@content-desc=\" COMBO TU Y YO APP IP $ 47.900 0\"]/android.view.View[2]"));
    public static Target TOTAL_TITLE = Target.the("Total title").located(AppiumBy.xpath("//android.view.View[@content-desc=\"Total\"]"));
    public static Target BILLING_TITLE = Target.the("Billing title").located(AppiumBy.xpath("//android.view.View[@content-desc=\"Datos de facturación\"]"));

    public static Target CITY_INPUT = Target.the("City input").located(AppiumBy.xpath("//android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[4]"));
    public static Target TERMS_AND_CONDITION = Target.the("Terms and conditions").located(AppiumBy.xpath("//android.view.View[2]/android.view.View/android.view.View[2]"));
    public static Target SELECT_CITY = Target.the("Select Bogotá").located(AppiumBy.xpath("//android.view.View[@content-desc=\"BOGOTA D.C., BOGOTÁ\"]"));


}
