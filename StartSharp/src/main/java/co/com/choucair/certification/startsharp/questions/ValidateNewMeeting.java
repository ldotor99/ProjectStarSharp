package co.com.choucair.certification.startsharp.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateNewMeeting implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.recall("status");
    }

    public static ValidateNewMeeting validateNewMeeting(){
        return new ValidateNewMeeting();
    }
}
