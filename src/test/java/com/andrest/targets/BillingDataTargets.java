package com.andrest.targets;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class BillingDataTargets {

    public static Target CREDIT_CARD_BUTTON = Target.the("Credit cart").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"Tarjeta crédito/débito\"]"));
    public static Target TITLE_CARDS = Target.the("Title card").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"Tarjeta crédito/débito\"]"));
    public static Target CARD_NAME_INPUT = Target.the("Card name").located(AppiumBy.xpath( "//android.view.View[4]/android.widget.EditText[1]"));
    public static Target CARD_NUMBER_INPUT = Target.the("Card number").located(AppiumBy.xpath( "//android.view.View[4]/android.widget.EditText[2]"));
    public static Target CARD_EXPIRATION_INPUT = Target.the("Card expiration").located(AppiumBy.xpath( "//android.view.View[4]/android.widget.EditText[3]"));
    public static Target CARD_CVV_INPUT = Target.the("Card cvv").located(AppiumBy.xpath( "//android.view.View[4]/android.widget.EditText[4]"));
    public static Target PAY_BUTTON = Target.the("Pay button").located(AppiumBy.xpath( "//android.widget.Button[@content-desc=\"PAGAR\"]"));
    public static Target QR_CODE = Target.the("QR CODE").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"qr code\"]"));
    public static Target PAGE_RESUME = Target.the("Page resume").located(AppiumBy.xpath( "//android.view.View[5]"));
    public static Target BUTTON_FINISH = Target.the("button finish").located(AppiumBy.xpath( "//android.widget.Button[@content-desc=\"FINALIZAR\"]"));
}
