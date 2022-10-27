package co.com.choucair.certification.startsharp.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MeetingPage {

    public MeetingPage() {}

    public static final Target BTN_NEW_MEETING = Target.the( "Button new meeting").
            locatedBy("//div[@class='tool-button add-button icon-tool-button']");

    public static final Target INP_MEETING_NAME = Target.the( "Meeting name").
            locatedBy("//input[@name='MeetingName']");

    public static final Target INP_MEETING_TYPE = Target.the( "Meeting type").
            locatedBy("//div[@class='select2-container select2-allowclear editor s-Serenity-LookupEditor s-LookupEditor has-inplace-button required']");

    public static final Target LI_MEETING_TYPE = Target.the( "Option meeting type").
            locatedBy("(//ul[@class='select2-results']/li)[5]");

    public static final Target INP_MEETING_NUMBER = Target.the( "Meeting number").
            locatedBy("//input[@name='MeetingNumber']");

    public static final Target BTN_CALENDAR_START = Target.the( "Button to choose the date in the initial calendar").
            locatedBy("//div[@class='field StartDate col-sm-6']/button");

    public static final Target SLC_TIME_START = Target.the( "Select start time").
            locatedBy("//div[@class='field StartDate col-sm-6']/select");

    public static final Target OPT_TIME_START = Target.the( "Select a option start time").
            locatedBy("//div[@class='field StartDate col-sm-6']/select/option[contains (text(), '{0}')]");

    public static final Target BTN_CALENDAR_END = Target.the( "Button to choose the date in the final calendar").
            locatedBy("//div[@class='field EndDate col-sm-6']/button");

    public static final Target SLC_TIME_END = Target.the( "Select end time").
            locatedBy("//div[@class='field EndDate col-sm-6']/select");

    public static final Target OPT_TIME_END = Target.the( "Select a option end time").
            locatedBy("//div[@class='field EndDate col-sm-6']/select/option[contains (text(), '{0}')]");

    public static final Target SLC_MEETING_LOCATION = Target.the( "Select location meeting").
            locatedBy("(//a[@class='select2-choice select2-default'])[6]");

    public static final Target SLC_MEETING_UNIT = Target.the( "Select unit meeting").
            locatedBy("//div[@class='field UnitId col-sm-6']/div");

    public static final Target INP_MEETING = Target.the( "Field to enter and search the list").
            locatedBy("//input[@id='s2id_autogen8_search']");

    public static final Target SLC_OPT_MEETING = Target.the( "Select option unit meeting").
            locatedBy("(//ul[@class='select2-results']/li)[1]");

    public static final Target SLC_MEETING_ORGANIZED_BY = Target.the( "Select organizaed by  meeting").
            locatedBy("//div[@class='field OrganizerContactId col-sm-6']/div");

    public static final Target SLC_MEETING_REPORTER = Target.the( "Select reporter meeting").
            locatedBy("//div[@class='field ReporterContactId col-sm-6']/div");

    public static final Target SLC_MEETING_ATTENDEE = Target.the( "Select attendee list meeting").
            locatedBy("//div[@id='s2id_autogen11']");

    public static final Target SLC_OPT_ATTENDEE_TYPE = Target.the( "Select option attendee type").
            locatedBy("(//div[@class='grid-canvas']/div/div/select)[1]");

    public static final Target SLC_OPT_ATTENDEE_STATUS = Target.the( "Select option attendee type").
            locatedBy("(//div[@class='grid-canvas']/div/div/select)[2]");

    public static final Target UL_OPT_MEETING = Target.the( "Select option meeting").
            locatedBy("//ul[@class='select2-results']/li/div[contains (text(), '{0}')]");

    public static final Target UL_OPT_MEETING_ATTENDEE_TYPE = Target.the( "Select option attendee meeting").
            locatedBy("//div[@class='slick-cell l2 r2']/select/option[contains (text(), '{0}')]");

    public static final Target UL_OPT_MEETING_ATTENDEE_STATUS = Target.the( "Select option attendee meeting").
            locatedBy("//div[@class='slick-cell l3 r3']/select/option[contains (text(), '{0}')]");

    public static final Target SLC_DAY_CALENDAR = Target.the( "Select day calendar").
            locatedBy("(//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[contains (text(), '15')])[1]");

    public static final Target BTN_SAVE_MEETING = Target.the( "Button save meeting").
            locatedBy("//div[@class='tool-button save-and-close-button icon-tool-button']");
}
