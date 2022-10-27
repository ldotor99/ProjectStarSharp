package co.com.choucair.certification.startsharp.stepdefinitions;

import co.com.choucair.certification.startsharp.models.MeetingData;
import co.com.choucair.certification.startsharp.questions.ValidateNewMeeting;
import co.com.choucair.certification.startsharp.tasks.NewBusinessUnit;
import co.com.choucair.certification.startsharp.tasks.NewMetting;
import co.com.choucair.certification.startsharp.tasks.SingIn;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.regex.Matcher;

public class NewMeetingStepDefinition {
    @Managed(driver = "chrome")
    protected WebDriver browser;

    @Before
    public void configurar(){
        WebDriverManager.chromedriver().setup();
        OnStage.setTheStage(new Cast());
        OnStage.theActorCalled("Usuario");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(browser));
    }

    @Given("The user enters the page and logs in")
    public void theUserEntersThePageAndLogsIn() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://serenity.is/demo/Account/Login/?ReturnUrl=%2Fdemo%2F"));
        OnStage.theActorInTheSpotlight().attemptsTo(SingIn.singIn());
    }

    @When("The user creates a new business unit")
    public void theUserCreatesANewBusinessUnit() {
        OnStage.theActorInTheSpotlight().attemptsTo(NewBusinessUnit.newBusinessUnit());
    }

    @When("^the user creates a new meeting with the business unit he created$")
    public void theUserCreatesANewMeetingWithTheBusinessUnitHeCreated(List<MeetingData> meetingDataList) {
        OnStage.theActorInTheSpotlight().attemptsTo(NewMetting.newMetting(meetingDataList));
    }


    @Then("The user validates that the meeting was created")
    public void theUserValidatesThatTheMeetingWasCreated() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateNewMeeting.validateNewMeeting(), Matchers.is(true)));
    }
}
