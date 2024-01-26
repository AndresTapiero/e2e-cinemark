package com.andrest.targets;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BillingDataTargets {

    public static Target CREDIT_CARD_BUTTON = Target.the("Credit cart").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"Tarjeta crédito/débito\"]"));
    public static Target WANT_TO_SAVE = Target.the("Title want to save").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"Quiero guardar esta tarjeta para mi próxima compra\"]"));
    public static Target CARD_NAME_INPUT = Target.the("Card name").located(By.xpath( "//android.view.View[4]/android.widget.EditText[1]"));
    public static Target CARD_NUMBER_INPUT = Target.the("Card number").located(By.xpath( "//android.view.View[4]/android.widget.EditText[2]"));
    public static Target CARD_EXPIRATION_INPUT = Target.the("Card expiration").located(AppiumBy.xpath( "//android.view.View[4]/android.widget.EditText[3]"));
    public static Target CARD_CVV_INPUT = Target.the("Card cvv").located(AppiumBy.xpath( "//android.view.View[4]/android.widget.EditText[4]"));
    public static Target PAY_BUTTON = Target.the("Pay button").located(AppiumBy.xpath( "//android.widget.Button[@content-desc=\"PAGAR\"]"));
    public static Target QR_CODE = Target.the("QR CODE").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"qr code\"]"));
    public static Target PAGE_RESUME = Target.the("Page resume").located(AppiumBy.xpath( "//android.view.View[5]"));
    public static Target SAVED_CARDS = Target.the("Saved card").located(AppiumBy.xpath( "//android.view.View[@content-desc=\"Tarjetas guardadas\"]"));
    public static Target VISA_CARD = Target.the("Visa card").located(AppiumBy.xpath( "//android.widget.ImageView[contains(@content-desc, \"9251\")]"));
    public static Target VISA_CVV_INPUT = Target.the("Visa cvv input").located(AppiumBy.xpath( "//android.widget.ImageView[contains(@content-desc, \"9251\")]/android.widget.EditText"));
    public static Target BUTTON_FINISH = Target.the("button finish").located(AppiumBy.xpath( "//android.widget.Button[@content-desc=\"FINALIZAR\"]"));
}
