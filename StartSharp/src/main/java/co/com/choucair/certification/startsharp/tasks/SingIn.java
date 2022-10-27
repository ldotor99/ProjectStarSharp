package co.com.choucair.certification.startsharp.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucair.certification.startsharp.userinterfaces.HomePage.*;
import static co.com.choucair.certification.startsharp.userinterfaces.LoginPage.*;
import static co.com.choucair.certification.startsharp.utils.Constants.*;

public class SingIn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INP_USER_NAME, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds(),
                Enter.theValue(USERLOGIN).into(INP_USER_NAME),
                Enter.theValue(PASSWORDLOGIN).into(INP_PASSWORD),
                Click.on(BTN_SIGN_IN),
                WaitUntil.the(SPAN_MENU_ORGANIZATION, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds()
        );
    }
    public static SingIn singIn(){
        return Tasks.instrumented(SingIn.class);
    }
}
