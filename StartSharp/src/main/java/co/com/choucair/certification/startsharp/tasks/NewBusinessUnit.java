package co.com.choucair.certification.startsharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.startsharp.userinterfaces.BusinessUnitPage.*;
import static co.com.choucair.certification.startsharp.userinterfaces.HomePage.*;
import static co.com.choucair.certification.startsharp.utils.Constants.NAMEUNIT;

public class NewBusinessUnit implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SPAN_MENU_ORGANIZATION),
                Click.on(SPAN_OPT_MENU_ORGANIZATION_BUSINEESS),
                WaitUntil.the(BTN_NEW_BUSINESS, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_NEW_BUSINESS),
                WaitUntil.the(INP_NAME, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(NAMEUNIT).into(INP_NAME),
                Click.on(SLC_PARENT_UNIT),
                Click.on(LI_OPT_PARENT_UNIT),
                Click.on(BTN_SAVE_BUSINESS)
                );
    }
    public static NewBusinessUnit newBusinessUnit(){
        return Tasks.instrumented(NewBusinessUnit.class);
    }
}
