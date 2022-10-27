package co.com.choucair.certification.startsharp.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/newmeeting.feature",
        glue = "co.com.choucair.certification.startsharp.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class NewMeetingRunner {

}
