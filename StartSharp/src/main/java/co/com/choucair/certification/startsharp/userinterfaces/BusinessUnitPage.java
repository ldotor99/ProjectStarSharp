package co.com.choucair.certification.startsharp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BusinessUnitPage {

    public BusinessUnitPage() {}

    public static final Target BTN_NEW_BUSINESS = Target.the( "Button new  business unit").
            locatedBy("//div[@class='tool-button add-button icon-tool-button']");

    public static final Target INP_NAME = Target.the( "Name business unit").
            locatedBy("//input[@id='Serenity_Pro_Organization_BusinessUnitDialog3_Name']");

    public static final Target SLC_PARENT_UNIT = Target.the( "Select for parent business unit").
            locatedBy("//span[@id='select2-chosen-1']");

    public static final Target LI_OPT_PARENT_UNIT = Target.the( "Option of select for parent business unit").
            locatedBy("(//ul[@id='select2-results-1']/li)[4]");

    public static final Target BTN_SAVE_BUSINESS = Target.the( "Button save business unit").
            locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");

}
