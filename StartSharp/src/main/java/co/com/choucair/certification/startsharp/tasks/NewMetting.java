package co.com.choucair.certification.startsharp.tasks;

import co.com.choucair.certification.startsharp.models.MeetingData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.choucair.certification.startsharp.userinterfaces.HomePage.*;
import static co.com.choucair.certification.startsharp.userinterfaces.MeetingPage.*;
import static co.com.choucair.certification.startsharp.utils.Constants.NAMEUNIT;

public class NewMetting implements Task {

    final List<MeetingData> meetingDataList;
    public boolean  status=false;

    public NewMetting(List<MeetingData> meetingDataList) {
        this.meetingDataList = meetingDataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SPAN_MENU_MEETING, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(SPAN_MENU_MEETING),
                Click.on(SPAN_OPT_MENU_MEETING_MEETING),
                WaitUntil.the(BTN_NEW_MEETING, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_NEW_MEETING),
                Enter.theValue(meetingDataList.get(0).getName()).into(INP_MEETING_NAME),
                Enter.theValue(meetingDataList.get(0).getNumber()).into(INP_MEETING_NUMBER),
                Click.on(INP_MEETING_TYPE),
                Click.on(LI_MEETING_TYPE),
                Click.on(SLC_MEETING_LOCATION),
                Click.on(UL_OPT_MEETING.of(String.valueOf(meetingDataList.get(0).getLocation()))),
                Click.on(SLC_TIME_START),
                Click.on(OPT_TIME_START.of(String.valueOf(meetingDataList.get(0).getTimeStart()))),
                Click.on(SLC_TIME_END),
                Click.on(OPT_TIME_END.of(String.valueOf(meetingDataList.get(0).getTimeEnd()))),
                Click.on(SLC_MEETING_ORGANIZED_BY),
                Click.on(UL_OPT_MEETING.of(String.valueOf(meetingDataList.get(0).getOrganizedBy()))),
                Click.on(SLC_MEETING_REPORTER),
                Click.on(UL_OPT_MEETING.of(String.valueOf(meetingDataList.get(0).getReporter()))),
                Click.on(SLC_MEETING_ATTENDEE),
                Click.on(UL_OPT_MEETING.of(String.valueOf(meetingDataList.get(0).getAttendeeList()))),
                Click.on(SLC_MEETING_UNIT),
                Enter.theValue(NAMEUNIT).into(INP_MEETING),
                Click.on(SLC_OPT_MEETING),
                Click.on(SLC_OPT_ATTENDEE_TYPE),
                Click.on(UL_OPT_MEETING_ATTENDEE_TYPE.of(String.valueOf(meetingDataList.get(0).getAttendeeType()))),
                Click.on(SLC_OPT_ATTENDEE_STATUS),
                Click.on(UL_OPT_MEETING_ATTENDEE_STATUS.of(String.valueOf(meetingDataList.get(0).getAttendeeStatus()))),
                Click.on(BTN_CALENDAR_START),
                Click.on(SLC_DAY_CALENDAR),
                Click.on(BTN_CALENDAR_END),
                Click.on(SLC_DAY_CALENDAR),
                Click.on(BTN_SAVE_MEETING)
        );

        status = (LIST_MEETING.of(String.valueOf(meetingDataList.get(0).getName()))).resolveFor(actor).isPresent();
        actor.remember("status",status);
    }
    public static NewMetting newMetting(List<MeetingData> meetingDataList){
        return Tasks.instrumented(NewMetting.class, meetingDataList);
    }
}
