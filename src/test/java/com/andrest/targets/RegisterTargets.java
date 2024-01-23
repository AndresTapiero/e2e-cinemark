package com.andrest.targets;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterTargets {

    public static Target REGISTER_TITLE = Target.the("Register title").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"Registrarse\"]"));
    public static Target REGISTER_BUTTON = Target.the("Register button").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"Registrarse\"]"));
    public static Target NAME_INPUT = Target.the("Name input").located(AppiumBy.xpath("//android.view.View[2]/android.widget.ScrollView/android.widget.EditText[1]"));

    public static Target LAST_NAME_INPUT = Target.the("Name input").located(AppiumBy.xpath("//android.view.View[2]/android.widget.ScrollView/android.widget.EditText[2]"));
    public static Target CREATE_EMAIL_INPUT = Target.the("Create email input").located(AppiumBy.xpath("//android.view.View[2]/android.widget.ScrollView/android.widget.EditText[3]"));
    public static Target CONFIRM_EMAIL_INPUT = Target.the("Confirm email input").located(AppiumBy.xpath("//android.view.View[2]/android.widget.ScrollView/android.widget.EditText[4]"));
    public static Target PHONE_INPUT = Target.the("Phone input").located(AppiumBy.xpath("//android.view.View[2]/android.widget.ScrollView/android.widget.EditText[5]"));
    public static Target ADDRESS_INPUT = Target.the("Address input").located(AppiumBy.xpath("//android.view.View[2]/android.widget.ScrollView/android.widget.EditText[6]"));
    public static Target BIRTHDATE_INPUT = Target.the("Birthdate input").located(AppiumBy.xpath("//android.view.View[2]/android.widget.ScrollView/android.view.View[3]"));
    public static Target SELECT_YEAR_OPTION = Target.the("Select year option").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Seleccionar año\"]"));
    public static Target SELECT_YEAR = Target.the("Select year").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"1999\"]"));
    public static Target ACCEPT_BIRTHDATE = Target.the("Accept birthday").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"ACEPTAR\"]\n"));
    public static Target DOCUMENT_NUMBER_INPUT = Target.the("Document number input").located(AppiumBy.xpath("//android.view.View[2]/android.widget.ScrollView/android.widget.EditText[7]"));
    public static Target PREFER_THEATER_INPUT = Target.the("Theater input").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Teatro de preferencia *\"]"));
    public static Target THEATER_MULTIPLAZA = Target.the("Theater Multiplaza").located(AppiumBy.xpath("//android.view.View[contains(@content-desc, 'Multiplaza')]"));

    public static Target CREATE_PASSWORD_INPUT = Target.the("Create password input").located(AppiumBy.xpath("//android.view.View[2]/android.widget.ScrollView/android.widget.EditText[6]"));

    public static Target TERM_AND_CONDITIONS = Target.the("Term and conditions").located(AppiumBy.xpath("//android.view.View[2]/android.widget.ScrollView/android.view.View[2]"));
    public static Target CONTINUE_REGISTER_BUTTON = Target.the("Continue register button").located(AppiumBy.xpath("//android.widget.Button[@content-desc=\"CONTINUAR\"]"));

}
