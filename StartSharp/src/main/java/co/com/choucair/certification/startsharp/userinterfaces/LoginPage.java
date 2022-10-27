package co.com.choucair.certification.startsharp.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public LoginPage() {}

    public static final Target INP_USER_NAME = Target.the("User Name").
            locatedBy("//input[@id='LoginPanel0_Username']");

    public static final Target INP_PASSWORD = Target.the("Fiel Password").
            locatedBy("//input[@id='LoginPanel0_Password']");

    public static final Target BTN_SIGN_IN = Target.the("Button Sign in").
            locatedBy("//button[@id='LoginPanel0_LoginButton']");
}
