package co.com.choucair.certification.startsharp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public HomePage() {}

    public static final Target SPAN_MENU_ORGANIZATION = Target.the( "Organization option in the menu pro feature").
            locatedBy("//ul[@id='nav_menu1_3']/li/a/span[contains (text(), 'Organization')]");

    public static final Target SPAN_MENU_MEETING = Target.the( "Meeting option in the menu pro feature").
            locatedBy("//ul[@id='nav_menu1_3']/li/a/span[contains (text(), 'Meeting')]");

    public static final Target SPAN_OPT_MENU_ORGANIZATION_BUSINEESS = Target.the( "Option business units from the options of organization menu pro feature").
            locatedBy("//ul[@id='nav_menu1_3_1']/li/a/span[contains (text(), 'Business Units')]");

    public static final Target SPAN_OPT_MENU_MEETING_MEETING = Target.the( "Option meetings from the options of meeting menu pro feature").
            locatedBy("//ul[@id='nav_menu1_3_2']/li/a/span[contains (text(), 'Meetings')]");

    public static final Target LIST_MEETING = Target.the( "List of scheduled meetings").
            locatedBy("//div[@class='grid-canvas']/div/div/a[contains (text(), '{0}')]");
}
